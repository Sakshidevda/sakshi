package July19;

public class Demo {

	public static void main(String[] args) {
		
		
		String thisThreadname = Thread.currentThread().getName();

		System.out.println(thisThreadname);
		
		
		ThreadA  ss = new ThreadA();
		Thread x = new Thread(ss);
		Thread y = new Thread(ss);
		
		
		y.setName("Chiku");
		x.setName("khushi");
		
		System.out.println(x.getPriority());
		System.out.println(y.getPriority());
		
		
		
		//x.setPriority(10);
		//y.setPriority(7);
		
		x.start();
		y.start();
	
	
	}

}
