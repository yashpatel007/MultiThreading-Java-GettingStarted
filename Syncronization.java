
public class Syncronization{

	public static void main(String[] args) throws Exception{

		Counter c = new Counter();

		Thread t1 = new Thread(new Runnable(){

			public void run(){
				for(int i=0; i<1000;i++){
					c.increment();
				}

			}

		});

		Thread t2 = new Thread(new Runnable(){

			public void run(){
				for(int i=0; i<1000;i++){
					c.increment();
				}

			}

		});


		t1.start();
		t2.start();

		t1.join();
		t2.join();
		
		// without Syncronize keyword this will spit value below 2000
		// why --> race conditions
		// with syncronized it prints 2000 every time
		System.out.println("count: "+ c.count);

	}

}


class Counter{
	int count;
	public synchronized void increment(){
		count++;
	}
}