public class Day75 {
    public static void main(String[] args) {

        String kata1 = "Java";
        String kata2 = "java";
        String kalimat = "Saya belajar Java";
        String teks = "";

        System.out.println("Equals: " + kata1.equals(kata2));

        System.out.println("Equals Ignore Case: " 
                + kata1.equalsIgnoreCase(kata2));

        System.out.println("Contains: " 
                + kalimat.contains("Java"));

        System.out.println("Is Empty: " + teks.isEmpty());

    }
}
