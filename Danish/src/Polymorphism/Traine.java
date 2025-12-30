package Polymorphism;

public class Traine {
	public static void main(String[] args) {
		duty(new JavaTrainer());
		duty(new AptiTrainer());
		duty(new TestingTrainer());

//		t = new JavaTrainer();
//		t.Teach();
//		t = new AptiTrainer();
//		t.Teach();
//		t = new TestingTrainer();
//		t.Teach()

		// Code Deduction ---
	}
	static void duty(Trainer t) {
		t.Teach();
	}
}

class Trainer {

	void Teach() {
		System.out.println("Teaches");
	}

}

class JavaTrainer extends Trainer {

	void Teach() {
		System.out.println("Teaches Java");

	}

}

class AptiTrainer extends Trainer {

	void Teach() {
		System.out.println("Teaches Apti");

	}

}

class TestingTrainer extends Trainer {

	void Teach() {
		System.out.println("Teaches Testing");

	}

}
