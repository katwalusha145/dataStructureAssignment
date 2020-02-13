/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtochar;

/**
 *
 * @author Katwalusha
 */
public class Stringtochar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input="Hello";
        //convert string to character array
        //by using tocharArray
        char[]Usha=input.toCharArray();
        
        for(int i=Usha.length-1;i>=0;i++)
            System.out.println(Usha[i]);
        // TODO code application logic here
    }
    
}
