import java.util.Scanner;

public class Day81 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        System.out.println("Masukkan 5 angka:");

        for (int i = 0; i < angka.length; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        System.out.println("\nSemua Elemen Array:");

        for (int i = 0; i < angka.length; i++) {
            System.out.println(angka[i]);
        }

        input.close();
    }
}
