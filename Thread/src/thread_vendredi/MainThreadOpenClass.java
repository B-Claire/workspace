package thread_vendredi;

public class MainThreadOpenClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println("le nom du Thread principal est " + Thread.currentThread().getName());
		
		/*TestThread diru = new TestThread("Miou");
	    TestThread diru2 = new TestThread(" Shinya", diru);
	    try {
	      Thread.sleep(1000);
	    } catch (InterruptedException e) {
	      e.printStackTrace();
	    }
	    System.out.println("statut du thread " + diru.getName() + " = " + diru.getState());
	    System.out.println("statut du thread " + diru2.getName() + " = " +diru2.getState());       */
		
		 CompteEnBanque cb = new CompteEnBanque();
		/*    Thread diru = new Thread(new RunImpl(cb));
		    diru.start();*/
	  }
		

	

}
