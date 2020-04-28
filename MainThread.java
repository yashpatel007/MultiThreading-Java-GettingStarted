
public class MainThread{
	public static void main(String[] args){

		//this is the main thread
		Hi hi = new Hi();
		Hello hello = new Hello();

		hi.show();
		hello.show();
		// prints hi and then hello

		//int x =10/0; <-- will throw exception divide by zero in main thread

		/*/ so whats the problem with single thread lets as we have seen in class Hi and hello Show method takes 
		 5 seconds to complete so other process have to wait .... well this makes things slow and we dont like slow
		/*/

		/* The solution to this is MULTI-THREADING */



	}

}

class Hi{
public void show(){
	for (int i=1; i<=5; i++){
		System.out.println("Hi");
		try{Thread.sleep(500);}catch(Exception e){};// wait for half second...pause mai thread for half second
		}
	}
}
 
class Hello{
	public void show(){
		for (int i=1; i<=5; i++){
			System.out.println("Hello");
			try{Thread.sleep(500);}catch(Exception e){};// // wait for half second...pause mai thread for half second
		}
	}
}


