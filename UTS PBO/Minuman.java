class Minuman extends Menu {
    private String ukuran;

    public Minuman(String nama, double harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }

    public void pesan() {
        System.out.println("Pesanan minuman " + nama + " telah diterima.");
    }

    public String getUkuran() {
        return ukuran;
    }

}