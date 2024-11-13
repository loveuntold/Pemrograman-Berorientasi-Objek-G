import java.util.ArrayList;

public class Rental{
    private ArrayList<Kendaraan> kendaraan;
    private ArrayList<String> penyewa;   

    public Rental(){
        kendaraan = new ArrayList<>();
        penyewa = new ArrayList<>();
    }

    public void addKendaraan(Kendaraan k){
        kendaraan.add(k);
        System.out.println(k.getMerk() + " " + k.getNama() + " has been added.");
    }

    public ArrayList<Kendaraan> getKendaraan(){
        return kendaraan;
    } 

    public void displayKendaraan(){
        System.out.println("List of vehicles: ");
        for(int i = 0; i < kendaraan.size(); i++){
            System.out.println((i+1) + ". " + kendaraan.get(i).getMerk() + " " + kendaraan.get(i).getNama());
        }
    }
    public void addUser(String username){
        penyewa.add(username);
        System.out.println("User " + username + " has been added to the system.");
    }

    public void displayUser(){ 
        if(penyewa.isEmpty()){
            System.out.println("No users available.");
        } else{
            System.out.println("List of users: ");
            for(int i=0; i<penyewa.size(); i++){
                System.out.println((i + 1) + ". " + penyewa.get(i));
            }
        }
    }
}
