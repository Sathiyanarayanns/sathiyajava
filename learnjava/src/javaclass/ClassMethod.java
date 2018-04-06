 package javaclass;
//import java.util.Arrays;
public class ClassMethod {
   
    static void fibonacciseries(int n1,int n2, int result){
    	 	for(int i=1;i<10;i++){
    		result=n1+n2;
    	
    		n1=n2;
       		n2=result;
       		
       		   	}
    		System.out.println("result="+result);
    }
    static void nfact(int nvalue,int nfact){
    	 for(int j=1;j<=nvalue;j++){
    	nfact=j*nfact;
    
    }
    	 System.out.println("fact="+nfact);
    }
    static  int  sumofdigit(int i,int n){
    	int sum=1;
    	 for(int k=0;k<=i;k++){
    		n=i%10;
    		sum=n+sum;
    		i=i/10;	
    		   	
    	}
    	 System.out.println("sumofdigit="+sum);
    	 return sum;
    }
   
    static int[] arraynum(int n[]){
      //  Arrays.sort(n);
  
    	//System.out.println(n);
    	return n;
    }
    
    
    	public static void  main(String  args []){
    	// fibonacciseries(1,1,1);
    	   //nfact(5,1);
  //  sumofdigit(555,1);
    		vowels();
    		int k[]={2,3,4};
   //arraynum(k);
   for(int i=0;i<k.length;i++){
   //System.out.print(k[i]);
   }
   }
    static void vowels()
    {
    	char [] cool={'s','a','t','h','y','a'};
    	char [] vowels={'a','e','i','o','u'};
    	for(int i=0;i<cool.length;i++)
    	{
    		for(int j=0;j<vowels.length;j++)
    		{
    			if(cool[i]==vowels[j])
    			{
    				System.out.println(cool[i]);
    			}
    			
    			
    				
    			
    			
    	}
    }
}}


