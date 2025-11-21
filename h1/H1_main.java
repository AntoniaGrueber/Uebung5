package h1;

import java.util.Arrays;

public class H1_main {
public static void main(String[] args) {
	int[] myArray = {5, 6, 7, 11,3};
	int start=0;
	int ende=myArray.length-1;

	System.out.println("Array Vorwärts:" + Arrays.toString(myArray));
	
	for (;start < ende; start++, ende--) {
		int temp=myArray[start];
		myArray[start]=myArray[ende];
		myArray[ende]= temp;}


	System.out.println("Array Rückwärts:" + Arrays.toString(myArray));
	
}
}
