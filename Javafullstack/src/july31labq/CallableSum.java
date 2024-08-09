package july31labq;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.List;
import java.util.ArrayList;



public class CallableSum {
	
	
    static class SumCallable implements Callable<Integer> {
        private final int n;

        public SumCallable(int n) {
            this.n = n;
        }

        @Override
        public Integer call() {
        	
           
            return n * (n + 1) / 2;
        }

}
    
    public static void main(String[] args) {
    	
       
    	
        Callable<Integer>[] tasks = new Callable[]{
        		
            new SumCallable(10),
            new SumCallable(20),
            new SumCallable(30),
            new SumCallable(40),
            new SumCallable(50)
        };
        
     // Create ExecutorService with  fixed thread pool of size 3
        ExecutorService executor = Executors.newFixedThreadPool(3);

        try {
            
            List<Future<Integer>> futures = new ArrayList<>();
            for (Callable<Integer> task : tasks) {
                futures.add(executor.submit(task));
            }

            
            for (Future<Integer> future : futures) {
                try {
                    
                    Integer result = future.get();
                    System.out.println("Result: " + result);
                } catch (Exception e) {
                    System.err.println("Failed to get result: " + e.getMessage());
                }
            }
        }
        finally {
            
            executor.shutdown();
        }
    }
}

