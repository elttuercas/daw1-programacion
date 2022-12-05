package other;

import util.StdinReader;
import java.io.IOException;

public class Palindrome
{
    public static void main(String[] args) throws IOException
    {
        StdinReader reader = new StdinReader();
        String      input  = reader.readString("Introduza una frase:");

        // Convert input "special" chars to regular chars and remove spaces.
        String parsedInput = input
                .toLowerCase()
                .replaceAll("\s", "")
                .replaceAll("[àáâãäå]", "a")
                .replaceAll("[èéêë]", "e")
                .replaceAll("[ìíîï]", "i")
                .replaceAll("[òóôõö]", "o")
                .replaceAll("[ùúûü]", "u");

        boolean isPalindrome  = true;
        int     halfStringLen = input.length() / 2;

        for (int i = 0, j = parsedInput.length() - 1; i < halfStringLen; ++i, --j)
        {
            if (parsedInput.charAt(i) != parsedInput.charAt(j))
            {
                isPalindrome = false;
                break;
            }
        }

        System.out.printf("La frase %ses un palíndromo", isPalindrome ? "" : "no ");
    }
}
