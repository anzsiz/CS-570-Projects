
 /**
 * Name Anchal Singh
 * Section CS 570-C
 * HomeWork 2 Complexity
 */

 public class Complexity {
 	
 	//Method 0 that has time complexity O(n)
 	   public static void method0(int n){
 		   int counter = 0; 
 		   for (int i=0; i<n; i++) { 
 			   System.out.println("Operation: "+ counter); 
 			   counter++; 
     	} 
	
 	  System.out.println("Time complexity O(n) is: " + counter);
 }
 
 	
 	//Method 1 that has time complexity O(n^2)
 	    public static void method1(int n) {
 	        int counter = 0;
 	        for (int i = 0; i < n; i++){
 	            for (int j = 0; j < n; j++) {
 	                System.out.println("Operation1: " + counter);
 	                counter++;
 	            }
 	        }
 	    
 	   System.out.println("Time complexity O(n^2) is: " + counter);
	    }
 	
 	    
 	//Method 2 that has time complexity O(n^3)
 	    public static void method2(int n) {
 	    	int counter = 0;
 	    	for (int i = 0; i < n; i++) {
 	    		for (int j = 0; j < n; j++) {
 	    			for (int k = 0; k < n; k++) {
 	    				System.out.println("Operation2: " + counter);
 	         			counter++;
 	         					}
 	         				}
 	         		 	}
 	    System.out.println("Time complexity O(n^3) is: " + counter);
 	         	 }

 	                
 	//Method 3 that has time complexity O(log n)
 	        public static void method3(int n) {
 	        	int counter = 0;
 	       		for (int i = 1; i < n; i = i * 2) {
 	       			System.out.println("Operation3: " + counter); 
 	       			 counter++;
 	       		 }
 	       		 System.out.println("Time complexity O(log n) is: " + counter);
 	       	 }		
 	                
 	                
 	//Method 4 that has time complexity O(n log  n)
 	       	 public static void method4(int n) {
 	   		 int counter = 0;
 	   		 for (int i = 1; i <= n; i++) {
 	   			    for(int j = 1; j < n; j = j * 2) {
 	   			    	System.out.println("Operation4: " + counter);
 	   			    	counter++;
 	   			    }
 	   		}
 	   		 System.out.println("Time complexity O(nlogn) is: " + counter);
 	   	 }
 	
 	
 	 //Method 5 that has time complexity O(log log n)
 	       	public static void method5(int n) {
 				 int counter = 0;
 				 for (double i = 2; i < n; i = i * i) {
 					 System.out.println("Operation5: " + counter);
 					 counter++;
 				}
 				 System.out.println("Time complexity O(loglogn) is: " + counter);
 			 }
 		
 	       	 
 	//Method 6 that has time complexity O(2^n)
 	      private static int counterexp = 1;
 	      public static int method6(int n) {
 		
 			if(n<0)
 			{
 				System.out.println("The integer value can not be negative");
 				return -1;	
 			}
 			else
 			{
 			counterexp++;
 			
 			System.out.println ("Operation 6: " + counterexp + " times");
 				
 			if(n==0||n==1)
 				{  
 					return counterexp;
 				}
 			else
 				{
 					return method6(n-1)+ method6(n-1);
 				}
 			}	
 		}	      

 	  //Implementing, here n = 10
 	      
 	  	 public static void main(String args[])
 	   {
 	  	int n=10;
 	    
 	  	method0(n);
 	  	method1(n);
 	  	method2(n);
 	  	method3(n);
 	  	method4(n);
 	  	method5(n);
 	  	method6(n);
 	  	
 	   }
 	  } 