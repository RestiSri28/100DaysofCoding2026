import java.util.Scanner;

public class PerbandinganSuhu {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan suhu: ");
        double suhu = input.nextDouble();

        System.out.println(suhu + " >= 30.0 = " + (suhu >= 30.0));
        System.out.println(suhu + " <= 30.0 = " + (suhu <= 30.0));

        input.close();
    }
}
