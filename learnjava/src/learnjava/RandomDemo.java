package learnjava;

import java.util.Random;

public class RandomDemo {

	public RandomDemo() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String a[]){
		//java.util.Random random = new Random();
		int i ;
		int result=0;
		int result2=1;
		int cos=0;
		int nums[] = {10,13,12,15,90,10,7,3,32,17,87};
		for ( int j=0;j<11;j++){
			i=nums[j];//returns a random number between 0 and 100
	           
		           if (i %3 == 0){
		        	result=result+i;   
		        	cos=cos+1;
					// System.out.println(+i);
		            System.out.println("result=" +result);
		            System.out.println("cos=" +cos);
		            result2=result/cos;                  
		           }  
			   }
    
        System.out.println("result2="+ result2); 
      
		   }		
	}
    
		   
		  
     			//System.out.println(+result);
				 
	
		
		
		

