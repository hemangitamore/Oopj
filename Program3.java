package in.act.cdac;

public class Program3 {
	
	private static void showRecord() {
		try {
			for(int i=1;i<=10;i++) {
				System.out.println("Count: "+i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private static void displayRecord()throws InterruptedException{
		for(int i=1;i<=10;i++) {
			System.out.println("Count: "+i);
			Thread.sleep(500);
		}
	}
	public static void main(String[] args) {
		try {
			Program3.displayRecord();
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
