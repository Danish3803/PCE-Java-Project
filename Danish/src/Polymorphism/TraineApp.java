package Polymorphism;

public class TraineApp {
	public static void main(String[] args) {
	   JavaTrainer1 jt = new JavaTrainer1();
	   AptiTrainer1 at = new AptiTrainer1();
	   TestingTrainer1 tt = new TestingTrainer1();
	   
	   jt.Teach();
	   at.Teach();
	   tt.Teach();
	}
}

class Trainer1 {

	void Teach() {
		System.out.println("Teaches");
	}

}

class JavaTrainer1 extends Trainer {

	void Teach() {
		System.out.println("Teaches Java");

	}

}

class AptiTrainer1 extends Trainer {

	void Teach() {
		System.out.println("Teaches Apti");

	}

}

class TestingTrainer1 extends Trainer {

	void Teach() {
		System.out.println("Teaches Testing");

	}

}
