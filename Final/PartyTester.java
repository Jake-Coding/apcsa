import java.util.*;
import java.io.*;
public class PartyTester {
    // THIS IS A TESTING CLASS. TO RUN THE CODE AS INTENDED, PLEASE RUN MedievalTimes.java
    public static void main(String[] args) {
        try {
            Party party = new Party();
            Party partyFromFile = new Party("party1.txt");
            System.out.println(party); // whatever you made
            System.out.println(partyFromFile); // party1.txt
            try {
                party.toFile("user_made_party.txt");
            } catch (Exception e) {
                e.printStackTrace();
            }
            Party user_party = new Party("user_made_party.txt"); // should be the same as party
            System.out.println(user_party);
            partyFromFile.rerollChar("Clair"); // rerolls Clair
            try {
                partyFromFile.toFile("party1.txt"); 
            } catch (Exception e) {
                e.printStackTrace();
            }



        } catch (Exception e) {e.printStackTrace();}

        try {
            Party bad = new Party("badParty.txt"); // invalid file
        } catch (Exception e) {e.printStackTrace();}


    }
    
}
