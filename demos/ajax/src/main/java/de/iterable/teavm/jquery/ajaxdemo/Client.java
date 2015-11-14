package de.iterable.teavm.jquery.ajaxdemo;

import static de.iterable.teavm.jquery.ajax.JQueryAjaxRequestMethod.POST;

import org.teavm.jso.browser.Window;
import org.teavm.jso.dom.html.HTMLDocument;
import org.teavm.jso.dom.html.HTMLElement;

import de.iterable.teavm.jquery.ajax.JQueryAjaxSettings;
import de.iterable.teavm.jso.browser.Console;

public class Client {

    public static void main(String[] args) {
        HTMLDocument document = HTMLDocument.current();
        HTMLElement div = document.createElement("div");
        JQueryAjaxSettings settings = //
        JQueryAjaxSettings.url("http://localhost:8080/app/hello")
                          .method(POST)
                          .data(b -> {
                              b.with("a", 1)
                               .with("b", 2)
                               .with("c", 3);
                          })
                          .statusCode(b -> {
                              b.handler(404, () -> {
                                  Window.alert("404");
                              });
                          });
        Console.log(settings.build());

        settings.send()
                .then((data, textStatus, jqXHR) -> {
                    Window.alert("Done");
                });

    }

}
