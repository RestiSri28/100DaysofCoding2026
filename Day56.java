import java.util.Scanner;

public class CetakAngka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n, i;

        System.out.print("Masukkan nilai N: ");
        n = input.nextInt();

        System.out.println("Angka 1 sampai N:");
        i = 1;

        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        System.out.println("Angka N sampai 1:");
        i = n;

        while (i >= 1) {
            System.out.print(i + " ");
            i--;
        }

        input.close();
    }
}
