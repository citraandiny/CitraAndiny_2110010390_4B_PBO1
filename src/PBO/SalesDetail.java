package PBO;

//inheritance
public class SalesDetail extends SalesPromotion{
    //overriding
    public SalesDetail(String nama, String nip, String unitterjual) {
        super(nama, nip, unitterjual);
    }
    public int getBonus(){
        return Integer.parseInt(getUnitterjual().substring(0)) * 100000;
    }
    public String getWilayah(){
        String kdWil = getNip().substring(0, 2);
        switch (kdWil) {
            case "01":
                return "Banjarbaru";
            case "02":
                return "Martapura";
            default:
                return "Banjarmasin";
        }
    }
    public String getJenisbarang(){
        String kdBar = getNip().substring(2, 4);
        switch (kdBar) {
            case "01":
                return "Beat";
            case "02":
                return "Scoopy";
            default:
                return "Pcx";
        }
    }
    // polymorphism overiding
    @Override
    public String displayInfo(){
        return super.displayInfo()+
                "\nWilayah: "+getWilayah()+
                "\nBarang: "+getJenisbarang()+
                "\nTotal Bonus: "+getBonus(); 
    }
}   

