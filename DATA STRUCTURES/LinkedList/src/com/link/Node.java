package com.link;
public class Node {
	String data;
	Node next;
	public Node insertion(Node head,String value)
	{
		if(head==null)
		{
			Node newNode=new Node();
			newNode.data=value;
			newNode.next=null;
			return newNode;
		}
		else
		{
			Node newNode=new Node();
			newNode.data=value;
			newNode.next=null;
			Node last=head;
			while (last.next != null)
		        last = last.next;
			last.next = newNode;
		}
		return head;
	}
	
	public Node deletion(Node head,int position)
	{
		if (head == null)
		{
		  System.out.println("THE LIST IS EMPTY");
		  return head;
		}
		 Node temp = head;
		  if (position == 0) {
	            head = temp.next; // Change head
	            return head;
	        }
		 for (int i = 0; temp != null && i < position - 1; i++)
	         temp = temp.next;
		 
		 if (temp == null || temp.next == null)
		 {
			 System.out.println("POSTION IS MORE THAN NO OF NODES");
			 return head;
		 }
		 
		 Node next = temp.next.next;
	        temp.next = next;
	        return head;
	}
	
	public void print(Node head)
	{
		 Node current = head;    
	        if(head == null)
		{    
	            System.out.println("LIST IS EMPTY");    
	            return;    
	        }    
	        System.out.println("THE VALUES ARE");    
	        while(current != null) {    
	            //Prints each node by incrementing pointer    
	            System.out.println(current.data + " ");    
	            current = current.next;    
	        }    
	}
}
