class Xyz {
    Xyz() {
        System.out.println("1");
    }
}

abstract class A extends Xyz {
    void sum() {
        System.out.println("2");
    }

    abstract void show();
    abstract void show(int a);
}

class B extends A {
    void show() {
        System.out.println("3");
    }

    void show(int a) {
        System.out.println("4");
    }
}

class Abstraction1 {
    public static void main(String[] args) {
        A ob1;
        System.out.println("5");
        // A ob2 = new A(); // Still invalid - cannot instantiate abstract class

        // Example instantiation:
        B ob = new B(); // This will call constructors from Xyz → A → B
        ob.show();      // Outputs: 3
        ob.show(10);    // Outputs: 4
        ob.sum();       // Outputs: 2
    }
}
