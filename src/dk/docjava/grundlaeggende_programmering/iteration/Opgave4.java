package dk.docjava.grundlaeggende_programmering.iteration;

public class Opgave4 {

    public static void main(String[] args) {
	    // Test case for 5!
        // Input: x = 5
        // Forventet output: fakultet = 120

        // Test input og initialisering af variable
        int n=5;

        // Programkode (Production Code)
        int fakultet = 1;
        for ( int tal = n; tal > 1; tal-- )
            fakultet *= tal;

        // Manuel afprøvning af resultatet  <<=== Acceptabel løsning, men tidskrævende
        System.out.println( fakultet );

        // Automatiseret afprøvning af resultatet  <<=== God løsning og tidsbesparende i længden
        if (fakultet == 120)
            System.out.println("PASS");
        else
            System.out.println("FAIL");
    }
}
