package learnjava;

public class JavaClass {
	  static int height=100;
	     String color="green";
			// TODO Auto-generated method stub
		static int growing()
		{
			
		
			for(int i=1;i<=3;i++){
			height=height+i;
			
			System.out.println(height);}
			return 0;
		}
		static void givesadow()
		{
		String color1="black";
		if(color1=="green"){
		System.out.println("shadow given");
		}
		else{
			System.out.println("no shadow");			
		return	;
		}
		}
		public static void main(String  args []){
			growing();
			givesadow();
		}		
		}
