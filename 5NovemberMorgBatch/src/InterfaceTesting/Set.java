package InterfaceTesting;

public class Set implements Test{
	
	public void Define()
	{
      System.out.println("Define method is running");
      }
   public void Setup()
   {
	      System.out.println("Setup method is running");

   }
   
   public static void main(String[] args)
   {
	   Set x= new Set();
	   x.Define();
	   x.Setup();
   }
}
