package HomeWorkSet;
   //25/02/2026
public class Mobile 
      {
          int price;
          
          void applyDiscount(int price) 
  		{
  		   int discount = price*10 /100;
  			System.out.println("discount =" + discount); //5000
  	
  	         this.price = price - discount;
  	         System.out.println("final price =" + this.price);  //45000
  		}
          
         
          
          void displayMobileDetails(String brand,String model)
          {
        	  System.out.println("brand:" + brand);
        	  System.out.println("model:" + model);
        	  System.out.println("price:" + this.price);
          }
          
          
	   public static void main(String[] args)
	    {
		  
		   Mobile m1 = new Mobile();
		   m1.applyDiscount(50000);
		   m1.displayMobileDetails("mi", "a92");
		   
		   System.out.println();
		   
		   Mobile m2 = new Mobile();
		   m2.applyDiscount(22000);
		   m2.displayMobileDetails("Redmi", "11T");
		   
	  }

}
