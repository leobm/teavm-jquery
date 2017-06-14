package de.iterable.teavm.jquery.ajaxdemo;

import static de.iterable.teavm.jquery.ajax.JQueryAjaxRequestMethod.POST;

import org.teavm.jso.JSObject;
import org.teavm.jso.JSProperty;
import org.teavm.jso.browser.Window;

import de.iterable.teavm.jquery.JQuery;
import de.iterable.teavm.jquery.JQueryObject;
import de.iterable.teavm.jquery.ajax.JQueryAjaxSettings;
import de.iterable.teavm.jquery.types.JQueryEventObject;
import de.iterable.teavm.jso.browser.Console;

public class Client {

	public interface Response extends JSObject {
		@JSProperty
		int getResult();
	}

	public static void main(String[] args) {
		final JQueryObject<?> $content = JQuery.by("#content");

		final Router router = new Router("/teavmjquery/");
		router.navigate();

		router.add("/products/(.*)/edit/(.*)", p -> {
			Console.log("Product ID:" + p.get(0) + "  " + "Editor ID:" + p.get(1));
		}).add("/about", p -> {
			Console.log("about");
			$content.empty();
		}).add("/home", p -> {
			Console.log("home");
			$content.empty();
		}).add("/calc", p -> {
			buildForm().submit(Client::handleFormSubmit).appendTo($content.empty());
		}).match("/products/12/edit/22").listen();

		JQuery.by("a").click(evt -> {
			router.navigate(evt.getTargetElement().getAttribute("href"));
			evt.preventDefault();
		});
	}

	private static void handleFormSubmit(JQueryEventObject evt) {
		final JQueryAjaxSettings ajaxSettings = JQueryAjaxSettings.url("http://localhost:8080/teavmjquery/api")
				.method(POST).data(JQuery.by("form").serialize()).statusCode(b -> {
					b.handler(404, () -> {
						Window.alert("404");
					});
				}).onSuccess((data, textStatus, jqXHR) -> {
					Console.log(jqXHR.getResponseJSON());
				});
		ajaxSettings.send().then((data, textStatus, jqXHR) -> {
			final Response result = jqXHR.getResponseJSON().cast();
			Window.alert("Result is:" + result.getResult());
		}).fail((jqXHR, textStatus, errorThrow) -> {
			Window.alert("ERROR:" + jqXHR.getStatusText());
		});
		evt.preventDefault();
	}

	private static JQueryObject<?> buildForm() {
		return JQuery.of("<form>")
				.append(JQuery.of("<p />").append("<label>A:</label>")
						.append("<input type=\"text\" name=\"a\" value=\"1\" />"))
				.append(JQuery.of("<p />").append("<label>B:</label>")
						.append("<input type=\"text\" name=\"b\" value=\"1\" />"))
				.append(JQuery.of("<p />").append("<label>C:</label>")
						.append("<input type=\"text\" name=\"c\" value=\"1\" />"))
				.append(JQuery.of("<p />").append("<input type=\"submit\" value=\"Ajax Calc: A+B+C\">"));
	}
}
