import java.util.Scanner;

public class OperatorTernary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int umur;
        String hasil;

        System.out.print("Masukkan umur: ");
        umur = input.nextInt();

        hasil = (umur >= 17) ? "Sudah cukup umur" : "Belum cukup umur";

        System.out.println(hasil);

        input.close();
    }
}
