class Pelanggan {
    private String nama;
    private double saldo;

    public Pelanggan(String nama, double saldo) {
        this.nama = nama;
        this.saldo = saldo;
    }

    public void pesan(Menu menu) {
        if (saldo >= menu.harga) {
            System.out.println(nama + " telah memesan " + menu.nama);
            saldo -= menu.harga;
            menu.pesan();
        } else {
            System.out.println("Maaf, " + nama + ", saldo tidak mencukupi untuk memesan " + menu.nama);
        }
    }

    public void topUp(double uang) {
        saldo += uang;
        System.out.println("Saldo " + nama + " telah ditambahkan. Saldo sekarang Rp" + saldo);
    }
}