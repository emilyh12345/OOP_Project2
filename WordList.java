package Project2.java;

public class WordList { //create WordList class 
	protected ListNode first; 
	private ListNode last; 
	protected int length;
	   
	public WordList () { 
		ListNode ln = new ListNode(null); //create first dummy node
	    first = ln; //make first point to the dummy node to start
	    last = ln; //make last point to the dummy node to start
	    length = 0;
	}
	public void append (String s) { //append method to add a word to the string
		ListNode n = new ListNode(new Word(s)); //data in the node is a new Word object
	    last.next = n;
	    last = n;
	    length++;
	   }
	public LinkedListIterator reset()   { 
		return new LinkedListIterator(first.next); //moves the iterator to point to the next node after the first to iterate through the list 
	   }
}