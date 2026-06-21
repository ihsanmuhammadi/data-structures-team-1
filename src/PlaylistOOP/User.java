package PlaylistOOP;

public class User {

    protected String nama;

    // Constructor User
    public User(String nama) {
        this.nama = nama;
    }

    // Method yang akan dioverride
    public void tampilkanAkses() {
        System.out.println("User memiliki akses umum.");
    }
}