package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Class TryReader
 * Utility class which makes my life easier by trying to read a numeric type from stdin.
 *
 * @author Carlos Amores
 */
public class StdinReader
{
    /**
     * The buffered reader used to get values from stdin.
     */
    private final BufferedReader reader;

    /**
     * TryReader default constructor.
     */
    public StdinReader()
    {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    /**
     * Attempt to read an integer from stdin.
     *
     * @param prompt The prompt to display in the console to ask for input.
     * @return The provided integer.
     *
     * @throws IOException           If an I/O error occurs.
     * @throws NumberFormatException If the value provided to stdin is not an integer.
     */
    public int readInt(String prompt) throws IOException, NumberFormatException
    {
        System.out.println(prompt);
        return readInt();
    }

    /**
     * Attempt to read an integer from stdin.
     *
     * @return The provided integer.
     *
     * @throws IOException           If an I/O error occurs.
     * @throws NumberFormatException If the value provided to stdin is not an integer.
     */
    public int readInt() throws IOException, NumberFormatException
    {
        return Integer.parseInt(reader.readLine());
    }

    /**
     * Attempt to read a double from stdin.
     *
     * @param prompt The prompt to display in the console to ask for input.
     * @return The provided double.
     *
     * @throws IOException           If an I/O error occurs.
     * @throws NumberFormatException If the value provided to stdin is not a double.
     */
    public double readDouble(String prompt) throws IOException, NumberFormatException
    {
        System.out.println(prompt);
        return readDouble();
    }

    /**
     * Attempt to read a double from stdin.
     *
     * @return The provided double.
     *
     * @throws IOException           If an I/O error occurs.
     * @throws NumberFormatException If the value provided to stdin is not a double.
     */
    public double readDouble() throws IOException, NumberFormatException
    {
        return Double.parseDouble(reader.readLine());
    }

    /**
     * Attempt to read a string from stdin.
     *
     * @param prompt The prompt to display in the console to ask for input.
     * @return The provided string.
     *
     * @throws IOException If an I/O error occurs.
     */
    public String readString(String prompt) throws IOException
    {
        System.out.println(prompt);
        return readString();
    }

    /**
     * Attempt to read a string from stdin.
     *
     * @return The provided string.
     *
     * @throws IOException If an I/O error occurs.
     */
    public String readString() throws IOException
    {
        return reader.readLine();
    }
}
