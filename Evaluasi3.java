// soal 1

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama = input.nextLine();
        String prodi = input.nextLine();

        System.out.println("Perkenalkan saya " + nama + ", dari prodi " + prodi + ".");
    }
}

//soal 2

public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello, World!");
        }

    }
}

//soal 3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String kalimat = input.nextLine();
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(kalimat);
        }
    }
}
