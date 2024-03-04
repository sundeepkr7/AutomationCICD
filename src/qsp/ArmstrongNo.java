package qsp;

import java.util.Scanner;

public class ArmstrongNo {

	public static void main(String[] args) {
		 Scanner sc =new Scanner(System.in);
	      System.out.println("Enter the number");
	      int n = sc.nextInt();
	      sc.close();
	      int temp=n;
	      int r, sum=0;
	      while(n>0){
	          r = n%10;
	          sum=sum+r*r*r;
	          n=n/10;
	      }
	      if(temp==sum)
	      System.out.println("Armstrong no.");
	      else
	      System.out.println("Not Armstrong no.");
	      
	}

}
