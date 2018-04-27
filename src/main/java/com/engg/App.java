package com.securview.engg.demo_one;

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
}
