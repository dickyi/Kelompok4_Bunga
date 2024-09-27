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
    }

}
