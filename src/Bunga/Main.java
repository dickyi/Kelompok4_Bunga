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
        
        
        Bunga_Tulip st = new Bunga_Tulip();

        st.setnama_ilmiah("Tulipa");
        st.setWarna("Beragam(Merah, Kuning, Putih, Ungu)");
        st.setIklim("Sedang");
        st.setTanah("Berdrainase baik dan subur");
        st.setHewan_penyerbuk("Lebah");

        System.out.println("\n\t\t\tBunga Tulip");
        System.out.println("Nama Ilmiah       : " + st.getnama_ilmiah());
        System.out.println("Warna             : " + st.getWarna());
        System.out.println("Iklim             : " + st.getIklim());
        System.out.println("Tanah             : " + st.getTanah());
        System.out.println("Hewan Penyerbuk   : " + st.getHewan_penyerbuk());
    }

}
