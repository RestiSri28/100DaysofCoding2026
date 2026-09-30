import java.util.Scanner;

public class PerbandinganUmur {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur orang pertama: ");
        int umur1 = input.nextInt();

        System.out.print("Masukkan umur orang kedua: ");
        int umur2 = input.nextInt();

        System.out.println("Apakah umur orang pertama lebih besar? " + (umur1 > umur2));
        System.out.println("Apakah umur orang pertama lebih kecil? " + (umur1 < umur2));

        input.close();
    }
}
