package JavaBasics;

public class LogicalOperator {
	public static void main(String[] args)
	{
		// && logical AND
		System.out.println( (20>10) && (10>5) );  // true
		System.out.println(( 20>10) && (10<5) );  //false
		
		// || logical OR
		System.out.println( (12>10) || (30<13) ); //true
		System.out.println( (12<10) || (30<13) ); //false
		
		// logical NOT operator
		System.out.println(!(10==20));
		System.out.println(!(4>3));
	}

}
