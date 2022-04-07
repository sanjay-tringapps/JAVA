package com.link;
import java.util.Scanner;
public class LinkedList {
	public static void main(String[] args)
	{
                Node head=null;
		Scanner s=new Scanner(System.in);  //using scanner class we get input
		Node temp=new Node();              //create temporary object for node class
		System.out.println("LINKED LIST");
        while(true)
        {
        	System.out.println(" 1 INSERTION \n 2 DELETION \n 3 DISPLAY \n 4 EXIT");
        	int choice=s.nextInt();
        	if(choice==4)
        	{
        		System.out.println("BYE!");
        		break;
        	}
        	switch(choice)
        	{
        	   case 1:
        		   System.out.print("ENTER THE DATA:");
                           String value=s.next();
        		   head=temp.insertion(head,value);
        		   break;
        	   case 2:
        		   System.out.print("ENTER THE INDEX POSITION:");
        		   int position=s.nextInt();
        		   head=temp.deletion(head,position);
        		   break;
        	   case 3:
        		   
        		   temp.print(head);
        		   break;
        	   default:
        		   System.out.println("ENTER CORRECT INPUT");
        		   break;
        	}
        }
	}
}
