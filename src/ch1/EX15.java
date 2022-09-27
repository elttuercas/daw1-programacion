package ch1;

import util.StdinReader;

import java.io.IOException;

/**
 * Class EX15
 * Fifteenth task of the first chapter on programming for web application development course.
 *
 * @author Carlos Amores
 */
public class EX15
{
    public static void main(String[] args) throws IOException, NumberFormatException
    {
        StdinReader reader = new StdinReader();
        int iInput = reader.readInt("Introduzca un entero:");
        System.out.printf("A %d hay que sumarle %d para que sea múltiplo de 7\n", iInput, 7 - iInput % 7);
    }
}
