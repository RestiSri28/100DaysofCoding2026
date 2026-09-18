import java.util.Scanner;

public class OperatorPenugasan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai awal: ");
        int angka = input.nextInt();

        System.out.print("Masukkan nilai penambahan: ");
        int tambah = input.nextInt();
        angka += tambah;
        System.out.println("Hasil += : " + angka);

        System.out.print("Masukkan nilai pengurangan: ");
        int kurang = input.nextInt();
        angka -= kurang;
        System.out.println("Hasil -= : " + angka);

        System.out.print("Masukkan nilai perkalian: ");
        int kali = input.nextInt();
        angka *= kali;
        System.out.println("Hasil *= : " + angka);

        System.out.print("Masukkan nilai pembagian: ");
        int bagi = input.nextInt();
        angka /= bagi;
        System.out.println("Hasil /= : " + angka);

        System.out.print("Masukkan nilai modulus (%): ");
        int modulus = input.nextInt();
        angka %= modulus;
        System.out.println("Hasil %= : " + angka);

        input.close();
    }
}
