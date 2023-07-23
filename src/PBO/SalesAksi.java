package PBO;
import java.util.Scanner;
public class SalesAksi {
    public static void main(String[] args) {
        //objek
        //SalesPromotion sales = new SalesPromotion("Citra Andiny","0102001","5");
        
        //System.out.println(sales.displayInfo());
        //System.out.println(sales.displayInfo("Aktif"));
        
        try{
        //io sederhana
        Scanner scanner = new Scanner(System.in);
        
        //array
        SalesDetail[] sales = new SalesDetail[2];
        
        for(int i=0; i<sales.length; i++){
        System.out.print("Nama Sales"+(i+1)+": ");
        String nama = scanner.nextLine();
        System.out.print("Nip: "+(i+1)+": ");
        String nip = scanner.nextLine();
        System.out.print("Unit Terjual: "+(i+1)+": ");
        String unitterjual = scanner.nextLine();
        
        //objek
        sales[i] = new SalesDetail(nama, nip, unitterjual);
        }
        for(SalesDetail data: sales){
            System.out.println("-------------------");
            System.out.println("Data Sales: ");
            System.out.println(data.displayInfo());
        }   
        

        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Nip sales tidak sesuai format: "+e.getMessage() );
        }catch (Exception e){
            System.out.println("Input Bonus harus angka:"+e.getMessage());
        }
}
}
