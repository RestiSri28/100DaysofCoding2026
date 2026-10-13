import java.util.Scanner;

public class GajiBersih {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double gajiPokok, tunjangan, potongan;
        double gajiKotor, gajiBersih;

        System.out.print("Masukkan gaji pokok: Rp");
        gajiPokok = input.nextDouble();

        System.out.print("Masukkan tunjangan: Rp");
        tunjangan = input.nextDouble();

        System.out.print("Masukkan potongan: Rp");
        potongan = input.nextDouble();

        gajiKotor = gajiPokok + tunjangan;
        gajiBersih = gajiKotor - potongan;

        System.out.println("\n===== RINCIAN GAJI =====");
        System.out.println("Gaji Pokok  : Rp" + gajiPokok);
        System.out.println("Tunjangan   : Rp" + tunjangan);
        System.out.println("Gaji Kotor  : Rp" + gajiKotor);
        System.out.println("Potongan    : Rp" + potongan);
        System.out.println("Gaji Bersih : Rp" + gajiBersih);

        input.close();
    }
}
