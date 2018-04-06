package learnjava;

 class PatternFor1 {

	
		// TODO Auto-generated constructor stub
		public static void main(String [] ags){
           for(int row=5;row>1;row--){
        	  
        		   for(int star0=1;star0<row;star0++){
            		   System.out.print("*");
        		   }
        		   for(int col=4;col>=row;col--){
            		   System.out.print(" ");
        		   }
        		       		      
           		   
        	   
        		   for(int col2=4;col2>=row;col2--){
        			   System.out.print(" ");
        		   }
        		   for(int star=1;star<row;star++){
        			   System.out.print("*");
        		   }
        	   
        	   
        	   System.out.println();
           	
        	   }
           for(int row=0;row<4;row++){
        	         for(int star2=0;star2<=row;star2++){
        	        	 System.out.print("*");
        	         }
        	         for(int col3=2;col3>=row;col3--){
        	        	 System.out.print(" ");
        	         }
        	         for(int col4=2;col4>=row;col4--){
        	        	 System.out.print(" ");
        	         }
        	         for(int star3=0;star3<=row;star3++){
        	        	 System.out.print("*");
        	         }
        	         System.out.println();
        	         }
           
		}			
		}

