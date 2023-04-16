package Constructor;

public class Block {
	static
	{
		System.out.println("Static block is running.");
	}
	
	{
		System.out.println("Non-static block is running.");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Main block is running.");
		Block a= new Block();
	}

}
