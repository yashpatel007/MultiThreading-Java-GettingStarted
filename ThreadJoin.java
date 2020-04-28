
public class ThreadJoin{

	public static void main(String[] args) throws Exception{

		//this is the main thread
		
		// making the code efficient and reducing number of lines
		// Note*: runnable do not have a start method unlike thread class
		Thread t1 = new Thread(()->{
			
				for (int i=1; i<=5; i++){
					System.out.println("Hi");
					try{Thread.sleep(500);}catch(Exception e){};// wait for half second...pause mai thread for half second
					}
				
			});

		Thread t2 = new Thread(() ->
		{
				for (int i=1; i<=5; i++){
					System.out.println("Hello");
					try{Thread.sleep(500);}catch(Exception e){};// wait for half second...pause mai thread for half second
					}		
		});

		t1.start();// by t1
		t2.start();// by t2
		// main doing nothing so it prints Bye

		// see if thread is alive -> true
		System.out.println("t1 is alive: "+t1.isAlive());
		System.out.println("t2 is alive: "+t2.isAlive());
		// we need to instruct main to wait for these two to complete their task
		// how to do that?
		t1.join(); // t1 complete task and get joined to main again
		t2.join(); // same goes for t2

		// return -> false
		System.out.println("t1 is alive: "+t1.isAlive());
		System.out.println("t2 is alive: "+t2.isAlive());

		// we want this to print at and but it will not so what we do 
		System.out.println("Bye");

	}

}
