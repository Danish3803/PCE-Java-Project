package com.encapsulation;

class Area {
	int b;
	int h;
	static float half = 0.5f;
	

	public Area(int b, int h) {
		// super();
		this.b = b;
		this.h = h;
	}

	float disp() {
		
		float area = half * b * h;
		return area;
	}

	public class AreaApp {
		public static void main(String[] args) {
			Area a = new Area(10, 15);
			System.out.println(a.disp());
		}
	}
}
