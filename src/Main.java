import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое значение: ");
        double a = in.nextDouble();
        System.out.println("Введите второе значение: ");
        double b = in.nextDouble();
        System.out.println(a/(1/b));
    }
}