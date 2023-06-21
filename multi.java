package day14;
class a extends Thread{
	public void run() {
		System.out.println("run");
	}
}

public class multi {
	public static void main(String args[]) {
		/*Thread t=Thread.currentThread();
		t.setName("CBIT");
		t.setPriority(9);
		System.out.println(t);*/
		a k=new a();
		k.run();
		for(int i=0;i<=5;i++)
	{
			System.out.println("multithread");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
}
