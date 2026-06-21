package PlaylistOOP;

public class Member extends User {

    public Member(String nama) {
        super(nama);
    }

    // Menampilkan seluruh lagu
    public void lihatPlaylist(Lagu[] playlist) {

        System.out.println("\n=== DAFTAR PLAYLIST ===");

        for (Lagu lagu : playlist) {
            if (lagu != null) {
                lagu.tampilkanInfo();
            }
        }
    }

    // Mencari lagu berdasarkan judul
    public void cariLagu(Lagu[] playlist, String judulCari) {

        boolean ditemukan = false;

        for (Lagu lagu : playlist) {

            if (lagu != null &&
                lagu.getJudul().equalsIgnoreCase(judulCari)) {

                System.out.println("\nLagu ditemukan:");
                lagu.tampilkanInfo();

                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("Lagu tidak ditemukan.");
        }
    }

    // Menghitung rata-rata durasi lagu
    public void hitungRataDurasi(Lagu[] playlist) {

        double total = 0;
        int jumlah = 0;

        for (Lagu lagu : playlist) {

            if (lagu != null) {
                total += lagu.getDurasi();
                jumlah++;
            }
        }

        System.out.println(
            "\nRata-rata durasi lagu : "
            + (total / jumlah)
            + " menit");
    }

    // Polymorphism
    @Override
    public void tampilkanAkses() {
        System.out.println("Member dapat melihat dan mencari lagu.");
    }
    
    	// Melihat detail lagu berdasarkan indeks tertentu di array
    public void lihatDetailLagu(Lagu[] playlist, int index) {
        System.out.println("\n=== DETAIL LAGU (INDEKS " + index + ") ===");
        if (index >= 0 && index < playlist.length && playlist[index] != null) {
            playlist[index].tampilkanInfo();
        } else {
            System.out.println("Lagu pada indeks tersebut tidak ditemukan atau kosong.");
        }
    }
}