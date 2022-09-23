package ch1;


import util.StdinReader;

import java.io.IOException;

/**
 * Class EX9
 * Ninth task of the first chapter on programming for web application development course.
 *
 * @author Carlos Amores
 */
public class EX9
{
    public static void main(String[] args) throws IOException, NumberFormatException
    {
        StdinReader reader  = new StdinReader();
        boolean     bIsEven = reader.readInt("Introduzca un número:") % 2 == 0;
        System.out.println("El número es par: " + bIsEven);
    }
}
