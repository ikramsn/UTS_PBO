class Makanan extends Menu {
    private String jenis;

    public Makanan(String nama, double harga, String jenis) {
        super(nama, harga);
        this.jenis = jenis;
    }

    public void pesan() {
        System.out.println("Pesanan makanan " + nama + " telah diterima.");
    }

    public String getJenis() {
        return jenis;
    }

}