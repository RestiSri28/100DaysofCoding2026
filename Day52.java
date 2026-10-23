import java.util.Scanner;

public class TabelPerkalian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka, i = 1;

        System.out.print("Masukkan Angka: ");
        angka = input.nextInt();

        while (i <= 10) {
            System.out.println(i + " x " + angka + " = " + (i * angka));
            i++;
        }

        input.close();
    }
}
