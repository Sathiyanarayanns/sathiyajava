package javaclass;
class  Student{
	
	
	public static void main(String []args){
		//Mark krish=new Mark(5,1);
		
	
		A oneletter=new A();
	   
		//oneletter.formsentence(oneletter);
		A two=new A();
	//System.out.println(two.count);
		//two.formsentence(oneletter);
		//System.out.println(two.count);
		two.add();
    }
}
class A
{
	int count=3;
	void formsentence(A english){
english.count=5;
	System.out.println(count);
	}

	
	void add(){
		int x=0;
	x++;
		System.out.println(x);
	
	if(x<5){
		x++;
      add();}
	}







/*

class Mark{
	int x,y;
	
	Mark(int a,int b){
		x=a;
		y=b;
		int z;
	    z=x+y;
//System.out.println(z);
	}
	
	
	
   /* int add()
    {
    c=a+b;
    System.out.println(c);
    return 0;
    }
    /*int sub()
    {int a=5,b=6,c;
    c=a-b;
    System.out.println(c);
    return 0;
    }*/
}
