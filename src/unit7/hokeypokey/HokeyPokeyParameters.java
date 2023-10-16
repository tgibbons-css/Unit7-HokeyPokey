package unit7.hokeypokey;
/**
 *  CIS 2085 Methods -- This version has a method with a parameter
 */
public class HokeyPokeyParameters {
    /**
     *  Parameters -- by using a parameter we can combine all the verses
     */
    public static void main(String[] args) {
        verse("right foot");
        refrain();
        verse("left foot");
        refrain();
        verse("right hand");
        refrain();
        verse("left hand");
        refrain();
        verse("whole self");
        refrain();
    } // end Main method

    private static void refrain() {
        // refrain method -- print out the song refrain
        System.out.println("You do the Hokey Pokey");
        System.out.println("    and you turn yourself around.");
        System.out.println("    That's what it's all about");
        System.out.println();
    }

    /**
     * Generic verse that can do any body part like "right foot" or "left arm"
     * @param bodyPart is a string describing the body part for this verse
     */
    private static void verse(String bodyPart) {
        System.out.println("You put your "+ bodyPart +" in");
        System.out.println("You put your "+ bodyPart +" out");
        System.out.println("You put your "+ bodyPart +" in and you shake it all about.");
    }

}   // end of Class

