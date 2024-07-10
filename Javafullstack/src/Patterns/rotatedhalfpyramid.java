package Patterns;

public class rotatedhalfpyramid {

	public static void main(String[] args) {
	
		for(int i=5; i>0; i++) {
			for(int k=0; k<5; k++) {
				if(k<i-1) {
					System.out.print(" ");	
				}else {
					System.out.print("*");
				}
				
			System.out.println();
		}

	}

}
}
