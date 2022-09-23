package ch1;

import util.StdinReader;

import java.io.IOException;

/**
 * Class EX7
 * Seventh task of the first chapter on programming for web application development course.
 *
 * @author Carlos Amores
 */
public class EX7
{
    public static void main(String[] args) throws IOException, NumberFormatException
    {
        StdinReader reader      = new StdinReader();
        double      fCircRadius = reader.readDouble("Introduzca el radio de la circunferencia:");
        System.out.printf("La longitud de la circunferencia es: %f\n", Math.PI * 2 * fCircRadius);
        System.out.printf("El área del círculo es: %f\n", Math.pow(fCircRadius, 2) * Math.PI);
    }
}
