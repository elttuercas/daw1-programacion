package other;

import util.StdinReader;

import java.io.IOException;
import java.util.ArrayList;

public class EvenOrOdd
{
    public static void main(String[] args) throws IOException
    {
        StdinReader        reader  = new StdinReader();
        ArrayList<Integer> rgInput = new ArrayList<>(8);
        for (int i = 0; i < 8; ++i)
        {
            rgInput.add(reader.readInt("Introduzca el número " + (i + 1)));
        }
        for (int i : rgInput)
        {
            System.out.printf("%d %ses par\n", i, i % 2 == 0 ? "" : "no ");
        }
    }
}
