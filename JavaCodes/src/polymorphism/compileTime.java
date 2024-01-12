package polymorphism;

public class compileTime {
    static void add(int a, int b) {
        int sum = a + b;
        System.out.println("The sum from two parameter method is : " + sum);
    }

    static void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("The sum from three parameter method is : " + sum);
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("**********************************");
        System.out.println("Compile Time Polymorphism");
        System.out.println("Method Overloading");
        System.out.println("**********************************");
        add(2, 5);
        add(2, 5, 8);

    }

}
