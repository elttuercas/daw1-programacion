package ch1;

import util.StdinReader;

import java.io.IOException;

/**
 * Class EX13
 * Thirteenth task of the first chapter on programming for web application development course.
 *
 * @author Carlos Amores
 */
public class EX13
{
    public static void main(String[] args) throws IOException, NumberFormatException
    {
        StdinReader reader = new StdinReader();
        double fInput = reader.readDouble("Introduzca un número decimal:");
        System.out.printf("El número redondeado al entero más próximo: %d", Math.round(fInput));
    }
}
