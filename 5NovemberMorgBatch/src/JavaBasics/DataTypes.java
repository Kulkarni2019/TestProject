package JavaBasics;

public class DataTypes {
	public static void main(String[] args)
	{
        boolean stdPass = true; // conditional data type only gives o/p in true/false
        
        byte stdMaxMarks = 100; // values from -127 to 128 use byte instead of integer to save the memory
        
        short totalMarks = 500; // value from -32768 to 32767
   
        int rollNumber = 55667; // greater than short DT range
        
        long mobileNumber = 8080654761L; // L is mandatory while using long DT
        
        double stdAvgMarks = 46.9076858745322167; // fractional upto 15 digits
        
        float stdPercentage = 78.67F; // F is mandatory
 
        char stdGrade = 'A';
        
        System.out.println(stdPass);
        System.out.println(stdMaxMarks);
        System.out.println(totalMarks);
        System.out.println(rollNumber);
        System.out.println(mobileNumber);
        System.out.println(stdAvgMarks);
        System.out.println(stdPercentage);
        System.out.println(stdGrade);

    }
}
