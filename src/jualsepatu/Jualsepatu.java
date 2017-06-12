/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jualsepatu;

import java.util.Scanner;

/**
 *
 * @author Amar Maruf
 */
public class Jualsepatu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        tablesepatu entityObjk =new tablesepatu();
        Querysepatu tambah = new Querysepatu();
        Scanner input=new Scanner(System.in);
        String nama,nohp,alamat,merek,jenis,jwb;
        long id;
        
        System.out.println("SELAMAT DATANG ONLINE SHOP");
        System.out.println("isi identitas anda??? :");
        System.out.print("Nama Lengkap :");nama = input.nextLine();
        System.out.print("Nomor hp :");nohp=input.nextLine();
        System.out.print("Alamat :");alamat=input.nextLine();
        System.out.print("Merek :");merek=input.nextLine();
        System.out.print("Jenis :");jenis=input.nextLine();
        entityObjk.setNamapembeli(nama);
        entityObjk.setNohp(nohp);
        entityObjk.setAlamatpembeli(alamat);
        entityObjk.setMereksepatu(merek);
        entityObjk.setJenis(jenis);
        tambah.Add(entityObjk);
        
        System.out.println("Apa hasil anda ingin di tampilkan ? jawab ya/no");jwb=input.nextLine();
        if(jwb.equals("ya")){
        tambah.Show();
        }
        
        System.out.println("Apa data anda ingi anda rubah ? jawab lanjut/tidak");jwb=input.nextLine();
        if(jwb.equals("lanjut")){
            System.out.print("Nama :");nama = input.nextLine();
            System.out.print("No HP :");nohp = input.nextLine();
            System.out.print("ID :");id=input.nextLong();
            tambah.update(id,nama,nohp);
            tambah.Show();
        }
        
        System.out.println("Apakah data anda ingin di hapus kan ? jawab lanjut/tidak");jwb=input.nextLine();
        if(jwb.equals("lanjut")){
            System.out.print("ID :");id=input.nextLong();
            tambah.hapus(id);
            tambah.Show();
        }
        
    }
    
}

        
    
    

