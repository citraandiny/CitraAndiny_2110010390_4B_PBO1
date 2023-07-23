
package PBO;

//class
public class SalesPromotion {
    //atribut dan encapsulasi
    private String nama;
    private String nip;
    private String unitterjual;
    
    //constructor
    public SalesPromotion(String nama, String nip, String unitterjual) {   
        this.nama = nama;
        this.nip = nip;
        this.unitterjual = unitterjual;
    }

    //mutator atau setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setUnitterjual(String unitterjual) {
        this.unitterjual = unitterjual;
    }
    
    public String getNama(){
        return nama; 
    }

    public String getNip() {
        return nip;
    }

    //accessor atau getter
    public String getUnitterjual() {
        return unitterjual;
    } 

    public String displayInfo() {
        return "Nama: "  +getNama()+"\nNip: "+getNip()+"\nUnit Terjual: "+getUnitterjual();
    }
    //polymorpism overloading  
    public String displayInfo(String status){
        return displayInfo() + "\nStatus: "+status; 
    }
}
