package learnjava;
import java.util.Scanner;
public class ImpNot {
	//public static void main(String [] args){
//	public class TernaryOpDemo {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("enter 3 numbers");
		double marks;
		marks=in.nextInt();
		//Checking if marks greater than 35 or not

		String status;

		System.out.print("Please enter your Marks (between 0 to 100) >> ");

		status= marks>=35 ?"You are Passed":"You are failed"; System.out.println("Status= " + status); } 

		
}	
	

