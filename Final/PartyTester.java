import java.util.*;
import java.io.*;
public class PartyTester {
    public static void main(String[] args) {
        Party party = new Party();
        Party partyFromFile = new Party("party1.txt");
        System.out.println(party);
        System.out.println(partyFromFile);

    }
    
}
