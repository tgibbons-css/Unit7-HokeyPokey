package unit7.hokeypokey;

/**
 *  CIS 2085 Methods -- This version has one method for the refrain
 */
public class HokeyPokeyRefrainMethod {

    /**
     * fullSong - This code calls the refrain method below
     */
    public static void main(String[] args) {

        // First verse (right foot)
        System.out.println("You put your right foot in");
        System.out.println("You put your right foot out");
        System.out.println("You put your right foot in and you shake it all about.");

        refrain();

        // Second verse (left foot)
        System.out.println("You put your left foot in");
        System.out.println("You put your left foot out");
        System.out.println("You put your left foot in and you shake it all about.");

        refrain();

        // Third verse (right hand)
        System.out.println("You put your right hand in");
        System.out.println("You put your right hand out");
        System.out.println("You put your right hand in and you shake it all about.");

        refrain();

        // Forth verse (left hand)
        System.out.println("You put your left hand in");
        System.out.println("You put your left hand out");
        System.out.println("You put your left hand in and you shake it all about.");

        refrain();

        // Fifth verse (whole self)
        System.out.println("You put your whole self in");
        System.out.println("You put your whole self out");
        System.out.println("You put your whole self in and you shake it all about.");

        refrain();

    } // end refrain method

    /**
     *   Print out the song refrain
     */
    private static void refrain() {
        // refrain method -- print out the song refrain
        System.out.println("You do the Hokey Pokey");
        System.out.println("    and you turn yourself around.");
        System.out.println("    That's what it's all about");
        System.out.println();
    }  // end of refrain method
}  // end of Class
