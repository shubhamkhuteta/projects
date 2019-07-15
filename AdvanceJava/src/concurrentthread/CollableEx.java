package concurrentthread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CollableEx {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(1);
		List<Future> allfutures = new ArrayList();
		
		for(int i=0; i < 100;i++) {
			Future future = es.submit(new TaskNew());
			allfutures.add(future);
		}
		
		for(int i=0; i < 100;i++) {
			Future<Integer> future = allfutures.get(i);
			Integer result = (Integer) future.get();
			System.out.println(result);
		}
	}
}


class TaskNew implements Callable {
	@Override
	public Integer call() throws Exception {
		Thread.sleep(2000);
		return new Random().nextInt();
	}

}
