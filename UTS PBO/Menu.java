class Menu {
    protected String nama;
    protected double harga;

    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public void deskripsi() {
        System.out.println(nama + " - Rp" + harga);
    }

    public void pesan() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'pesan'");
    }
}
