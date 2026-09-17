public class SisaBarang {
    public static void main(String[] args) {

        int jumlahBarang = 27;
        int jumlahPerKelompok = 5;

        int sisaBarang = jumlahBarang % jumlahPerKelompok;

        System.out.printf("Jumlah barang       :\t%d%n", jumlahBarang);
        System.out.printf("Isi setiap kelompok :\t%d%n", jumlahPerKelompok);
        System.out.printf("Sisa barang         :\t%d%n", sisaBarang);
    }
}
