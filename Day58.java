import java.util.Scanner;

public class GanjilGenapTerbalik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, i;

        System.out.print("Masukkan nilai N: ");
        n = input.nextInt();

        System.out.println("Angka Ganjil:");
        i = n;

        while (i >= 1) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            i--;
        }

        System.out.println();

        System.out.println("Angka Genap:");
        i = n;

        while (i >= 1) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i--;
        }

        input.close();
    }
}
