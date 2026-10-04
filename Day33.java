import java.util.Scanner;

public class CekUmur {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print(" ");
        int umur = input.nextInt();

        if (umur >= 17) {
            System.out.println("Boleh membuat KTP");
        } else {
            System.out.println("Belum boleh membuat KTP");
        }

        input.close();
    }
}
