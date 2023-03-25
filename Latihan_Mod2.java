package latihan_mod2;

import java.util.*;

public class Latihan_Mod2 {
    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        System.out.println("Hewan: " + Hewan);
        ArrayList<String> DeleteHewan = new ArrayList<>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");
        System.out.println("Hewan yang dihapus: " + DeleteHewan);
        ArrayList<String> New = new ArrayList<>();
        for(String cek: DeleteHewan){
            Hewan.removeIf(h -> h.equals(cek));
            New.add(cek);
        }
        System.out.println("Hewan: " + Hewan);
    }
    }