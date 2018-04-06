package javaclass;

public class ElectronicShop1 {
	public static void main(String args[]){
		Customeres customre1=new Customeres(9941970833);
		
	}

}


class Customeres{
	  int x,y;
	     Customeres(char name,long mobileno){
	    	 x=name;
	    	 y=mobileno; 
	    System.out.println("name=" +"name" + " mobile no.="+mobileno);
	}
}