public class Day76 {
    public static void main(String[] args) {

        String kalimat = "Belajar Pemrograman Java";
        String nama = "Resti";
        String teks = "   Selamat Datang   ";

        // Menggunakan substring()
        System.out.println("Substring: " + kalimat.substring(8));

        // Menggunakan replace()
        System.out.println("Replace: " + kalimat.replace("Java", "Python"));

        // Menggunakan trim()
        System.out.println("Trim: " + teks.trim());

    }
}
