import java.util.Scanner;

@FunctionalInterface
public interface Assignment1 {
    public abstract void add();
}

class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Assignment1 numbers = () -> {
            System.out.println("enter first number");
            int num1 = sc.nextInt();
            System.out.println("enter first number");
            int num2 = sc.nextInt();
            int result = num1 + num2;

            System.out.println(result);

        };
        numbers.add();
    }

}