package ch1;

import util.StdinReader;

import java.io.IOException;

/**
 * Class EX6
 * Sixth task of the first chapter on programming for web application development course.
 *
 * @author Carlos Amores
 */
public class EX6
{
    public static void main(String[] args) throws IOException, NumberFormatException
    {
        // Assume that grade should be read from stdin and that they're integer values.
        StdinReader reader = new StdinReader();
        int         iGrade = reader.readInt("Introduzca la primera nota:");
        iGrade += reader.readInt("Introduzca la segunda nota:");
        System.out.printf("La media aritmética de las dos notas es: %f\n", (double)iGrade / 2);
    }
}
