package week3.les6.opdracht2;

public class Vriend {
    private String voornaam;
    private String achternaam;
    private String email;

    public Vriend(String vnm, String anm, String em){
        voornaam = vnm;
        achternaam = anm;
        email = em;
    }

    public boolean equals(Object andereObject){
        boolean gelijkeObjecten = false;

        return gelijkeObjecten;
    }

    public String ToString(){
        return voornaam +" "+ achternaam+ ", email: " + email;
    }
}
