package day14;
class thre extends Thread{
	public void run() {
		Thread.currentThread().setName("first");
	System.out.println("thre is running");
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}	

 class muleg {
	 public static void main(String args[]) {
	 thre t1=new thre();
	 t1.start();
	 System.out.println(Thread.currentThread().getName());
	 
	 System.out.println(Thread.currentThread().isAlive());
	 try {
		t1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 }}
	

