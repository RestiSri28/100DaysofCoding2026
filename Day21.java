public class StringKePrimitif {
    public static void main(String[] args) {

        String jumlahText = "15";
        String hargaText = "25000";
        String beratText = "2.5";

        int jumlah = Integer.parseInt(jumlahText);
        double harga = Double.parseDouble(hargaText);
        float berat = Float.parseFloat(beratText);

        System.out.println("Jumlah barang : " + jumlah);
        System.out.println("Harga barang  : " + harga);
        System.out.println("Berat barang  : " + berat);

        System.out.println("Total harga   : " + (jumlah * harga));
    }
}
