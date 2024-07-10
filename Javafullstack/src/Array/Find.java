package Array;

public class Find {

	public static void main(String[] args) {
		int[] arr= {23,27,64,75,83,24};
		boolean flg = false;
		for(int ssi : arr) {
			if(ssi == 83) {
				flg = true;
				System.out.println("Yes");	
			}
		}
		
			if(flg == false) {
				
				System.out.println("No");
			}
		}

	}


