package threads;

public class Programa {
	

	public static void main(String[] args) {
		CriadorThreads thr = new CriadorThreads("Thread1",100,300);
		thr.start();
		CriadorThreads thread = new CriadorThreads("Thread2",301,500);
		thread.start();
		CriadorThreads t = new CriadorThreads("Thread3",501,700);
		t.start();
		

	}

}
