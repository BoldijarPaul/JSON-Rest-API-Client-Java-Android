package example;

import context.Context;

public class Main {
	public static void main(String[] args) {
			
		/* initialize a Context instance and set the root url */
		Context context=new Context();
		context.setRoot("http://api.icndb.com/");
		
		for(int i=1; i<=10; i++){
			/* request for a new joke */
			Joke joke=context.doGetRequest("jokes/random", Joke.class);
			
			System.out.println(joke.getValue().getJoke());
			System.out.println("\n\n");
		}
	}
}
