import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String name;
        int age;
        double salary;

        System.out.println("Hello. What is your name?");

        name = input.next();

        System.out.println();
        System.out.println("Hi, " + name + "! How old are you?");

        age = input.nextInt();

        System.out.println();
        System.out.println("So you're " + age + ", eh? That's not old at all!");
        System.out.println("How much do you make, " + name + "?");

        salary = input.nextDouble();
        input.close();

        System.out.println();
        System.out.println(salary + "! I hope that's per hour and not per year! LOL!");
    }
}