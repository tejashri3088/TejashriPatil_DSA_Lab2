package problem2;
import java.util.Scanner;

public class NotesCount {
	
	public static void paymentApproach(int[] notes,int amount) {		
		int temp = amount;
		for (int i=0; i<notes.length; i++) {
			if (temp >= notes[i]) {
				int numNotes = temp / notes[i];
				System.out.println(notes[i] + ":" + numNotes);
				temp = temp % notes[i];
			}
		}
		if(temp>0) {
			System.out.println("Amount of " +temp+ " is still pending");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of Currency Denominaion");
		int size = input.nextInt();
		int[] notes = new int[size];
		
		System.out.println("enter the currency denominations value");
		for(int i=0; i<size; i++) {
			notes[i] = input.nextInt();
		}
		
		System.out.println("enter the amount you want to pay");
		int amount = input.nextInt();
		
		System.out.println("Your payment approach in order to give min no of notes will be");
		QuickSort.quickSort(notes,0,notes.length-1);
		paymentApproach(notes,amount);
	}

}
