package Array;

public class array {

	public static void main(String[] args) {
		int arr [] = new int [5];
		arr[0] = 46; 
		arr[1] = 30;
		arr[2] = 5;
		arr[3] = 44;
		arr[4] = 55;
		
		int [] newArray = {46,30,50,44,55};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<17) {
				System.out.println("you are passed by grace");
				arr[i] = arr[i]+5;
			}
			System.out.println(arr[i]);
		}

	}

}
