package Array;

public class sum {
	
public static void main(String[] args) {
	int[] ppp = {4,6,71,8,5};
	int k=13;
	System.out.println();
	// find those two value whose sum = 13
	
		for(int i=0;i<ppp.length;i++) {
			for(int j=i+1;j<ppp.length;j++) {
				if((ppp[i]+ppp[j]) == k) {
					System.out.println(ppp[i]+" "+ppp[j]);
					break;
				}
			}
		}
	}

}
