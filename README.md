teavm-jquery
=====
What is teavm-jquery?
--------------
teavm-jquery provides a statically typed java facade for the [teavm] to the jQuery (1.10.x / 2.0.x) library.

Example
--------------
#### JQuery Basic 
```java
 final HTMLElement h1 = document.createElement("h1");
 h1.appendChild(document.createTextNode("Hello world"));
 JQuery.create("body").append(h1).addClass("testClass");
```

#### JQuery Basic Ajax
```java
JQueryAjaxSettings settings = JQueryAjaxSettings.create();
settings.setUrl("http://localhost:8080/app/hello");
settings.setDataType(JQueryAjaxDataType.JSON);
settings.setErrorHandler(new AjaxErrorHandler() {
   @Override
   public void onError(JQueryXHR jqXHR, JSString textStatus, JSString errorThrow) {
      //Console.log("onError");
   }
});
settings.setSuccessHandler(new AjaxSuccessHandler<JSObject>() {
   @Override
   public void onSuccess(JSObject data, JSString textStatus, JQueryXHR jqXHR) {
      //Console.log("onSuccess", jqXHR);
      ServerResponseClient res = (ServerResponseClient) jqXHR.getResponseJSON();
      //Console.log(res);
   }
});
settings.setCompleteHandler(new AjaxCompleteHandler() {
   @Override
   public void onComplete(JQueryXHR jqXHR, String textStatus) {
      //Console.log("onComplete");
   }
});
```


#### Promise API

```java

public static JQueryPromise doAsyncDelay(int delay) {
	final JQueryDeferred df = JQuery.Deferred();
	setTimeout(() -> df.resolve(), delay);
	return df.promise();
}

public static void example() {
	final JQueryPromise promise = doAsyncDelay(3000);
	promise.done(data -> Console.log("Executed after a delay"));
}

```



	
   [teavm]: <http://teavm.org/>
   
