class Table{
	synchronized void printTable(int n) {
		for(int i=1; i<=5; i++) {
			System.out.println(n*i);
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}


class Thread2 extends Thread{
	Table t1;
	Thread2 (Table t1) {
		this.t1=t1;
	}
	public void run() {
		t1.printTable(100);
	}
}
class Thread1 extends Thread{
	Table t1;
	Thread1(Table t1){
		this.t1=t1;
	}
	public void run() {
		t1.printTable(5);
	}
	
}

public class SynchrinizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table t=new Table();
		Thread1 t1=new Thread1(t);
		Thread2 t2=new Thread2(t);
		t1.start();
		t2.start();
	}

}
