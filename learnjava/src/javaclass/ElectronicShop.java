package javaclass;
import java.util.Scanner;
public class ElectronicShop {
	public static void main(String [] args){
		  Customer detail=new Customer();
	       detail.getdetail();	  
	       Customer discount=new Customer();
	       discount.discount();
	      Customer amount=new Customer();
	      amount.amount();
	}
}
  class Customer{
	static void getdetail(){
		
		String name="ram";
	    int phno=4542554;
	    System.out.println("name=" +name + " mobile no.="+phno);
	}
	static void discount(){
		Scanner in = new Scanner (System.in);
		System.out.println("enter 3 numbers");
		double a,b,c;
		a=in.nextInt(); 
		b=in.nextInt();
		c=in.nextInt();
		double ltdis2=7.5/100d;
		double ltdis3=10/100d;
		//double ltprice1=25000d;
		double ltdis1=5/100d;
		double ltdis=15/100d;
		double discount,discounta, discountb,discountc;
		
		if(25000<a&&a<=50000){
		    discounta=a*ltdis2;
			System.out.println("a="+discounta);
			}	
		 if(50000<b&&b<=100000){
		    discountb=b*ltdis2;
			System.out.println("b="+discountb);
			}
		if(c>=100000){
		discount=c*ltdis;
	    System.out.println("discount of first laptop="+discount);
	}
		else{
			discount=c*ltdis1;
			System.out.println("c="+discount);
		}
		
	}
	static void amount(){
		Scanner in = new Scanner (System.in);
		System.out.println("enter 3 numbers");
		double a,b,c;
		a=in.nextInt(); 
		b=in.nextInt();
		c=in.nextInt();
		
		double ltprice1=25000d;
		double ltdis1=5d;
		double ltdis2=7;
		double ltdis3=10;
		double ltdis4=15;
		double amount1,amount2,amount3,amount4;
		double s1,s2,s3,s4;
	
		s1=100-ltdis1;
		s2=100-ltdis2;
		s3=100-ltdis3;
		s4=100-ltdis4;
		
	amount1=(ltprice1*s1)/100;
		amount2=(a*s2)/100;
		amount3=(b*s3)/100;
		amount4=(c*s4)/100;
		System.out.println("amount after discount="+amount1+amount2+amount3+amount4);
	}
	
}
