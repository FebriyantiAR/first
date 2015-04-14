
package id.co.blits.belajarFungsi;

/**
 *
 * @author Febriyanti
 */
public class Prosedur {
    void namaSahabat(){
        System.out.println("Merly");
    }
    void luasPersegiPanjang(){
     int penjang=10, lebar=8;
     int luas = penjang*lebar;
     System.out.println("Luas Persegi Panjang = "+luas);
 }
    
    void luasSegitiga(double alas,double tinggi){
        double luas = (alas*tinggi)/2;
        System.out.println("Luas Segi Tiga = "+luas);
    }
}
