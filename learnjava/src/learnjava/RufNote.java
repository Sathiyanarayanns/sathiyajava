package learnjava;

public class RufNote {
public static void main(String args[]){
	
	
     int age []={20,30,10,40,29,35,90,45,60,56};
     int max=age[0];
int max2=age[0];
     for(int i=1;i<age.length;i++){
       if(max<age[i]){
    	
    	   max=age[i];   	   
    	    System.out.println("max="+max);
       }
       else{
    	  
    	   if(max2<age[i]){
    		   max2=age[i];
    	   }
        	   System.out.println("max2="+max2);
       }
       }  
		}
}
  	
