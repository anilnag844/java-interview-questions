package javainterviewquestions;

public class ReversestringbyWORDS {

	public static void main(String[] args) {
		StringBuilder stringBuilder = new StringBuilder();
	    String string = "Anil Kumar Nag";
		String[] words = string.split(" ");

	    for (int j = words.length-1; j >= 0; j--) {
	        stringBuilder.append(words[j]).append(' ');
	    }
	    System.out.println("Reverse words: " + stringBuilder);
	
	}

}
