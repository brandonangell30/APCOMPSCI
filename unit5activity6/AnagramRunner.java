package unit5activity6;

public class AnagramRunner {

	public static void main(String[] args) 
	{
		String first = "dog";
		String second = "cat";
		if(Anagram.testAnagram(first,second))
			System.out.println("Anagrams!");
		else
			System.out.println("Not anagrams.");
	}

}
