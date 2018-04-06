package learnjava;

public class FibonacciDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
       int n=8;
       int v1=0;
       int v2=1;
       int sum=0;
       for(int i=0;i<=n;i++){
   		System.out.println("fibonacci"+v1);
    	   sum=v1+v2;
    	   v1=v2;
    	   v2=sum;
       }
		System.out.println("fibonacci"+v1);
	}
}
