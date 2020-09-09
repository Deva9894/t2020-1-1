package t202011;

import java.util.Scanner;

public class Problem3 {
	
	public static void main (String Args []) {
		
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number+:");
	int num = s.nextInt();
	
	int a[] = new int[num + 1]; 
		for(int i=1;i<num;i++) {
			if(i%2!=0) {
				a[i]=i;
				System.out.println("x = "+i+" then "+a[i]);
			}else {
				System.out.println("x = "+i+" then "+a[i]);
			}
		}

	
	}

}
