
package newprojectprogram;

public class NewProjectProgram {

    public static void main(String[] args) {
        // Buat daftar buku
        Book book1 = new Book("Perpustakaan UTB", "Gedung B", "Pemrograman Java", "John Doe");
        Book book2 = new Book("Perpustakaan Pusat", "Gedung A", "Dasar-Dasar OOP", "Jane Smith");
        Book book3 = new Book("Perpustakaan Mr.DIY", "Gedung A", "Struktur Data","Albert");
        Book book4 = new Book("Perpustakaan Borma", "Gedung B", "Rekayasa Perangkat Lunak","Barcode");

        // Array buku
        Book[] books = {book1, book2, book3, book4};

        // Buat objek Visitor dan Member
        Visitor visitor1 = new Visitor("Perpustakaan Pusat", "Gedung A", "Haris") {};
        Visitor visitor2 = new Visitor("Perpustakaan UTB", "Gedung B", "Nurpazri") {};
        Visitor visitor3 = new Visitor("Perpustakaan Mr.DIY", "Gedung A", "Nizar") {};
        Visitor visitor4 = new Visitor("Perpustakaan Borma", "Gedung A", "Adi Rismawan") {};

        // Membuat objek Member
        Member member1 = new Member("Perpustakaan Pusat", "Gedung A", "Bayu", "M001") {};
        Member member2 = new Member("Perpustakaan UTB", "Gedung B", "Lutfi", "C005") {};
        Member member3 = new Member("Perpustakaan Pusat", "Gedung A", "Yuda", "B006") {};

        // Visitor melihat daftar buku
        visitor1.viewBooks(books);

        // Member meminjam dan mengembalikan buku
        System.out.println();
        member1.borrowBook(book1); 
        member1.returnBook(book1); 

        member3.borrowBook(book2); 
        // Tidak ada pengembalian buku saat peminjam yang kedua
        
        member2.borrowBook(book2);

        // Menampilkan status ketersediaan buku
        System.out.println();
        visitor4.viewBooks(books);
        
    }
    
}
