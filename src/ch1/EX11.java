package ch1;

import util.StdinReader;

import java.io.IOException;

/**
 * Class EX11
 * Eleventh task of the first chapter on programming for web application development course.
 *
 * @author Carlos Amores
 */
public class EX11
{
    private static final String s_strTable =
            """
            |\t%s\t|\tPrimer semestre\t|\tSegundo semestre\t|\tTotal\t\t|
            |\tKilos\t\t|\t%f\t\t|\t%f\t\t\t|\t%f\t|
            |\tPrecio/Kilo\t|\t%.2f\t\t\t|\t%.2f\t\t\t\t|\t\t\t\t|
            |\tImporte\t\t|\t%.2f\t\t\t|\t%.2f\t\t\t\t|\t%.2f\t\t|
            
            """;
    private static final double s_fApplePricePerKilo = 2.35d;
    private static final double s_fPearPricePerKilo = 1.95d;

    public static void main(String[] args) throws IOException, NumberFormatException
    {
        StdinReader reader                      = new StdinReader();
        double      fAppleSalesKgFirstSemester  = reader.readDouble("Introduzca los kilos de manzanas vendidos el primer semestre:");
        double      fPearSalesKgFirstSemester   = reader.readDouble("Introduzca los kilos de peras vendidos el primer semestre:");
        double      fAppleSalesKgSecondSemester = reader.readDouble("Introduzca los kilos de manzanas vendidos el segundo semestre:");
        double      fPearSalesKgSecondSemester  = reader.readDouble("Introduzca los kilos de peras vendidos el segundo semestre:");

        System.out.printf(
                s_strTable,
                "Manzanas",
                fAppleSalesKgFirstSemester,
                fAppleSalesKgSecondSemester,
                fAppleSalesKgFirstSemester + fAppleSalesKgSecondSemester,
                s_fApplePricePerKilo,
                s_fApplePricePerKilo,
                fAppleSalesKgFirstSemester * s_fApplePricePerKilo,
                fAppleSalesKgSecondSemester * s_fApplePricePerKilo,
                fAppleSalesKgFirstSemester * s_fApplePricePerKilo + fAppleSalesKgSecondSemester * s_fApplePricePerKilo
        );
        System.out.printf(
                s_strTable,
                "Peras\t",
                fPearSalesKgFirstSemester,
                fPearSalesKgSecondSemester,
                fPearSalesKgFirstSemester + fPearSalesKgSecondSemester,
                s_fPearPricePerKilo,
                s_fPearPricePerKilo,
                fPearSalesKgFirstSemester * s_fPearPricePerKilo,
                fPearSalesKgSecondSemester * s_fPearPricePerKilo,
                fPearSalesKgFirstSemester * s_fPearPricePerKilo + fPearSalesKgSecondSemester * s_fPearPricePerKilo
        );
    }
}
