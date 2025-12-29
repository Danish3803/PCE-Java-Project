package Polymorphism;

public class Traine {
	public static void main(String[] args) {
		Trainer t;

		t = new JavaTrainer();
		t.Teach();
		t = new AptiTrainer();
		t.Teach();
		t = new TestingTrainer();
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
