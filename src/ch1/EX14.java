package ch1;

import util.StdinReader;

import java.io.IOException;

/**
 * Class EX14
 * Fourteenth task of the first chapter on programming for web application development course.
 *
 * @author Carlos Amores
 */
public class EX14
{
    public static void main(String[] args) throws IOException, NumberFormatException
    {
        double      fTaxBase, fTaxAmount;
        int         iVATPercent;
        StdinReader reader = new StdinReader();
        fTaxBase = reader.readDouble("Introduzca la base imponible:");
        iVATPercent = reader.readInt("Introduzca el IVA(%):");
        fTaxAmount = fTaxBase * iVATPercent / 100;
        System.out.printf("El importe del IVA es: %.2f\n", fTaxAmount);
        System.out.printf("El importe total es: %.2f", fTaxBase + fTaxAmount);
    }
}
