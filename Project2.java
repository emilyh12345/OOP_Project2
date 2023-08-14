package Project2.java;

import java.util.LinkedList;
import Project2.*;

public class Project2 {
	
	public static void main(String[] args) { 
		SortedWordList list=new SortedWordList(); //create a sorted word list
		TextFileInput inFile=new TextFileInput("input.txt");
		String line=inFile.readLine();
		while (line!=null) {
			list.add(new Word(line)); //instanciate a new word called line to add to the list
			line=inFile.readLine(); //go to next line to continue inserting into sorted list
		}
		inFile.close();
		new WordGUI(list); //creates a new GUI to display the list in
	}
	
}
		