package ch1;

import util.StdinReader;

import java.io.IOException;

/**
 * Class EX3
 * Third task of the first chapter on programming for web application development course.
 *
 * @author Carlos Amores
 */
public class EX3
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Introduzca su edad:");
        StdinReader reader = new StdinReader();

        // Verify input contains an integer value.
        try
        {
            int iIn = reader.readInt("Introduzca su edad:");
            System.out.printf("El año que viene usted tendrá %d años", ++iIn);
        }
        catch (NumberFormatException e)
        {
            System.out.println("El valor introducido no es un valor numérico entero");
        }
    }
}
