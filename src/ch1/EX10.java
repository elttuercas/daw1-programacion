package ch1;

import util.StdinReader;

import java.io.IOException;

/**
 * Class EX10
 * Tenth task of the first chapter on programming for web application development course.
 *
 * @author Carlos Amores
 */
public class EX10
{
    public static void main(String[] args) throws IOException, NumberFormatException
    {
        StdinReader reader = new StdinReader();
        // Just like in C, any value that isn't 0 is considered to be true.
        boolean bIsRaining   = reader.readInt("¿Está lloviendo?") != 0;
        boolean bTasksDone   = reader.readInt("¿Están hechas las tareas?") != 0;
        boolean bGoToLibrary = reader.readInt("¿Tiene que ir a la biblioteca?") != 0;
        System.out.println("Puede salir a la calle: " + ((bTasksDone && !bIsRaining) || bGoToLibrary));
    }
}
