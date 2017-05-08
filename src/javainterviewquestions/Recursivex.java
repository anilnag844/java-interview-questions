package javainterviewquestions;

public class Recursivex {

	public static void main(String[] args) {
		String str="Anil";
		 //3. Using Recursive Method
		 
		System.out.println(recursiveMethod(str));    //Output : avaJyM
    }
 
    //Recursive method to reverse string
 
    static String recursiveMethod(String str)
    {
         if ((null == str) || (str.length() <= 1))
         {
                return str;
         }
 
         return recursiveMethod(str.substring(1)) + str.charAt(0);
    }

	

}
