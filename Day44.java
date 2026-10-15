import java.util.Scanner;

public class PredikatNilai {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nama, predikat, status;
        int nilai;

        System.out.print("Masukkan nama: ");
        nama = input.nextLine();

        System.out.print("Masukkan nilai: ");
        nilai = input.nextInt();

        if (nilai < 0 || nilai > 100) {
            System.out.println("Nilai tidak valid");
        } else {
            if (nilai >= 85) {
                predikat = "A";
            } else if (nilai >= 75) {
                predikat = "B";
            } else if (nilai >= 65) {
                predikat = "C";
            } else if (nilai >= 50) {
                predikat = "D";
            } else {
                predikat = "E";
            }

            if (nilai >= 60) {
                status = "Lulus";
            } else {
                status = "Tidak Lulus";
            }

            System.out.println("\nNama : " + nama);
            System.out.println("Nilai : " + nilai);
            System.out.println("Predikat Nilai : " + predikat);
            System.out.println("Status = " + status);
        }

        input.close();
    }
}
