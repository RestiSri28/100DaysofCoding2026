import java.util.Scanner;

public class StatusNilaiMahasiswa {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian: ");
        double nilaiUjian = input.nextDouble();

        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Masukkan status kehadiran (true/false): ");
        boolean kehadiran = input.nextBoolean();

        boolean hasil = (nilaiUjian >= 75 && nilaiTugas >= 70) || kehadiran;
        boolean statusKehadiran = !kehadiran;

        System.out.println("\n=== HASIL ===");
        System.out.println("Nilai ujian : " + nilaiUjian);
        System.out.println("Nilai tugas : " + nilaiTugas);
        System.out.println("Kehadiran   : " + kehadiran);
        System.out.println("Hasil       : " + hasil);
        System.out.println("NOT kehadiran : " + statusKehadiran);

        input.close();
    }
}
