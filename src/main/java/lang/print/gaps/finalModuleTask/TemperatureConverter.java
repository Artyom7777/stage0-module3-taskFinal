package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){
        //using formula cel to fahr
        double fahrenheit = temperatureCelsius * 9 / 5.0 + 32;
        System.out.println(fahrenheit);
    }
}
