// here we are taking the classic example of producer consumer problem


class ThreadCommunication{

	public static void main(String[] args){
		Q q = new Q();
		new Producer(q);
		new Consumer(q);

	}

}


class Q{

	int num;
	Boolean valueSet =false;
	public synchronized void set(int num){

		while(valueSet){
			try {wait();} catch(Exception e){}
		}

		System.out.println("set : "+num);
		this.num=num;
		valueSet = true;
		notify();
	}
	public synchronized void get(){
		while(!valueSet){
			try {wait();} catch(Exception e){}
		}
		System.out.println("get : "+num);
		valueSet=false;
		notify();
	}

}

class Producer implements Runnable{

	Q q;

	public Producer(Q q){
		
		this.q=q;

		Thread t = new Thread(this,"producer");
		t.start();
	}

	public void run(){
	int i=0;
	while(true){
		q.set(i++);
		try{ Thread.sleep(1000);}catch(Exception e){}
	}

	}

}

class Consumer implements Runnable{

	Q q;
	public Consumer(Q q){
		
		this.q=q;
			Thread t = new Thread(this,"consumer");
		t.start();
	}

	public void run(){
	while(true){
		q.get();
		try{ Thread.sleep(1000);}catch(Exception e){}
	}

	}

}
