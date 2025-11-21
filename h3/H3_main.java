package h3;

import java.util.Arrays;

public class H3_main {
public static void main(String[] args) {
	 int [][] einheiten = { {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1},
	{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
	};
    int input = 312;

	
	for (int i=0; i< einheiten[0].length; i++) {
		int x = einheiten [0][i];
		if (input>=x) {
			einheiten[1][i]=input/x;
			input %=x;
		}
	}
	 //System.out.println(Arrays.deepToString(einheiten));
		
			
			
		
	}
}


