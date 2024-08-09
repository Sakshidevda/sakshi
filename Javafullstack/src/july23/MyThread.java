package july23;

public class MyThread  extends Thread {
	
	int total=0;
	public void run(){
	for(int i=0;i<=100;i++){
	total=total+i;
	}
	}

}


   class Main {
       public static void main(String[] args){
          MyThread mt=new MyThread();
             mt.start();
             System.out.println(mt.total);
     } 
  }
