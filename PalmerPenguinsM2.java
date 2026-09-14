// PalmerPenguinsM2.java
// J. Leal
// 9/13/2026
// Program to calculate and show Plamer Penguin statistics
public class PalmerPenguinsM2 {
        
        // constants to represent the species and amount
        static final String SP_CHINSTRAP = "Chinstrap";
        static final String SP_GENTOO = "Gentoo";
        static final String SP_ADELIE = "Adelie";
       
        static final int TOTAL_SPECIES = 3;
        
        static final int NUM_CHINSTRAP = 68;
        static final int NUM_GENTOO = 123;
        static final int NUM_ADELIE = 151;
        
        public static void main(String[] args) {
        
            int totalPenguins = NUM_CHINSTRAP + NUM_GENTOO + NUM_ADELIE;

            // output the species names with introductory text
            System.out.println("Introducing the Palmer Penguins: "); 
            System.out.println("\t" + SP_CHINSTRAP + "!");
            System.out.println("\t" + SP_GENTOO + "!");
            System.out.println("and last but not least...");
            System.out.println("\t" + SP_ADELIE + "!");
            
             // displays the total number of species
            System.out.println("There are a total of " + TOTAL_SPECIES
                    + " penguin species in the dataset.");
                    
                    
            // displays the total number of penguins
            System.out.println("There are a total of " + totalPenguins
                    + " penguins in the dataset.");

        
            // displays the total number of species
            System.out.println("There are a total of " + TOTAL_SPECIES
                    + " penguin species in the dataset.");
                    
            // displays the percentage of each species
        System.out.printf("%s: %d (%.2f%%)\n", SP_CHINSTRAP, NUM_CHINSTRAP,
                (double) NUM_CHINSTRAP / totalPenguins * 100);

        System.out.printf("%s: %d (%.2f%%)\n", SP_GENTOO, NUM_GENTOO,
                (double) NUM_GENTOO / totalPenguins * 100);

        System.out.printf("%s: %d (%.2f%%)\n", SP_ADELIE, NUM_ADELIE,
                (double) NUM_ADELIE / totalPenguins * 100);   
    }
}
