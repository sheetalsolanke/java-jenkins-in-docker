package org.example1.java_jenkins_docker;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println(checkInputIsAnEvenNumber(122));
	}
	public static boolean checkInputIsAnEvenNumber(int number)
	{
		return number%2==0;
	}
}
