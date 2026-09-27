// soal 1
import java.util.Scanner;

public class LuasSegitiga {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double alas = input.nextDouble();
        double tinggi = input.nextDouble()

        double luas = 0.5 * alas * tinggi;

        System.out.println(luas);
    }
}

// soal 2
import java.util.Scanner;

public class MenghitungUmur {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tahunLahir = input.nextInt();
        int tahunSekarang = input.nextInt();

        int umur = tahunSekarang - tahunLahir;

        System.out.println(umur + " Tahun");
    }
}

// soql 3
import java.util.Scanner;

public class CelsiusKeFahrenheit {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double celsius = input.nextDouble();

        double fahrenheit = celsius * 9 / 5 + 32;

        System.out.println(fahrenheit + " Fahrenheit");
    }
}

// soal 4
import java.util.Scanner;

public class RupiahKeDollar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double rupiah = input.nextDouble();

        double dollar = rupiah / 17889;

        System.out.printf("%.2f USD%n", dollar);
    }
}

// soal 5
import java.util.Scanner;

public class SisaBuku {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int jumlahBuku = input.nextInt();
        int jumlahRak = input.nextInt();

        int sisaBuku = jumlahBuku % jumlahRak;

        System.out.println(sisaBuku);
    }
}

// soal 6
import java.util.Scanner;

public class CharKeInt {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char karakter = input.next().charAt(0);

        int nilai = (int) karakter;

        System.out.println(nilai);
    }
}

// soal 7
import java.util.Scanner;

public class NomorTelepon {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String nomor1 = input.nextLine();
        String nomor2 = input.nextLine();
        String nomor3 = input.nextLine();

        System.out.println(nomor1 + "-" + nomor2 + "-" + nomor3);
    }
}
