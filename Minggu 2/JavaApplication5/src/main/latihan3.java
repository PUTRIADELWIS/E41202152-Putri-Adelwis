
package main;

public class latihan3 {
    public static void main(String[] args) {
        buku b1 = new buku();
        b1.setInfoBuku("Pujangga", 10);
        b1.showInfoBuku();
    }
}

class buku {
    String judul;
    int jumlah;
    
    public void setInfoBuku(String judul, int jumlah) {
        
        this.judul = judul;
        this.jumlah = jumlah;
        
    }
    
    public void showInfoBuku() {
        
        System.out.println("Judul buku: " + judul);
        System.out.println("Jumlah buku: " + jumlah);
        
    }
    
}
