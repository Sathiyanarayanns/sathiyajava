package learnjava;
import java.util.Scanner;
 class DataTypes {

	public static void main(String [] args) {
		int a,b;
		// TODO Auto-generated constructor stub
		System.out.println("enter three numbers");
          Scanner in = new Scanner (System.in);
          a=in.nextInt(); 
          b=in.nextInt();
        //  c=in.nextInt();
       a=a-b;
       b=b+a;
       a=b-a;
       System.out.println("Value1 of a="+a  +"value2 of b="+b);
   in.close();
	}
 }
