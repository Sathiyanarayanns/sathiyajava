package logic;

public class ArrayLogics {
	public static void main(String args[]){
		int count=0;
	int j=1;
int value[]={5,10,15,20,25,5,50,20,30,36,40};
int max=value[0] ;
for(int i=1;i<value.length;i++){
	if(max<value[i]){
		if(j<value[i]){
			j=i;
		}else{
	max=value[i];
		count=count+1;
	j=count-1;
	count=value[i];}
		}
	
	System.out.println("first largest number "+  count +" second largest number "+ j);
	}
	}	

}
	





/*int i[][]={{4,4,4},{4,4,4}};
	for(int j=0;j<2;j++){
		for(int k=0;k<2;k++){
			System.out.print(i[j][k]);
		}
		System.out.println();
	}*/
	
		/*int [] age={30,20,45,80,70};
	for(int i=0;i<age.length;i++){
		System.out.println("after 5 years"+age[i]);
	int b[]=new 
	}*/
/*int value [] ={0,5,10,15,20,25,30,35,40,45};
int n=35;
for(int i=0;i<value.length;i++){
if(value[i]==n){
i=i+1;	
if(0<=i&&i<=value.length-1){
	
}else{
	System.out.println("no numbers");
}
System.out.println(i);
if(i%2==0){
			
	System.out.println("even num");
}
else{
	System.out.println("odd num");
		}
break;

}

}*/			
