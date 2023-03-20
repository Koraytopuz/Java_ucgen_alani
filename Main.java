import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int a,b,c;
        Scanner girdi=new Scanner(System.in);
        System.out.println("1. Kenar uzunluğunu giriniz: ");
        a= girdi.nextInt();
        System.out.println("2.Kenar uzunluğunu giriniz: ");
        b=girdi.nextInt();
        System.out.println("3.Kenar uzunluğunu giriniz: ");
        c=girdi.nextInt();
                int u=(a+b+c);
        double alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin ALanı: "+alan);

    }
}