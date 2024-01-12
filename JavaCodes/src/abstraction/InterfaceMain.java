package abstraction;

interface Printable {
    void display();
}

public class InterfaceMain implements Printable {
    public void display() {
        System.out.println("Hello, I am Interface Class");
    }

    public static void main(String args[]) {
        InterfaceMain obj = new InterfaceMain();
        obj.display();
    }
}
