import java.util.Scanner;

public class SuhuRuangan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("suhu ruangan: ");
        double suhu = input.nextDouble();

        boolean suhuIdeal = suhu >= 20 && suhu <= 26;
        boolean diLuarRentang = !suhuIdeal;

        System.out.println("Suhu ideal? : " + suhuIdeal);
        System.out.println("Di luar rentang ideal? : " + diLuarRentang);

        input.close();
    }
}
