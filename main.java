import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static PrintStream out = System.out;

    public static void main(String[] args) {
        // Считывание двух вещественных чисел a и b
        double a = in.nextDouble();
        double b = in.nextDouble();

        //Рассматриваем различные варианты введённых переменных и получаем
        //на выход ответ, исходя из вариантов решения неравенства, представленных выше
        if (b==0)
            System.out.println("Решений нет");
        else if (a==0){
            if (b>0)
                System.out.println("x-любое число");
            else
                System.out.println("x=0");
        }
        else if (a > 0 ) {
            if (b > 0)
                System.out.println("x<=" + (-a)+" x>=0");
            else
                System.out.println((-a) + "<=x<=0");
        }
        if (a<0) {
            if (b>0)
                System.out.println("x<=0  x>="+(-a));
            else
                System.out.println("0<=x<="+(-a));
        }
    }
}
