package praktek03;
public class HelmAksi {
    public static void main(String[] args){
        Helm j = new Helm();
        
        j.setMerk("NHK");
        j.setWarna("Hitam");
        j.setHarga(300);
        // gak bisa j.setJenisHelm();
        
        j.PakaiHelm();
        
        System.out.print("Merknya \t ");
        System.out.println(j.getMerk());
        System.out.print("Warnanya \t ");
        System.out.println(j.getWarna());
        System.out.print("Harganya \t ");
        System.out.println(j.getHarga());
        
        
        HelmBalap hb = new HelmBalap ();
        hb.setMerk("AGV");
        hb.setWarna("Biru");
        hb.setHarga(50000);
        hb.setJenisHelm("Full Face");
        hb.PakaiHelm();
        System.out.println("Jenis \t:"+hb.getJenisHelm());
        hb.throttle();
    }
}
