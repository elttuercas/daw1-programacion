package ch1;

import util.StdinReader;

import java.io.IOException;

/**
 * Class EX16
 * Sixteenth task of the first chapter on programming for web application development course.
 *
 * @author Carlos Amores
 */
public class EX16
{
    public static void main(String[] args) throws IOException, NumberFormatException
    {
        StdinReader reader = new StdinReader();
        int iN, iM;
        iN = reader.readInt("Introduzca n:");
        iM = reader.readInt("Introduzca m:");
        System.out.printf("Hay que sumar %d a %d(n) para que sea múltiplo de %d(m)", iM - iN % iM, iN, iM);
    }
}
