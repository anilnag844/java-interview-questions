package javainterviewquestions;

public class ReversestringbyCHARACTERS {

	public static void main(String[] args) {
		// Using treditonal approach
		String result="Anil Kumar Nag";
	    for (int i=result.length()-1; i>=0; i--) {
	        result = result + result.charAt(i);
	    }
	    System.out.println(result);

	    // 1) Using StringBuffer class
	    StringBuffer buffer = new StringBuffer(result);
	    System.out.println(buffer.reverse());  
	    // 2) Using iterative method
	    String str = "MyJava";
	    
	    char[] strArray = str.toCharArray();
	     
	    for (int i = strArray.length - 1; i >= 0; i--)
	    {
	        System.out.print(strArray[i]);     //Output : avaJyM
	    }
	    
	   // 3) Using recursive method.
	    
	}

}
