public class Kendaraan {
    private String merk;
    private String nama;

    public Kendaraan(String merk, String nama){
        this.merk = merk;
        this.nama = nama;
    }

    public String getMerk(){
        return merk;
    }

    public String getNama(){
        return nama;
    }

    public void displayInfo(){
        System.out.println("Merk: " + merk);
        System.out.println("Nama: " + nama);
    }
}
