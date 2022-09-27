package ch1;

import util.Shape;
import util.StdinReader;

import java.io.IOException;

/**
 * Class EX17
 * Seventeenth task of the first chapter on programming for web application development course.
 *
 * @author Carlos Amores
 */
public class EX17
{
    public static void main(String[] args) throws IOException, NumberFormatException
    {
        StdinReader reader = new StdinReader();
        Triangle triangle = new Triangle(
                reader.readDouble("Introduzca la base del triángulo:"),
                reader.readDouble("Introduzca la altura del triángulo:")
        );
        System.out.printf("El área del triángulo es: %f\n", triangle.area());
    }
}

/**
 * Class Triangle.
 * Holds data about the geometric shape bearing the same name.
 *
 * @author Carlos Amores
 */
class Triangle implements Shape
{
    /**
     * The length of the base of the triangle.
     */
    protected double m_fBase;
    /**
     * The height of the triangle.
     */
    protected double m_fHeight;

    /**
     * Triangle constructor.
     * @param base The length of the base.
     * @param height The height of the triangle.
     */
    public Triangle(double base, double height)
    {
        m_fBase = base;
        m_fHeight = height;
    }

    /**
     * Calculate the area of the triangle.
     * @return The area of the triangle.
     */
    @Override
    public double area()
    {
        return m_fBase * m_fHeight / 2f;
    }
}
