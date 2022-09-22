package ch1;

import util.StdinReader;

import java.util.Calendar;
import java.io.IOException;

/**
 * Class EX4
 * Fourth task of the first chapter on programming for web application development course.
 *
 * @author Carlos Amores
 */
public class EX4
{
    public static void main(String[] args) throws IOException, NumberFormatException
    {
        int iMaybeCurrentYear, iDefinitelyCurrentYear, iBirthYear;
        StdinReader reader = new StdinReader();
        iMaybeCurrentYear = reader.readInt("Introduzca el año actual:");
        iDefinitelyCurrentYear = Calendar.getInstance().get(Calendar.YEAR) - 1900;
        if (iMaybeCurrentYear != iDefinitelyCurrentYear)
        {
            // Hmmmmmm...
            System.out.println("Hmmmmmm...");
        }

        iBirthYear = reader.readInt("Introduzca su año de nacimiento:");
        if (iBirthYear > iMaybeCurrentYear)
        {
            // Hmmmmmm...
            System.out.println("Hmmmmmm...");
        }

        System.out.printf("Usted tiene %d años", iMaybeCurrentYear - iBirthYear);
    }
}
