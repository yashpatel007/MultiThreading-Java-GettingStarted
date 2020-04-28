
public class ThreadExample2{
	public static void main(String[] args){

		//this is the main thread
		Hi hi = new Hi();// this is a runnable object
		Hello hello = new Hello();

		// Note*: runnable do not have a start method unlike thread class
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(hello);
		t1.start();
		t2.start();



	}

}

class Hi implements Runnable{

	/*If your class also need to extend another class, Java Does not support multiple inheritance so we implement a interface Runnable to include mutithreading*/

	public void run(){
		this.show();
	}

	public void show(){
		for (int i=1; i<=5; i++){
			System.out.println("Hi");
			try{Thread.sleep(500);}catch(Exception e){};// wait for half second...pause mai thread for half second
			}
	}
}
 
class Hello implements Runnable{
	public void run(){
		this.show();
	}
	public void show(){
		for (int i=1; i<=5; i++){
			System.out.println("Hello");
			try{Thread.sleep(500);}catch(Exception e){};// // wait for half second...pause mai thread for half second
		}
	}
}


