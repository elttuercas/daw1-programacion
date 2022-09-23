package ch1;

import util.StdinReader;

import java.io.IOException;

/**
 * Class EX12
 * Twelfth task of the first chapter on programming for web application development course.
 *
 * @author Carlos Amores
 */
public class EX12
{
    public static void main(String[] args) throws IOException, NumberFormatException
    {
        int         iFirstTermGrade, iSecondTermGrade, iThirdTermGrade, iGradeSum;
        StdinReader reader = new StdinReader();
        iFirstTermGrade = reader.readInt("Introduzca la nota del primer trimestre:");
        iSecondTermGrade = reader.readInt("Introduzca la nota del segundo trimestre:");
        iThirdTermGrade = reader.readInt("Introduzca la nota del tercer trimestre:");
        iGradeSum = iFirstTermGrade + iSecondTermGrade + iThirdTermGrade;
        if (30 < iGradeSum)
        {
            // Hmmmmmm...
            System.out.println("Hmmmmmm...");
        }
        System.out.printf(
                "La nota media del curso según las calificaciones: %d\n",
                iGradeSum / 3
        );
        System.out.printf(
                "La nota media del curso según el expediente académico: %.2f\n",
                (double)iGradeSum / 3
        );
    }
}
