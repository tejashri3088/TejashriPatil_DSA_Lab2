package problem1;
import java.util.Scanner;

public class Transactions {

	public static void targetAcheived(int[] arr,int target) {
		int temp = 0;
		boolean flag = false;
		
		for(int i=0; i<arr.length; i++) {
			if(temp <= target) {
				temp = temp + arr[i];
				if(temp >= target) {
					System.out.println("Target acheived after " +(i+1)+ " transaction");
					flag = true;
					break;
				}
			}
		}
		
		if(!flag) {
			System.out.println("Given target is not achieved ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of transaction array");
		int size = input.nextInt();
		
		if(size <= 0) {
			System.out.println("size must greater than 0");
		} else {
			int[] arr = new int[size];
			
			System.out.println("Enter the values of array");
			int x = 0;
			for(int i=0; i<size; i++) {
				x = input.nextInt();
				if(x <= 0) {
					System.out.println("cannot enter 0 as a value");
					return;
				}
				arr[i] = x;
			}
			
			System.out.println("Enter total no of targets that need to be acheived");
			int noOfTargets = input.nextInt();
			for(int i=0; i<noOfTargets; i++) {
				System.out.println("\nEnter the value of target");
				int target = input.nextInt();
				targetAcheived(arr,target);
			}	
		}
		input.close();
	}

}
