package Package2;
 import Package1.ClassA;

public class ClassD extends ClassA {
	
	public static void main(String[] args) // using inheritance
	{
		ClassD x= new ClassD();
		System.out.println(x.a); //public variable of classA
		System.out.println(x.c); //protected variable of classA is accessible with the help of Inheritance
	}

}
