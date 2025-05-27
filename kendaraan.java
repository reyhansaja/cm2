public class kendaraan {
    String platNomor;
    String tipe;
    String merk;

    public kendaraan(String platNomor, String tipe, String merk){
        this.platNomor = platNomor;
        this.tipe = tipe;
        this.merk = merk;
    }
    public void tampilkanInformasi(){
        System.out.println("Plat nomor: "+platNomor+"\ntipe: "+tipe+"\nmerk: "+merk);
    }
    public String toString(){
        return "Plat nomor: "+platNomor+"\ntipe: "+tipe+"\nmerk: "+merk;
    }
}