// soal 1
import java.util.Scanner;

public class HimpunanBilangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan: ");
        double n = input.nextDouble();

        if (n % 1 == 0) {
            if (n % 2 == 0) {
                System.out.println("Bulat Genap");
            } else {
                System.out.println("Bulat Ganjil");
            }
        } else {
            System.out.println("Pecahan");
        }

        if (n > 0) {
            System.out.println("Positif");
        } else if (n < 0) {
            System.out.println("Negatif");
        } else {
            System.out.println("Netral");
        }

        if (n >= 0 && n % 1 == 0) {
            System.out.println("Natural/Cacah");
        }

        input.close();
    }
}


//Soal 2
import java.util.Scanner;

public class KelipatanTigaEmpat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N;

        System.out.print("Masukkan bilangan N: ");
        N = input.nextInt();

        for (int i = 1; i <= N; i++) {
            if ((i % 3 == 0 && i % 4 != 0) ||
                (i % 3 != 0 && i % 4 == 0)) {
                System.out.print(i + " ");
            }
        }

        input.close();
    }
}


//soal 3
import java.util.Scanner;

public class LebihBesarLebihKecil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int X = input.nextInt();
        int Y = input.nextInt();
        int Z = input.nextInt();

        if (Y > X) {
            X++;
        }
        if (Z > X) {
            X += 2;
        }

        if (Y < X) {
            X--;
        }
        if (Z < X) {
            X -= 2;
        }

        System.out.println(X);

        input.close();
    }
}
