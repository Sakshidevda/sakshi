package July4;

public class ArrayQ {
	public static void main(String[] args) {
       
        int[] tableOf23 = new int[10];
        
       
        for (int i = 0; i < 10; i++) {
            tableOf23[i] = 23 * (i + 1); 
        }
        
       
        System.out.println("Array  with multiples of 23:");
        for (int i = 0; i < tableOf23.length; i++) {
            System.out.println("table of 23 " + i + ": " + tableOf23[i]);
        }
	}
}
        
        