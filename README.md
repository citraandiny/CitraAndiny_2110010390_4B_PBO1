# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data Laporan Penjualan Sales menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa NIP, Nama Sales dan Jumlah Unit Terjual, dan memberikan output berupa informasi wilayah pemasaran dan nama barang yang terjual berdasarkan nip dan Bonus berdasarkan unit yang terjual

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `SalesPromotion`, `SalesDetail`, dan `SalesAksi` adalah contoh dari class.

```bash
public class SalesPromotion {
    ...
}

public class SalesDetail extends SalesPromotion{
    ...
}

public class SalesAksi {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `sales[i] = new SalesDetail(nama, nip, unitterjual);` adalah contoh pembuatan object.

```bashsales[i] = new SalesDetail(nama, nip, unitterjual);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `nip`, `nama`  dan `unitterjual` adalah contoh atribut.

```bash
String nama;
String nip;
String unitterjual;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `SalesPromotion` dan `SalesDetail`.

```bash
public SalesPromotion(String nama, String nip, String unitterjual) {   
        this.nama = nama;
        this.nip = nip;
        this.unitterjual = unitterjual;
}

public SalesDetail(String nama, String nip, String unitterjual) {
        super(nama, nip, unitterjual);
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setNip` , `setNama` dan `setUnitterjual` adalah contoh method mutator.

```bash
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
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getNip`, `getNama`, `getUnitterujual` , `getWilayah` , `getJenisBarang`, `getBonus`, adalah contoh method accessor.

```bash
public String getNama(){
        return nama; 
    }

    public String getNip() {
        return nip;
    }


    public String getUnitterjual() {
        return unitterjual;
    } 
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nip` , `nama` dan `unitterjual` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
 private String nama;
    private String nip;
    private String unitterjual;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `SalesDetail` mewarisi `SalesPromotion` dengan sintaks `extends`.

```bash
public class SalesDetail extends SalesPromotion{
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `SalesPromotion` merupakan overloading method `displayInfo` dan `displayInfo` di `SalesDetail` merupakan override dari method `displayInfo` di `SalesPromotion`.

```bash
public String displayInfo(String status){
        return displayInfo() + "\nStatus: "+status;}

@Override
public String displayInfo() {
    ...
}
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` dalam method `getWilayah` dan `getJenisBarang` .

```bash
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
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for(int i=0; i<sales.length; i++){
    ...
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
System.out.print("Nama Sales"+(i+1)+": ");
        String nama = scanner.nextLine();
        System.out.print("Nip: "+(i+1)+": ");
        String nip = scanner.nextLine();
        System.out.print("Unit Terjual: "+(i+1)+": ");
        String unitterjual = scanner.nextLine();
        
        sales[i] = new SalesDetail(nama, nip, unitterjual);
        }
        for(SalesDetail data: sales){
            System.out.println("-------------------");
            System.out.println("Data Sales: ");
            System.out.println(data.displayInfo());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `SalesDetail[] sales = new SalesDetail[2];` adalah contoh penggunaan array.

```bash
SalesDetail[] sales = new SalesDetail[2];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
try {
    }catch (StringIndexOutOfBoundsException e){
            System.out.println("Nip sales tidak sesuai format: "+e.getMessage() );
        }catch (Exception e){
            System.out.println("Input Bonus harus angka:"+e.getMessage());
        }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Citra Andiny
NPM: 2110010390
