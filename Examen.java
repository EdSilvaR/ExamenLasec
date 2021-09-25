public class Examen {
	public static void main(String[] args) {
		Tortuga tor = new Tortuga(" Tortuga");
		Liebre lie = new Liebre(" Liebre");
		tor.start();
		lie.start();
	}
}

// tortuga
class Tortuga extends Thread {
	public Tortuga(String nomAnimal) {
		super(nomAnimal);
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println("Gana Tortuga");
	}
}

// liebre
class Liebre extends Thread {
	public Liebre(String nomAnimal) {
		super(nomAnimal);
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(350);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println("Termina Liebre");
	}
}