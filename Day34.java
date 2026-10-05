import java.util.Scanner;

public class DiskonBelanja {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan total belanja: ");
        double totalBelanja = input.nextDouble();

        double persentaseDiskon;

        if (totalBelanja >= 500000) {
            persentaseDiskon = 20;
        } else if (totalBelanja >= 300000) {
            persentaseDiskon = 15;
        } else if (totalBelanja >= 100000) {
            persentaseDiskon = 10;
        } else {
            persentaseDiskon = 0;
        }

        double besarDiskon = totalBelanja * persentaseDiskon / 100;
        double totalBayar = totalBelanja - besarDiskon;

        System.out.println("\nHASIL BELANJA");
        System.out.println("Total Belanja : Rp" + totalBelanja);
        System.out.println("Diskon        : " + persentaseDiskon + "%");
        System.out.println("Besar Diskon  : Rp" + besarDiskon);
        System.out.println("Total Bayar   : Rp" + totalBayar);

        input.close();
    }
}
