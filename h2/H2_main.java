package h2;

import java.util.Arrays;

public class H2_main {
public static void main(String[] args) {
	int n=0;
	int digits=0;
	int[] a;// = {0,0,0,0,0,0,0,0,0} Elemente standartmäßig 0
	a = new int[9]; 
	
	
	if (n==0) {
		digits=1;

	} else {
		digits=String.valueOf(n).length();
		int x = n;
		for (int i =8; i>= 9-digits; i--) {
			a[i] = x % 10;
			x /=10;
		}
	}
	System.out.println("Anzahl der digits: " + digits);
	System.out.println("Array:" + Arrays.toString(a));
	}
	
}

