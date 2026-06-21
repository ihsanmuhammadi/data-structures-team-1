package PlaylistOOP;

/*
 * TUGAS KELOMPOK 1
 * Nama :
 * 1. Muhammad Rizal Mutaqien - 2902795205
 * 2. SONYA BR SINAGA - 2902763046
 * 3. KEVIN HANDOKO - 2902770871
 * 4. IHSAN MUHAMMAD IQBAL - 2902790545
 * 5. MUHAMMAD ASHRAF MUTAWALLY - 2902787670
 */

public class PlaylistOOP {

    public static void main(String[] args) {

        // Array untuk menyimpan objek Lagu
        Lagu[] playlist = new Lagu[10];

        // Membuat objek Admin dan Member
        Admin admin = new Admin("Admin");
        Member member = new Member("Member");

        // Admin menambahkan lagu ke playlist
        admin.tambahLagu(
                playlist,
                new Lagu("Hati-Hati di Jalan", "Tulus", 4.2),
                0);

        admin.tambahLagu(
                playlist,
                new Lagu("Monokrom", "Tulus", 3.9),
                1);

        admin.tambahLagu(
                playlist,
                new Lagu("Komang", "Raim Laode", 4.5),
                2);

        // Admin melihat daftar lagu
        admin.lihatPlaylist(playlist);

        // Demonstrasi Polymorphism
        User u1 = admin;
        User u2 = member;

        System.out.println("=== HAK AKSES ===");
        u1.tampilkanAkses();
        u2.tampilkanAkses();

        // Menampilkan playlist
        member.lihatPlaylist(playlist);

        // Mencari lagu
        member.cariLagu(playlist, "Komang");

        // Menghitung rata-rata durasi
        member.hitungRataDurasi(playlist);
        
        // Member melihat detail lagu berdasarkan indeks tertentu
        member.lihatDetailLagu(playlist, 1); // Melihat lagu indeks ke-1 (Monokrom)
    }
}