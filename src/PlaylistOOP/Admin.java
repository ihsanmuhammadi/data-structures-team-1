package PlaylistOOP;

public class Admin extends User {

    public Admin(String nama) {
        super(nama);
    }

    // Menambahkan lagu ke playlist
    public void tambahLagu(Lagu[] playlist, Lagu lagu, int index) {
        playlist[index] = lagu;
    }

    // Polymorphism
    @Override
    public void tampilkanAkses() {
        System.out.println("Admin dapat menambah dan melihat lagu.");
    }
    
    // Menampilkan seluruh lagu di playlist (Fitur tambahan Admin)
    public void lihatPlaylist(Lagu[] playlist) {
        System.out.println("\n=== DAFTAR PLAYLIST (AKSES ADMIN) ===");
        boolean adaLagu = false;

        for (Lagu lagu : playlist) {
            if (lagu != null) {
                lagu.tampilkanInfo();
                adaLagu = true;
            }
        }
        
        if (!adaLagu) {
            System.out.println("Playlist masih kosong.");
        }
    }
}