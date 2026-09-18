import java.util.Scanner;

public class Saldo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan saldo awal : ");
        int saldo = input.nextInt();

        System.out.print("Masukkan uang masuk : ");
        int uangMasuk = input.nextInt();

        System.out.print("Masukkan pengeluaran : ");
        int pengeluaran = input.nextInt();

        saldo += uangMasuk;
        saldo -= pengeluaran;

        System.out.printf("%nSaldo awal   :\t%d%n", saldo - uangMasuk + pengeluaran);
        System.out.printf("Uang masuk   :\t%d%n", uangMasuk);
        System.out.printf("Pengeluaran  :\t%d%n", pengeluaran);
        System.out.printf("Saldo akhir  :\t%d%n", saldo);

        input.close();
    }
}
