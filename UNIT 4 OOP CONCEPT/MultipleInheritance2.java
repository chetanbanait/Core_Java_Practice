interface A {
	default void show1() {
		System.out.println("1 from A");
	}
}

interface B {
	default void show1() {
		System.out.println("2 from B");
	}
}

class C implements A, B {
	public void show1() {
		System.out.println("Resolved conflict in C");
	}
}

class MultipleInheritance2 {
	public static void main(String[] args) {
		C ob = new C();
		ob.show1();
	}
}
