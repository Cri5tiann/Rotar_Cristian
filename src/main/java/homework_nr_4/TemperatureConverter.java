package homework_nr_4;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class TemperatureConverter {
    public static void main(String[] args) {
        System.out.println("temperature in celsius is: " + (int) toCelsius(60));
        System.out.println("temperature in celsius is: " + (int) toFahrenheit(36));
    }

    public static double toCelsius(int temperature){
        return (temperature - 32) * 0.5555556;
    }

    public static double toFahrenheit(int temperature){
        return temperature * 1.8 + 32;
    }

}
