package thread_vendredi;

public class TestThread extends Thread {
	Thread DIRU;

	public TestThread(String name) {
		super(name);

		System.out.println("statut du thread " + name + " = " + this.getState());
		this.start();
		System.out.println("statut du thread " + name + " = " + this.getState());
	}

	public TestThread(String name, Thread DIRU) {
		super(name);
		this.DIRU = DIRU;
		System.out.println("statut du thread " + name + " = " + this.getState());
		this.start();
		System.out.println("statut du thread " + name + " = " + this.getState());
	}

	// *****************************************//
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println(this.getName()+ " = " +this.getState());
		if (DIRU != null)
			System.out.println(
					"statut de " + DIRU.getName() + " pendant le thread " + this.getName() + " = " + DIRU.getState());
	}

	public void setThread(Thread DIRU) {
		this.DIRU = DIRU;
	}

}
