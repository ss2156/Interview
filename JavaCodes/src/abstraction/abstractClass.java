package abstraction;

abstract class A {
    void display() {
        System.out.println("Hello, I am display() from abstract class");
    }

    abstract void show();
}

class B extends A {
    void show() {
        System.out.println("Here in class B, Show() of abstract class implemented");
    }
}

public class abstractClass {
    public static void main(String[] args) {
        System.out.println();
        B obj = new B();
        obj.display();
        obj.show();
        System.out.println();
    }

}
