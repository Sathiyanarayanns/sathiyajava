package learnjava;
import java.util.Scanner;
public class StudentMarks {
    
  public static void main(String [] args){
    Scanner in=new Scanner(System.in);
    
    // creates an array of integer to hold the 10 marks.
    int [] marks = new int[10];
	//int [] marks2= new int[10];
    int sum=0;
//read 10 numbers from the keyboard using a loop
    System.out.println("student 1 marks");
    System.out.println("student 2  marks:");
   // for(int j=1;j<=2;j++){
    /*	if(j==1){
    		System.out.println("student1");
    	}
    	else{
    	
    		System.out.println("student2");
    	}*/
    //}
    		for (int i=0;i<10;i++) {
      marks[i]=in.nextInt();//assign the mark to the array
      //marks2[i]=in.nextInt();
      //we assume marks will be entered correctly
      //sum=sum+marks[i];
      sum=sum+marks[i];//add mark to the current total
    }//end of for

    //display all the numbers and prints out the average
    System.out.println("The numbers entered are:");
    for (int i=0;i<10;i++) 
        System.out.print(marks[i]+" ");
     System.out.println("total="+sum);
    System.out.println(); //to start a new line
    System.out.println("The average mark is: "+ sum/10);
  in.close();
  }//end of main
}//end of class
 
