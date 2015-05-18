
#JSON Rest API Client

This is a java client for getting or adding data to a JSON RESTful api.
Is also working on android.

##**How to start**

 1. Add the Context.java and HttpHelper class to your project.
 2. Import the GSON library. You can do this manually by adding the jar https://code.google.com/p/google-gson/downloads/detail?name=google-gson-2.2.4-release.zip& or by maven:
```xml
<dependency>
    	<groupId>com.google.code.gson</groupId>
    	<artifactId>gson</artifactId>
    	<version>1.7.2</version>
    </dependency>
```
 Or gradle

   compile 'com.google.code.gson:gson:1.7.2'

 3. If you're using android don't forget to add the internet permission.
  `<uses-permission android:name="android.permission.INTERNET" /> `

That's all!
In this example i've used this free jokes api
http://www.icndb.com/api/
And made the java objects with this tool
http://pojo.sodhanalibrary.com/Convert

In other words when I do a GET request to
http://api.icndb.com/jokes/random
I will get a random joke json , such as

```javascript
{
  type: "success",
  value: {
    id: 534,
    joke: "Chuck Norris is the ultimate mutex, all threads fear him.",
    categories: [
      "nerdy"
    ]
  }
}
```

To get a random joke i only have to create a instance of the Context class

    Context context=new Context();
	
And now I will set the root url of it.

    context.setRoot("http://api.icndb.com/");
You're now ready.

To do requests use context.doGetRequest, doPostRequest, doDeleteRequest, and doPutRequest.
For post, delete and put methods you also have a parameter to set a body for the request.

For this example we are going to do a simple get request

    Joke joke=context.doGetRequest("jokes/random", Joke.class);

This is all. :)


