package com.stack;
import java.util.LinkedList;
import java.util.Scanner;
public class Stack
{
   static LinkedList<String> stack = new LinkedList<String>();  //storing stack values using linked list
   public static void main(String[] args)
   {
	   Scanner s=new Scanner(System.in);
	   System.out.println("STACK");
	   while(true)
	   {
		   System.out.println(" 1 - PUSH \n 2 - POP \n 3 - PEEK \n 4 - DISPLAY \n 5 - EXIT");
		   System.out.print("ENTER:");
		   int choice=s.nextInt();
		   switch(choice)
		   {
		     case 1:
		    	 System.out.print("ENTER THE DATA:");
		  	     String value=s.next();
		    	     push(value);
		    	 
		    	 break;
		     case 2:
		    	 pop();
		    	 break;
		     case 3:
		    	 peek();
		    	 break;
		     case 4:
		    	 print();
		    	 break;
		     case 5:
		    	 System.out.println("BYE!!!");
		    	 break;
		     default:
		    	 System.out.println("GIVE CORRECT CHOICE");
		    	 break;
		   }
		   
		   
	   }
   }
   
   public static void push(String value)   // adding data in stack
   {
	   stack.add(value);
   }
   
   public static void pop()               // deleting last data in stack
   {
	   if(stack.size()==0)
	   {
		   System.out.println("STACK EMPTY");
		   return;
	   }
	   stack.removeLast();
   }
   
   public static void peek()             // printing the last data in stack
   {
	   if(stack.size()==0)
	   {
		   System.out.println("STACK EMPTY");
		   return;
	   }
	   
	   System.out.println(stack.getLast());

   }
   
   public static void print()
   {
	   if(stack.size()==0)
	   {
		   System.out.println("STACK EMPTY");
		   return;
	   }
	   
	   for(int i=0;i<stack.size();i++)
	   {
		   System.out.println(stack.get(i));
	   }
   }
}
