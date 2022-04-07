package com.example;
import java.util.*;

public class TicTacToe {
	  public static Evaluation evaluateBoard(String input) {
		  input=input.toUpperCase();
		  int xcount=0,ocount=0,correct=1;
		   char[] ch = input.toCharArray();
		  if(input.length()!=9)
		  {
			  return Evaluation.InvalidInput;
		  }
		  for(int i=0;i<input.length();i++)
		  {  
		     if(ch[i]=='X')
		         xcount++;
		     else if(ch[i]=='O')
		         ocount++;
		   }
		   int temp=Math.abs(xcount-ocount);
		   if(temp<=1){}
		   else
		   {
			   return Evaluation.UnreachableState;
		   }
		   if(correct==1)
		    return result(ch);
		   else
		   System.out.println("ENTER CORRECT INPUT");
	    return Evaluation.UnreachableState;
	  }
	  public static Evaluation result(char[] data)
	  {
		  boolean xwins = false;
		  boolean owins = false;
	    if(data[0]=='X' && data[1]=='X' && data[2]=='X')
	     xwins=true;
	    else if(data[3]=='X' && data[4]=='X' && data[5]=='X')
	    	xwins=true;
	     else if(data[6]=='X' && data[7]=='X' && data[8]=='X')
	    	 xwins=true;
	     else if(data[0]=='X' && data[3]=='X' && data[6]=='X')
	    	 xwins=true;
	     else if(data[1]=='X' && data[4]=='X' && data[7]=='X')
	    	 xwins=true;
	     else if(data[2]=='X' && data[5]=='X' && data[8]=='X')
	    	 xwins=true;
	     else if(data[0]=='X' && data[4]=='X' && data[8]=='X')
	    	 xwins=true;
	     else if(data[6]=='X' && data[4]=='X' && data[2]=='X')
	    	 xwins=true;
	     if(data[0]=='O' && data[1]=='O' && data[2]=='O')
	    	 owins=true;
	     else if(data[3]=='O' && data[4]=='O' && data[5]=='O')
	    	 owins=true;
	     else if(data[6]=='O' && data[7]=='O' && data[8]=='O')
	    	 owins=true;
	     else if(data[0]=='O' && data[3]=='O' && data[6]=='O')
	    	 owins=true;
	     else if(data[1]=='O' && data[4]=='O' && data[7]=='O')
	    	 owins=true;
	     else if(data[2]=='O' && data[5]=='O' && data[8]=='O')
	    	 owins=true;
	     else if(data[0]=='O' && data[4]=='O' && data[8]=='O')
	    	 owins=true;
	     else if(data[6]=='O' && data[4]=='O' && data[2]=='O')
	    	 owins=true;
	     if(xwins==true && owins==true)
	    	 return Evaluation.UnreachableState;
	     else if(xwins)
	    	 return Evaluation.Xwins;
	     else if(owins)
	    	 return Evaluation.Owins;
	     else
	    	 return Evaluation.NoWinner;
	  }
	  public static void main(String[] args)
	  {

		  TicTacToe ticTac = new TicTacToe();
		  System.out.println(ticTac.evaluateBoard("Oooxxx..."));
	  }
}
