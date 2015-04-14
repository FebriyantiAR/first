
package id.co.blits.belajarFungsi;

/**
 *
 * @author Febriyanti
 */
public class KelasBelajar5 {
/**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       Prosedur prosedur = new Prosedur();//instansiasi dari kelas prosedur
       prosedur.namaSahabat();
       prosedur.luasPersegiPanjang();

       //mendapatkan nilai balik dari fungsi dengan type data integer
       Fungsi fungsi = new Fungsi();
       
       int hasil = fungsi.perhitungan();
        System.out.println("Hasil Penjumlahan = "+hasil);
        
        String nama = fungsi.Biodata();
        System.out.println("nama = "+nama);
        
     boolean nilai = fungsi.jawaban();
        System.out.println("Boolean = "+nilai);
        
        double hasilPengurangan= fungsi.Pengurangan();
        System.out.println("hasil pengurangan = "+hasilPengurangan);
        
        double alas=15, tinggi=10;
        prosedur.luasSegitiga(alas,tinggi);
        
         
    }
    
 
}
