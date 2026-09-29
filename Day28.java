import java.util.Scanner;

public class PerbandinganBilangan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        int bilangan1 = input.nextInt();

        System.out.print("Masukkan bilangan kedua: ");
        int bilangan2 = input.nextInt();

        System.out.println("Apakah kedua bilangan sama? " + (bilangan1 == bilangan2));
        System.out.println("Apakah kedua bilangan berbeda? " + (bilangan1 != bilangan2));

        input.close();
    }
}
