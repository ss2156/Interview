package Encapsulation;

class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class EncapsulationClass {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("John");
        p1.setAge(30);

        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());
    }
}
