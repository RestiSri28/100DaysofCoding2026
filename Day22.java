import java.util.Scanner;

public class TukarVariabel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai A: ");
        int nilaiA = input.nextInt();

        System.out.print("Masukkan nilai B: ");
        int nilaiB = input.nextInt();

        System.out.println("\nSebelum ditukar:");
        System.out.println("Nilai A = " + nilaiA);
        System.out.println("Nilai B = " + nilaiB);

        int sementara = nilaiA;
        nilaiA = nilaiB;
        nilaiB = sementara;

        System.out.println("\nSetelah ditukar:");
        System.out.println("Nilai A = " + nilaiA);
        System.out.println("Nilai B = " + nilaiB);

        input.close();
    }
}
