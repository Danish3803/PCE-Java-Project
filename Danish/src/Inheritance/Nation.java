package Inheritance;

public class Nation {
	public static void main(String[] args) {
		Army a = new Army();
		Navy n = new Navy();
		AirForce ai = new AirForce();

		System.out.println("<<<<<<<<<<<<<<<Army>>>>>>>>>>>>>>>>>");
		a.Job();
		a.Protect();
		a.useTank();
		System.out.println("");

		System.out.println("<<<<<<<<<<<<<<<Navy>>>>>>>>>>>>>>>>>");
		n.Job();
		n.Protect();
		n.useShips();
		System.out.println("");

		System.out.println("<<<<<<<<<<<<<<<AirForce>>>>>>>>>>>>>");
		ai.Job();
		ai.Protect();
		ai.useJets();

	}
}

class SecurityForce {

	void Job() {
		System.out.println("To protect The Nation");
	}

	void Protect() {
		System.out.println("Protect Country");
	}

}

class Army extends SecurityForce {

	void Protect() {
		System.out.println("To protect land");

	}

	void useTank() {
		System.out.println("Army uses Tanks");
	}

}

class Navy extends SecurityForce {

	void Protect() {
		System.out.println("To protect ocean");

	}

	void useShips() {
		System.out.println("Navy uses Ships");
	}

}

class AirForce extends SecurityForce {

	void Protect() {
		System.out.println("To protect Air ways");

	}

	void useJets() {
		System.out.println("AirForce uses Jets");
	}

}
