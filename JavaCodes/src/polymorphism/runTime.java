package polymorphism;

class first {
    void display() {
        System.out.println("Display of Super class (first)");
    }
}

class second extends first {
    void display() {
        System.out.println("Display of child class (second)");
    }
}

public class runTime {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("*********************************");
        System.out.println("Run Time Polymorphism");
        System.out.println("Method Overriding");
        System.out.println("*********************************");
        second s = new second();
        s.display();

    }

}
