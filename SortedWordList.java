package Project2.java;

import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortedWordList extends WordList{ 
	public SortedWordList() {
		super();
	}
	
	public void add(Word WordGiven) { //add method to insert Word into the list in a sorted position
		if(length==0) { //if its the first word entered in the list
			first.next=new ListNode(WordGiven); //create a new node with the given word in it
			length++; 
			return; //end the program since you placed the given word
		}
		length++; 
		ListNode t1=first; //create a ListNode pointer that points to the first node to keep track of positions
		ListNode t2=first.next; //create another pointer that points to the next node after first to keep track of positions
		ListNode newNode=new ListNode(WordGiven);  //create a new node for the given word
		while (t1.next!=null) { //while loop until there are no more elements in the list(when t1s pointer points to null)
			if (WordGiven.compareTo(t2.data)>0) { //compare if the given word is farther in the alphabet than the data in the node that t2 points to
				t1=t1.next; //then move each pointer over a node to continue checking
				t2=t2.next;
			} else { //if the given word is before that data in the alphabet 
				t1.next=newNode; //point t1 to a new node
				newNode.next=t2;  //point new node to t2 
				return; 
			}
		}
		if (t2==null) { //if we reach the end without placing the word
			t1.next=newNode; //point t1 to a new node
		}
	}
	
}
		