/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unit7.hokeypokey;

/**
 *  CIS 2085 Methods -- This version has a different method for each verse
 */
public class HokeyPokeyManyVerses {

    /**
     * many verses - This code has a method for each verse
     */
    public static void main(String[] args) {

        verse1();
        refrain();

        verse2();
        refrain();

        verse3();
        refrain();

        verse4();
        refrain();

        verse5();
        refrain();
    } // end Main method

    private static void refrain() {
        // refrain method -- print out the song refrain
        System.out.println("You do the Hokey Pokey");
        System.out.println("    and you turn yourself around.");
        System.out.println("    That's what it's all about");
        System.out.println();
    }

    private static void verse1() {
        // First verse (right foot)
        System.out.println("You put your right foot in");
        System.out.println("You put your right foot out");
        System.out.println("You put your right foot in and you shake it all about.");
    }

    private static void verse2() {
        // Second verse (left foot)
        System.out.println("You put your left foot in");
        System.out.println("You put your left foot out");
        System.out.println("You put your left foot in and you shake it all about.");
    }

    private static void verse3() {
        // Third verse (right hand)
        System.out.println("You put your right hand in");
        System.out.println("You put your right hand out");
        System.out.println("You put your right hand in and you shake it all about.");
    }

    private static void verse4() {
        // Forth verse (left hand)
        System.out.println("You put your left hand in");
        System.out.println("You put your left hand out");
        System.out.println("You put your left hand in and you shake it all about.");
    }

    private static void verse5() {
        // Fifth verse (whole self)
        System.out.println("You put your whole self in");
        System.out.println("You put your whole self out");
        System.out.println("You put your whole self in and you shake it all about.");
    }
    
}   // end of Class
