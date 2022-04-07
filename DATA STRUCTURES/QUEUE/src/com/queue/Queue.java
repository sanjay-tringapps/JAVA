package com.queue;
import java.util.LinkedList;
import java.util.Scanner;
public class Queue
{
   static LinkedList<String> queue = new LinkedList<String>();
   public static void main(String[] args)
   {
	   Scanner s=new Scanner(System.in);
	   System.out.println("QUEUE");
	   while(true)
	   {
		   System.out.println(" 1 - ENQUEUE \n 2 - DEQUEUE \n 3 - PEEK \n 4 - DISPLAY \n 5 - EXIT");
		   System.out.print("ENTER:");
		   int choice=s.nextInt();
	           if(choice==5)
	           {
	    	    System.out.println("BYE!!!");
	    	    break;
	          }
		   switch(choice)
		   {
		     case 1:
		    	 System.out.print("ENTER THE DATA:");
		  	 String value=s.next();
		    	 enqueue(value);
		    	 break;
		     case 2:
		    	 dequeue();
		    	 break;
		     case 3:
		    	 peek();
		    	 break;
		     case 4:
		    	 print();
		    	 break;
		     default:
		    	 System.out.println("GIVE CORRECT CHOICE");
		    	 break;
		   }
	   }
   }
   
   public static void enqueue(String value)    //adding values
   {
	   queue.add(value);
   }
   
   public static void dequeue()               // deleting first value in queue
   {
	   if(queue.size()==0)
	   {
		   System.out.println("QUEUE EMPTY");
		   return;
	   }
	   queue.removeFirst();
   }
   
   public static void peek()                 //printing first value
   {
	   if(queue.size()==0)
	   {
		   System.out.println("QUEUE EMPTY");
		   return;
	   }
	   
	   System.out.println(queue.getFirst());

   }
   
   public static void print()
   {
	   if(queue.size()==0)
	   {
		   System.out.println("QUEUE EMPTY");
		   return;
	   }
	   for(int i=0;i<queue.size();i++)
	   {
		   System.out.println(queue.get(i));
	   }
   }
}
