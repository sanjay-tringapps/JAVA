package com.music;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
public class Read
{
	Clip clip;	
	AudioInputStream audioInputStream;
	static String filePath;	
	public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException
	{
		System.out.println("MUSIC PLAYER USING LINKED LIST");
		Scanner s = new Scanner(System.in);
		filePath = "src/com/music/wave/1.wav"; 
		Read audioPlayer=new Read();
		Node head=null;
		Node temp=new Node();     
		while(true)
        {
        	System.out.println(" 1 ADD MUSIC [Give local path should be wave format] \n 2 DELETE MUSIC \n 3 PLAY ALL MUSIC \n 4 PLAY RANDOM MUSIC [BASED ON POSITION] \n 5 EXIT");
        	int choice=s.nextInt();
        	if(choice==5)
        	{
        		System.out.println("BYE!");
        		break;
        	}
        	switch(choice)
        	{
        	   case 1:
        		   System.out.print("ENTER THE PATH:");
                   String value=s.next();
        		   head=temp.insertion(head,value);
        		   break;
        	   case 2:
        		   System.out.print("ENTER THE INDEX POSITION:");
        		   int position=s.nextInt();
        		   head=temp.deletion(head,position);
        		   break;
        	   case 3:
        		   audioPlayer.playall(head);
        		   break;
        	   case 4:
        		   System.out.print("ENTER THE MUSIC INDEX POSITION:");
        		   int musicposition=s.nextInt();
        		   audioPlayer.RandomMusic(head,musicposition);
        	   default:
        		   System.out.println("ENTER CORRECT INPUT");
        		   break;
        	}
        }
		
	}
	
	
	public void playall(Node head) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException
	{
		 Node current = head;    
	        if(head == null)
		    {    
	            System.out.println("LIST IS EMPTY");    
	            return;    
	        }    
	        System.out.println("THE VALUES ARE");    
	        while(current != null)
	        {    
	            //Prints each node by incrementing pointer    
	            System.out.println(current.data + " ");  
	            File f = new File(current.data);
	            if (f.exists())
	            this.playing(current.data);
	            else
	            {
	            	System.out.println("MUSIC PATH IS WRONG!!!");
	            }
	            current = current.next;    
	        }    
	}
	
	
	public void playing(String value) throws UnsupportedAudioFileException, IOException, LineUnavailableException, InterruptedException
	{
		
		audioInputStream = AudioSystem.getAudioInputStream(new File(value).getAbsoluteFile());
		clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		clip.start();
		Thread.sleep(10000);
		clip.stop();
		clip.close();
		audioInputStream.close();
		
	}
	
	public void RandomMusic(Node head,int position) throws UnsupportedAudioFileException, IOException, InterruptedException, LineUnavailableException
	{
		Node temp=head;
		if (head == null)
		{
		  System.out.println("THE LIST IS EMPTY");
		}
		
		for (int i = 0; temp != null && i < position; i++)
		{
			
	         temp = temp.next;
		}
		
		 if (temp == null)
		 {
			 System.out.println("POSTION IS MORE THAN NO OF NODES");
			 return;
		 }
		 
		 System.out.println(temp.data);
		 audioInputStream = AudioSystem.getAudioInputStream(new File(temp.data).getAbsoluteFile());
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(10000);
			clip.stop();
			clip.close();
			audioInputStream.close();
	}
}
