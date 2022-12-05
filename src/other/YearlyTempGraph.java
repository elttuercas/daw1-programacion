package other;

import util.StdinReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class YearlyTempGraph

{
    public static void main(String[] args) throws IOException
    {
        StdinReader reader = new StdinReader();

        HashMap<Integer, String> mapMonth = new HashMap<>();
        mapMonth.put(1, "Enero");
        mapMonth.put(2, "Febrero");
        mapMonth.put(3, "Marzo");
        mapMonth.put(4, "Abril");
        mapMonth.put(5, "Mayo");
        mapMonth.put(6, "Junio");
        mapMonth.put(7, "Julio");
        mapMonth.put(8, "Agosto");
        mapMonth.put(9, "Septiembre");
        mapMonth.put(10, "Octubre");
        mapMonth.put(11, "Noviembre");
        mapMonth.put(12, "Diciembre");

        ArrayList<Double> rgYearTemps = new ArrayList<>(12);
        for (int i = 0; i < 12; ++i)
        {
            rgYearTemps.add(reader.readDouble("Introduzca la temperatura media del mes " + mapMonth.get(i + 1)));
        }

        var sortedTemps = rgYearTemps;
        sortedTemps.sort(null);
        // Find min and max temps.
        double minTemp = sortedTemps.get(0), maxTemp = sortedTemps.get(sortedTemps.size() - 1);
        double degreesPerAsterisk = (maxTemp - minTemp) / 35;
        degreesPerAsterisk = degreesPerAsterisk == 0 ? 1 : degreesPerAsterisk;
        long xAxisStartTemp = Math.round(minTemp - (degreesPerAsterisk * 5));
        long xAxisTempIncrement = Math.round(degreesPerAsterisk * 5);

        System.out.println(xAxisStartTemp);
        System.out.println(xAxisTempIncrement);
    }
}
