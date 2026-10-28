import java.util.Scanner;

public class GanjilGenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, i;

        System.out.print("Masukkan nilai N: ");
        n = input.nextInt();

        System.out.println("Angka Ganjil:");
        i = 1;

        while (i <= n) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println();

        System.out.println("Angka Genap:");
        i = 1;

        while (i <= n) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        input.close();
    }
}
