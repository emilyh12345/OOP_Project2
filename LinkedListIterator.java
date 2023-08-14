package Project2.java;

public class LinkedListIterator { //got this from blackboard under linked lists(Lord notes)-create an iterator to iterate through the linked list
	   private ListNode node; 
	   public LinkedListIterator(ListNode first)  {
		   node = first;
	   }
	   
	   public boolean hasNext()  {
		   return ( node != null );
	   }
	   
	   public String next()  {
		   if ( node == null )
			   throw new NullPointerException("Linked list empty.");
		   Word currentWord = node.data; //make word the data in the node
		   node = node.next; //move node to the next node
		   return currentWord.toString(); 
	   }
}
