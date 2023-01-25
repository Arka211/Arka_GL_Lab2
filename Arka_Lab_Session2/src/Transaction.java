import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Transaction {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of Transaction Array");
		int size = scan.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter the valiues of Array");
		
		for(int i=0; i<size; i++) {
			arr[i] = scan.nextInt();
		
		}
        System.out.println("Enter the total number of targerts that need to be achieved:");
        int TargetNo = scan.nextInt();
        while(TargetNo-- > 0) {
        	boolean achieved = false;
        	System.out.println("Enter value of Target");
        	long target = scan.nextLong();
        	long sum = 0;
        	for(int i=0; i<size; i++) {
        		sum=sum + arr[i];
        		
        		if(sum>target) {
        			System.out.println("Target achieved after" +(i+1)+ "transactions");
        			achieved=true;
        			break;
        			
        		}
        	}
        }
        
        if(!achieved) {
        	System.out.println("Given Target is not achieved");
        }
	}

}
