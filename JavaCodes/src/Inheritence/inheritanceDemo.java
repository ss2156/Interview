package Inheritence;

import java.util.Scanner;

class data {
    int m, n;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the values of M : ");
        m = sc.nextInt();
        System.out.print("Enter the values of N : ");
        n = sc.nextInt();
        sc.close();
    }

    void putData() {
        System.out.println(" M = " + m + " And N = " + n);
    }

}

class operation extends data {
    int sum;

    void add() {
        sum = m + n;
        System.out.println(" SUM = " + sum);
    }
}

public class inheritanceDemo {

    public static void main(String[] args) {
        operation ob = new operation();
        ob.getData();
        ob.putData();
        ob.add();
    }

}
