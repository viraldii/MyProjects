
public class Strings {
	public static void main (String[]args) {
		
		//String are objects on there own, giving them Object properties like getting their lenght.
		String gibberish = "naslkknfenokclk ceqwklc sa";
		System.out.println("This is gibberish: " + gibberish.length());
		
		//You can upper and lower case Strings
		String welcome = "Hello World";
		
		//Normal outcome
		System.out.println(welcome);
		
		//String made in Upper case
		System.out.println(welcome.toUpperCase());
		
		//String made in Lower case
		System.out.println(welcome.toLowerCase());
		
		//Finding location of values in strings
		System.out.println(welcome.indexOf("world"));
		
		//You can print strings.
		System.out.println(welcome + " This is gibberish:" + gibberish);
		
		
	}
}
