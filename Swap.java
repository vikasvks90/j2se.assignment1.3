package Assignment1;

public class Swap {

	public static void main(String[] args) {
		 int x = 10, y = 5;
		 
		 System.out.print("Before Swapping:: ");
		 System.out.println("x: "+x+" "+"y: "+y);
		 
		 x = x + y;  // x now becomes 15
		 y = x - y;  // y becomes 10
		 x = x - y;  // x becomes 5
		 
		  
		 System.out.print("After Swapping:: ");
		 System.out.println("x: "+x+" "+"y: "+y);

	}

}
