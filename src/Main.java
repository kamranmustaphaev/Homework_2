import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Метод(процедура)
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("ထ > " + a);
        System.out.println(sum());
    }
//        Метод(Функция)
    public static int sum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number ");
        int b = scanner.nextInt();
        System.out.println("Enter next number ");
        int c = scanner.nextInt();
        System.out.println("Enter last number ");
        int d = scanner.nextInt();
        return b+c+d;
    }

}