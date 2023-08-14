package Project2.java;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;
import javax.swing.JFrame; 

public class WordGUI{
	static JFrame myFrame;
	static Container cPane; //declare container which belongs to myFrame JFrame 
	static TextArea aBox, eBox, iBox, oBox, uBox, otherBox; //declare 6 text areas for receiving different words

	public WordGUI(SortedWordList list) { //create constructor WordGUI to display the code which takes in the sorted list
		initialize(); 
		readWordsFromList(list); //read words from the already sorted list
	}

	public static void initialize() { //GUI constructed from a JFrame 
		aBox=new TextArea(); //create new text areas for the different words first letters
		eBox=new TextArea(); 
		iBox=new TextArea();
		oBox=new TextArea();
		uBox=new TextArea();
		otherBox=new TextArea(); 
		myFrame=new JFrame();
		myFrame.setSize(400, 400); //set frame size so all boxes fit in it
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //JFrame will be exited
		myFrame.setVisible(true);
	}

	public static void readWordsFromList(SortedWordList list) { //used to read numbers line by line from sorted list
		myFrame.setLayout(new GridLayout(2,3)); //divide myFrame into 2 rows and 3 columns so each word can go into its correct box
		cPane = myFrame.getContentPane(); 
		cPane.add(aBox); //adds the aBox text area to the top left content pane of the JFrame, where words starting with a or A will be placed
		cPane.add(eBox); //adds the eBox text area to the next content pane of the JFrame(top middle box), where words starting with e or E will be placed
		cPane.add(iBox); //adds the iBox text area to the content pane of the JFrame(top right box), where words starting with i or I will be placed
		cPane.add(oBox); //adds the oBox text area to the content pane of the JFrame(bottom left box), where words starting with o or O will be placed
		cPane.add(uBox); //adds the uBox text area to the content pane of the JFrame(bottom middle box), where words starting with u or U will be placed
		cPane.add(otherBox); //adds the otherBox text area to the content pane of the JFrame(bottom right box, where the line starting with anything other than a,e,i,o,u will be placed
		LinkedListIterator it=list.reset(); //reset the list iterator 
		while(it.hasNext()) { //while there is another node in the list, iterate through the list
			String myString=it.next(); //moves pointer to next
			if (myString.charAt(0)=='a' || myString.charAt(0)=='A') aBox.append(myString+"\n"); //if that node? first letter is an A or a append it to aBox area
			else if (myString.charAt(0)=='e' || myString.charAt(0)=='E') eBox.append(myString+"\n"); //if that words first letter is an E or e append it to eBox area
			else if (myString.charAt(0)=='i' || myString.charAt(0)=='I') iBox.append(myString+"\n"); //if that words first letter is an I or i append it to iBox area
			else if (myString.charAt(0)=='o' || myString.charAt(0)=='O') oBox.append(myString+"\n"); //if that words first letter is an O or o append it to oBox area
			else if (myString.charAt(0)=='u' || myString.charAt(0)=='U') uBox.append(myString+"\n"); //if that words first letter is an U or u append it to uBox area
			else otherBox.append(myString+"\n");  //if that words first letter isn't an capital or lowercase a,e,i,o, or u append it to otherBox area
		}
		myFrame.setVisible(true); //JFrame made visible since the JFrame was invisible when initialized
	}
}