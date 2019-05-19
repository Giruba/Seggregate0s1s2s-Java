package Application;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Enter the number of elements in the array");
		try {
			Scanner scanner = new Scanner(System.in);
			int numberOfElements = scanner.nextInt();
			int[] array = new int[numberOfElements];
			for(int index = 0; index < numberOfElements; index++) {
				System.out.println("Enter the element "+(index+1)+":");
				array[index] = scanner.nextInt();
			}
			PrintArray(array);
			DutchNationalFlagAlgorithm(array);			
		}catch(Exception exception) {
			System.out.println("Thrown exception is "+exception.getLocalizedMessage());
		}
	}
	
	private static void DutchNationalFlagAlgorithm(int[] array) {
		
		int low =0;
		int mid = 0;
		int high = array.length - 1;
		
		while(mid < high) {
			switch(array[mid]) {
			case 0:
				int temp = array[low];
				array[low] = array[mid];
				array[mid] = temp;
				low++;
				mid++;
				break;
			case 1:
				mid++;
			case 2:
				int temp1 = array[mid];
				array[mid] = array[high];
				array[high] = temp1;
				high--;
			}
			
		}
		System.out.println();
		System.out.println("Array after Dutch national flag algorithm");
		PrintArray(array);
	}
	
	private static void PrintArray(int[] array) {
		System.out.println("Printing the contents of the array------------");
		for(int index = 0; index < array.length; index++) {
			System.out.print(array[index]+" ");
		}
		
	}
}
