
//soal 1

import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int jumlah = 0;
        int faktorial = 1;

        System.out.print("Masukkan angka N: ");
        n = input.nextInt();

        System.out.print("Deret 1 ke " + n + " : ");

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            jumlah = jumlah + i;
            faktorial = faktorial * i;
        }

        System.out.println();

        System.out.print("Deret " + n + " ke 1 : ");

        int i = n;

        do {
            System.out.print(i + " ");
            i--;
        } while (i >= 1);

        System.out.println();
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Faktorial : " + faktorial);

        input.close();
    }
}

//soal 2
import java.util.Scanner;

public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int jumlahGenap = 0;
        int jumlahGanjil = 0;
        int totalGenap = 0;
        int totalGanjil = 0;

        System.out.print("Masukkan angka N: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            if (i % 2 == 0) {
                jumlahGenap = jumlahGenap + i;
                totalGenap++;
            } else {
                jumlahGanjil = jumlahGanjil + i;
                totalGanjil++;
            }
        }

        System.out.println("Jumlah angka genap : " + jumlahGenap);
        System.out.println("Total angka genap : " + totalGenap);

        System.out.println("Jumlah angka ganjil : " + jumlahGanjil);
        System.out.println("Total angka ganjil : " + totalGanjil);

        input.close();
    }
}

//soal 3

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Masukkan ukuran persegi: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        input.close();
    }
}

//soal 4
import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Masukkan batas atas N: ");
        n = input.nextInt();

        for (int i = 3; i <= n; i += 3) {

            if (i % 2 == 0) {
                System.out.print("Genap ");
            } else {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}
