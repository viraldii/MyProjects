
public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		// First we type cast by widening which is done automatically.
		int myInt = 10;
		double myDouble = myInt;
		
		System.out.println(myDouble);
		
		//Narrowing a variable can be done buy manually.
		double myDouble2 = 20.50;
		int myInt2 = (int) myDouble2;
		
		System.out.println(myInt2);
	}

}
