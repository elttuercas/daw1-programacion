package ch1;

import util.StdinReader;

import java.io.IOException;

/**
 * Class EX8
 * Eighth task of the first chapter on programming for web application development course.
 *
 * @author Carlos Amores
 */
public class EX8
{
    public static void main(String[] args) throws IOException, NumberFormatException
    {
        StdinReader reader      = new StdinReader();
        boolean     bIsUnderage = reader.readInt("Introduzca su edad:") < 18;
        System.out.println("Menor de edad: " + bIsUnderage);
    }
}
