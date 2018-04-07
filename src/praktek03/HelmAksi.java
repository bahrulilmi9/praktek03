package praktek03;
public class HelmAksi {
    public static void main(String[] args){
        Helm j = new Helm();
        
        j.setMerk("NHK");
        j.setWarna("Hitam");
        j.setHarga(300);
        
        j.PakaiHelm();
        
        System.out.print("Merknya \t ");
        System.out.println(j.getMerk());
        System.out.print("Warnanya \t ");
        System.out.println(j.getWarna());
        System.out.print("Harganya \t ");
        System.out.println(j.getHarga());
    }
}
