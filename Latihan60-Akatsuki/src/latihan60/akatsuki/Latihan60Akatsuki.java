/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan60.akatsuki;

/**
 *
 * @author Lenovo
 */
import java.util.ArrayList;
import java.util.List;

class Akatsuki {

    private String pakaian;

    public Akatsuki(String pakaian) {
        this.pakaian = pakaian;
    }

    public String getPakaian() {
        return pakaian;
    }

    public void tampilkanDataAkatsuki() {
        // Method kosong atau method dengan blok kosong
    }
}

class Anggota extends Akatsuki {
    private String nama;
    private String desa;

    public Anggota(String nama, String pakaian, String desa) {
        super(pakaian);
        this.nama = nama;
        this.desa = desa;
    }

    public String getNama() {
        return nama;
    }
    
    public String getDesa() {
    	return desa;
    }

    @Override
    public void tampilkanDataAkatsuki() {
        System.out.println("Saya adalah anggota akatsuki dengan nama " +  getNama() + " menggunakan " + getPakaian() + " tinggal di desa " + getDesa() + ".");
    }
}

public class Latihan60Akatsuki {

	public static void main(String[] args) {
		
		 	List<Anggota> DataAnggotaAkatsuki = new ArrayList<>();

		 	DataAnggotaAkatsuki.add(new Anggota("Itachi Uchiha", "pakaian hitam beserta corak awan merah", "Konohagakure"));
		 	DataAnggotaAkatsuki.add(new Anggota("Kisame Hoshigake", "pakaian hitam beserta corak awan merah", "Kirigakure"));
		 	DataAnggotaAkatsuki.add(new Anggota("Deidara", "pakaian hitam beserta corak awan merah", "Iwagakure"));
		 	DataAnggotaAkatsuki.add(new Anggota("Sasori", "pakaian hitam beserta corak awan merah", "Sunagakure"));
		 	DataAnggotaAkatsuki.add(new Anggota("Kakuzu", "pakaian hitam beserta corak awan merah", "Takigakure"));
		 	DataAnggotaAkatsuki.add(new Anggota("Hidan", "pakaian hitam beserta corak awan merah", "Yugakure"));
		 	DataAnggotaAkatsuki.add(new Anggota("Orochimaru", "pakaian hitam beserta corak awan merah", "Konohagakure"));
	        
	        for (Anggota anggota : DataAnggotaAkatsuki) {
	            anggota.tampilkanDataAkatsuki();
	            System.out.println("\n");
	        }

	}

}