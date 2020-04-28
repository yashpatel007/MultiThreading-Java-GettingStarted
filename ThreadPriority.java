
public class ThreadPriority{

	public static void main(String[] args) throws Exception{

		//this is the main thread
		
		// making the code efficient and reducing number of lines
		// Note*: runnable do not have a start method unlike thread class
		Thread t1 = new Thread(()->{
			
				for (int i=1; i<=5; i++){
					// acess thread object inside thread
					// Thread.currentThread()
					System.out.println("Hi");
					try{Thread.sleep(500);}catch(Exception e){};// wait for half second...pause mai thread for half second
					}
				
			},"Hi Thread");

		Thread t2 = new Thread(() ->
		{
				for (int i=1; i<=5; i++){
					System.out.println("Hello");
					try{Thread.sleep(500);}catch(Exception e){};// wait for half second...pause mai thread for half second
					}		
		},"Hello Thread");

		// do threads have name lets print that, well name not so useful can we change them ...yes ofcourse
		System.out.println("t1 name is :"+t1.getName());// --> Thread-0
		System.out.println("t2 name is :"+t2.getName());// --> Thread-1

		// change threads name 
			// method 1
		
				// t1.setName("Hi Thread");
				// t2.setName("Hello Thread");
			// method 2
				// can pass name at creation time


		// well i can also set priority of thread 1 is least 10 is max --> default is 5
		// wanna check
		System.out.println("t1 priority is :"+t1.getPriority());// --> 5
		System.out.println("t2 priority is :"+t2.getPriority());// --> 5

		// wanna change priority
		t1.setPriority(10);
		t2.setPriority(1);

		// well check again
		System.out.println("t1 priority is :"+t1.getPriority());// --> 10
		System.out.println("t2 priority is :"+t2.getPriority());// --> 1



		t1.start();// by t1
		t2.start();// by t2


		t1.join(); // t1 complete task and get joined to main again
		t2.join(); // same goes for t2

		

		// we want this to print at and but it will not so what we do 
		System.out.println("Bye");

	}

}
