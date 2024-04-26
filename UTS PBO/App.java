public class App {
    public static void main(String[] args) {
        Kantin kantinUniversitas = new Kantin("Kantin Universitas");

        // Menambahkan menu
        Makanan menuNasiGoreng = new Makanan("Nasi Goreng", 15000, "Makanan Berat");
        Minuman menuEsTeh = new Minuman("Es Teh", 5000, "Sedang");
        kantinUniversitas.tambahMenu(menuNasiGoreng);
        kantinUniversitas.tambahMenu(menuEsTeh);

        // Menampilkan menu
        kantinUniversitas.tampilkanMenu();

        // Membuat pelanggan baru
        Pelanggan andi = new Pelanggan("Andi", 30000);

        // Andi memesan makanan dan minuman
        andi.pesan(menuNasiGoreng);
        andi.pesan(menuEsTeh);

        // Menambahkan saldo Andi
        andi.topUp(20000);
    }
}