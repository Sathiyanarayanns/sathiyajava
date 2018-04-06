package javaclass;

public class Process {
	public static  void main(String args[]){
		Stud ram=new Stud(3,4);
    //   ram.add();
    //System.out.println(ram.add());
    //ram.sub();
	//System.out.println("sub="+ram.sub());	
    ram. sub();
    new school();
    new Stud(3,4);
	}

}

  class Stud {
	 Stud(int a,int b){
		 int c;   
		 c=a+b;
			 System.out.println(c);
		}
	 
/*    int add(){
    int i=9;
    int j=3;
    int c=i+j;
    System.out.println(c);
    return 0;
    }*/
    int sub()
    {int a=5,b=6,c;
    c=a-b;
    System.out.println(c);
    return 0;
    }
}
   class school{
  school(){
	  System.out.println("hello school");
  }

   }
   