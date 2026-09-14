import java.util.Scanner;

public class Biodata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("BIODATA DIRI");

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan jenis kelamin: ");
        String jenisKelamin = input.nextLine();

        System.out.print("Masukkan alamat: ");
        String alamat = input.nextLine();

        System.out.print("Masukkan asal sekolah: ");
        String sekolah = input.nextLine();

        System.out.println("\n=== BIODATA DIRI ===");
        System.out.println("Nama           : " + nama);
        System.out.println("Umur           : " + umur + " tahun");
        System.out.println("Jenis Kelamin  : " + jenisKelamin);
        System.out.println("Alamat         : " + alamat);
        System.out.println("Asal Sekolah   : " + sekolah);

        input.close();
    }
}
