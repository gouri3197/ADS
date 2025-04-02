class RecursionPower{

   static double power(double b,int e)
     {
	 
	    if(e==0)
		  return 1;
		  
		if(e<0)
		  
		   return 1 /power(b,-e);
		   else
		   
		   return b* power(b,e-1);
	 }
	 
	 public static void main(String []args){
	 
	   double b= 2;
	   
	   int e = 5;
	   
	   double result = power(b,e);
	   
	   System.out.println(result);
	   }
}