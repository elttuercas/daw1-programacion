package ch1;

import util.StdinReader;

import java.io.IOException;

/**
 * Class EX2
 * Second task of the first chapter on programming for web application development course.
 *
 * @author Carlos Amores
 */
public class EX2
{
    public static void main(String[] args) throws IOException
    {
        StdinReader reader = new StdinReader();
        String      strIn  = reader.readString("Introduzca un número:");
        System.out.println(strIn);
    }
}
