/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bunga;

/**
 *
 * @author Irawa
 */
public class Main {

    public static void main(String[] args) {

        Bunga_Kamboja bunga = new Bunga_Kamboja();

        bunga.setnama_ilmiah("Plumeria rubra");
        bunga.setWarna("Merah");
        bunga.setIklim("Tropis");
        bunga.setTanah("Berdrainase baik");
        bunga.setHewan_penyerbuk("Lebah");

        System.out.println("\t\t\tBunga Kamboja");
        System.out.println("Nama Ilmiah       : " + bunga.getnama_ilmiah());
        System.out.println("Warna             : " + bunga.getWarna());
        System.out.println("Iklim             : " + bunga.getIklim());
        System.out.println("Tanah             : " + bunga.getTanah());
        System.out.println("Hewan Penyerbuk   : " + bunga.getHewan_penyerbuk());
        
        Bunga_Matahari bm = new Bunga_Matahari();

        bm.setnama_ilmiah("Heliantus anuus");
        bm.setWarna("Kuning");
        bm.setIklim("SubTropis");
        bm.setTanah("Tanah yang baik drainasenya, kaya nutrisi");
        bm.setHewan_penyerbuk("Lebah");

        System.out.println("\n\t\t\tBunga Matahari");
        System.out.println("Nama Ilmiah       : " + bm.getnama_ilmiah());
        System.out.println("Warna             : " + bm.getWarna());
        System.out.println("Iklim             : " + bm.getIklim());
        System.out.println("Tanah             : " + bm.getTanah());
        System.out.println("Hewan Penyerbuk   : " + bm.getHewan_penyerbuk());
    }

}
