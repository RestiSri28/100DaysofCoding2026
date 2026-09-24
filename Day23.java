import java.util.Scanner;

public class LuasPersegi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi persegi: ");
        int sisi = input.nextInt();

        int luas = sisi * sisi;

        System.out.println("\n HASIL PERHITUNGAN ");
        System.out.println("Sisi persegi : " + sisi);
        System.out.println("Luas persegi : " + luas);

        input.close();
    }
}
