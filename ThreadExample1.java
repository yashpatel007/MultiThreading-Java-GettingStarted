
public class ThreadExample1{
	public static void main(String[] args){

		//this is the main thread
		Hi hi = new Hi();
		Hello hello = new Hello();

		// start method call run in class
		hi.start();
		// to avoid race condition
		// try{Thread.sleep(10);}catch(Exception e){};
		hello.start();

		// will run the methods parallel and print hi hello alternately

	}

}

class Hi extends Thread{

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
 
class Hello extends Thread{
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


