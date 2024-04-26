import java.util.ArrayList;
import java.util.List;

class Kantin {
    private String namaKantin;
    private List<Menu> daftarMenu;

    public Kantin(String namaKantin) {
        this.namaKantin = namaKantin;
        this.daftarMenu = new ArrayList<>();
    }

    public void tambahMenu(Menu menu) {
        daftarMenu.add(menu);
    }

    public void tampilkanMenu() {
        System.out.println("Menu di " + namaKantin + ":");
        for (Menu menu : daftarMenu) {
            menu.deskripsi();
        }
    }
}