package week3.les6.opdracht2;

import java.util.ArrayList;

public class FacebookAccount {
    private String naam;
    private ArrayList<Vriend> mijnVrienden;

    public FacebookAccount(String nm){
        naam = nm;
        mijnVrienden = new ArrayList<>();
    }

    public String getNaam() {
        return naam;
    }

    public void voegToeVriend(Vriend nwV){
        mijnVrienden.add(nwV);
    }
}
