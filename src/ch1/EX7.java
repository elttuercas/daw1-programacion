package ch1;

import util.Shape;
import util.StdinReader;

import java.io.IOException;

/**
 * Class EX7
 * Seventh task of the first chapter on programming for web application development course.
 *
 * @author Carlos Amores
 */
public class EX7
{
    public static void main(String[] args) throws IOException, NumberFormatException
    {
        StdinReader reader      = new StdinReader();
        Circle circle = new Circle(
                reader.readDouble("Introduzca el radio de la circunferencia:")
        );
        System.out.printf("La longitud de la circunferencia es: %f\n", circle.perimeter());
        System.out.printf("El área del círculo es: %f\n", circle.area());
    }
}

/**
 * Class Circle.
 * Holds data about the geometric shape bearing the same name.
 *
 * @author Carlos Amores
 */
class Circle implements Shape
{
    /**
     * The radius of the circle.
     */
    protected double m_fRadius;

    /**
     * Circle constructor.
     *
     * @param radius The radius of the circle.
     */
    public Circle(double radius)
    {
        m_fRadius = radius;
    }

    /**
     * Calculate the length of the circumference.
     *
     * @return The length of the circumference.
     */
    public double perimeter()
    {
        return 2 * Math.PI * m_fRadius;
    }

    /**
     * Calculate the area of the circle.
     *
     * @return The area of the circle.
     */
    @Override
    public double area()
    {
        return Math.pow(m_fRadius, 2) * Math.PI;
    }
}
