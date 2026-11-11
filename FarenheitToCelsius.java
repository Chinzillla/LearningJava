import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Fahrenheit Value: ");
        int fahrenheit = input.nextInt();

        System.out.print("Enter a day of the week: ");
        String day = input.next();

        double celsius = (5.0/9) * (fahrenheit - 32);
        String result = String.format("%.1f", celsius);

        System.out.print("The temperature of " + fahrenheit + " fahrenheit in celsius is " + result + " celsius " + "on " + day + ".");
    }
}