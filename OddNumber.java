package t202011;
import java.util.Scanner;
public class OddNumber {
	
	public static void main (String Args []) {
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number+:");
	int num = s.nextInt();
	
	String a ="";
		
 for(int i = 1; i <num; i++) {		
	 if(i%2!=0){
		 a = a + " "+i;
		  System.out.println("x = "+i+" then "+a);
		 }
//	 System.out.print(arr[i] + " ");
	}
	
	}
}

