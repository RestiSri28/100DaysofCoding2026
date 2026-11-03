import java.util.Scanner;

public class Pangkat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai M: ");
        int M = input.nextInt();

        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        int hasil = 1;

        for (int i = 1; i <= N; i++) {
            hasil *= M;
        }

        System.out.println(M + " pangkat " + N + " = " + hasil);

        input.close();
    }
}
