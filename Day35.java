import java.util.Scanner;

public class BonusKaryawan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan lama bekerja: ");
        int lamaBekerja = input.nextInt();

        System.out.print("Masukkan nilai kinerja: ");
        int nilaiKinerja = input.nextInt();

        int bonus;

        if (lamaBekerja >= 5) {
            if (nilaiKinerja >= 80) {
                bonus = 2000000;
            } else {
                bonus = 1000000;
            }
        } else {
            if (nilaiKinerja >= 80) {
                bonus = 750000;
            } else {
                bonus = 500000;
            }
        }

        System.out.println("\nHASIL");
        System.out.println("Lama Bekerja : " + lamaBekerja + " tahun");
        System.out.println("Nilai Kinerja : " + nilaiKinerja);
        System.out.println("Bonus : Rp" + bonus);

        input.close();
    }
}
