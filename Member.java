package newprojectprogram;

import java.util.Scanner;
public class Member extends Visitor {
    
    private String memberID;

    public Member(String libraryname, String building, String name, String memberID) {
        super(libraryname, building, name);
        this.memberID = memberID;
    }

    public String getMemberID() {
        return memberID;
    }

    // Peminjaman buku
    public void borrowBook(Book book) {
            System.out.println("===========================================");
            System.out.println("          DAFTAR PEMINJAMAN BUKU           ");
            System.out.println("===========================================");
            System.out.println("Nama Peminjam     : "+getNama());
            System.out.println("Member ID         : "+getMemberID());
            System.out.println("-------------------------------------------");
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("STATUS BUKU       : ( Tersedia )");
            System.out.println("Judul Buku        : "+book.getTitle());
            System.out.println("Penulis           : "+book.getAuthor());
            System.out.println("Nama Perpustakaan : "+book.getLibraryName());
            System.out.println("Gedung            : "+book.getBuilding());
            System.out.println("<<< Buku telah berhasil dipinjam >>>");
        } else {
            System.out.println("STATUS BUKU       : ( Tidak Tersedia )");
            System.out.println("Judul Buku        : "+book.getTitle());
            System.out.println("Penulis           : "+book.getAuthor());
            System.out.println("Asal Perpustakaan : "+book.getLibraryName());
            System.out.println("Gedung            : "+book.getBuilding());
            System.out.println("<<< Buku dengan keterangan diatas (SUDAH DIPINJAM) >>>");
            System.out.println("<<< Silahkan pilih buku yang lain. >>>");
        }
        System.out.println("\n");
    }
    

    // Pengembalian buku
    public void returnBook(Book book) {
        Scanner input = new Scanner (System.in);
        book.setAvailable(true);
        int daysLate;
        System.out.println("===========================================");
        System.out.println("        <<< Pengembalian Buku >>>> ");
        System.out.println("===========================================");
        System.out.println("Nama Peminjam        : "+getNama());
        System.out.print("Keterlambatan (hari) : ");
        daysLate = input.nextInt();
        if (daysLate > 0) {
            int fine = daysLate * 2000;// Denda 2000 per hari terlambat
            System.out.println("Total Denda          : Rp."+fine);
        } else {
            System.out.println(getNama() + " mengembalikan buku tepat waktu.");
        }
        System.out.println("\n");
    }
}