package com.engg;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		printMessage();
	}

	public static String getMessage() {

		//feat-02
		String str = "Feature 02";
		return "Hello reviewer! This is : " + str;
	}

	public static void printMessage() {
		System.out.println(getMessage());
	}

	public boolean isEvenNumber(int number){

		boolean result = false;
		if(number%2 == 0){
			result = true;
		}
		return result;
	}
}
