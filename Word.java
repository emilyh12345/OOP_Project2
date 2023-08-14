package Project2.java;

public class Word { //creates Word class
	private String WordGiven;
	public Word (String s) { //creates constructor
		WordGiven=s;
	}
	public void setWord(String s) { 
		WordGiven=s;
	}
	public String getWord() { 
		return WordGiven;
	}
	public boolean equals(Object other) { //equals method compares 2 strings to see if theyre equal
		return  (other!=null && getClass() == other.getClass() && WordGiven.equals(((Word) other).WordGiven));
	}
	public int compareTo(Word other) { //compare function to compare word to another word
		return WordGiven.compareTo(other.toString());
	}
	public String toString() { //toString method to convert given Word into a string
		return WordGiven; 
	}
}
