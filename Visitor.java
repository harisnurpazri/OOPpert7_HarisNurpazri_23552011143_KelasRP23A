package newprojectprogram;
public class Visitor extends Library {
    private String name;

    public Visitor(String libraryname, String building, String name) {
        super(libraryname, building);
        this.name = name;
    }

    public String getNama() {
        return name;
    }

    // Melihat buku yang ada di perpustakaan
    public void viewBooks(Book[] books) {
        System.out.println("===========================================");
        System.out.println("               PERPUSTAKAAN");
        System.out.println("===========================================");
        System.out.println("Nama Pengunjung   : "+name);
        System.out.println("Nama Perpustakaan : "+getLibraryName());
        System.out.println("Nama Gedung       : "+getBuilding());
        System.out.println("-------------------------------------------");
        System.out.println("                DAFTAR BUKU");
        System.out.println("-------------------------------------------");
        
        
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];  // Mengambil buku di index ke-i

            String availability;  // Variabel untuk menyimpan status ketersediaan buku

            // Memeriksa apakah buku tersedia atau tidak
            if (book.isAvailable()) {
                availability = " ( Tersedia )";  // Jika tersedia
            } else {
                availability = " ( Tidak Tersedia )";  // Jika tidak tersedia
            }

            // Menampilkan informasi buku dan status ketersediaannya
            System.out.println("-> " + book.getTitle() + " oleh " + book.getAuthor() + availability);
        }
    }

}
