package constructordemo;

public class Multipleconstructor {

	public Multipleconstructor() {
		System.out.println("Default Construcor Running");
	}

	public Multipleconstructor(int a) {
		System.out.println("Int Constructor is running " + a);
	}

	public Multipleconstructor(String a) {
		System.out.println("String Constructor is running " + a);
	}

	public Multipleconstructor(boolean a) {
		this(100, true);// calling constructor using "this" keyword
		System.out.println("Boolean Constructor is running " + a);

	}

	public Multipleconstructor(int a, boolean c) {
		System.out.println("Int and Boolean Constructor is running " + a + " and " + c);

	}

	public static void main(String[] args) {

		Multipleconstructor result = new Multipleconstructor();

		Multipleconstructor result1 = new Multipleconstructor(100);

		Multipleconstructor a = new Multipleconstructor("Amol");
		Multipleconstructor b = new Multipleconstructor(false);
		// Multipleconstructor c = new Multipleconstructor(1, true);

	}

}
