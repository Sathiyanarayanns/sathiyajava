package javaclass;
import java.util.Scanner;

import org.omg.CORBA.portable.ValueBase;


public class Str {
	
	

	public static void main (String [] args)
	{
		Scanner in = new Scanner (System.in);
		System.out.println("enter name");
		String s;
		s=in.nextLine(); 
		
	//String s="java";
	String rs="";
	
	for(int i=s.length()-1;i>=0;i--){
	s.charAt(i);	
	rs=rs+s.charAt(i);
	}
	System.out.println("rs="+rs);
	
	if(rs.equals(s)){
	    System.out.println("yes its palindrome"+rs);
		}
	else{
		System.out.println("no");
	}
	
	}}
			
		 
		
/*		String b=new String ("muthu");
		
		String c=new String ("muthu");
		//System.out.println(b==c);
		
		String k="muthu";
		String l="muthu";
		char[] j=k.chartoCharArray();
		//System.out.println(j);
		char temp[] = {'0','q'};
		int begin =0;
		int end=j.length-1;
		while (end>begin)
		{
			temp[begin]=j[begin];
	j[begin]=j[end];
	j[end]=temp[begin];
	end--;
	begin++;
			
		
		}
		System.out.println(j);		
		
			
	//	String c=new String ();
		
		
		
	}

*/
