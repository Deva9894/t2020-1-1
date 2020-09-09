package t202011;

import java.util.Scanner;

public class Problem3 {
	
	public static void main (String Args []) {
		
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number+:");
	int num = s.nextInt();
	
	String a[] =new String[num+1]; 
	int x=0;
		for(int i=1;i<num;i++) {
			a[i]= a[i-1] +"  "+ i;	
			//System.out.println("A{i} : "+ a[i]);
			if(i%2!=0) {
				System.out.println("x = "+i+" then "+a[i]);
				
			}else {
					if(i%2!=0) {
						System.out.println("x = "+i+" then "+a[i]);
					}else {
						System.out.println("x = "+i+" then "+a[i-1]);
					}
				
			}
		}

	
	}

}
