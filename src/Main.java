
public class Main{
    public static void main(String[]args){

        double celsiusLowTemperature=0.0;
        double celsiusHighTemperature=9.3;
        double fahrenheitLowTemperature=9.0/5*celsiusLowTemperature+32;
        double fahrenheitHighTemperature=9.0/5*celsiusHighTemperature+32;
        System.out.println("The low will be "+fahrenheitLowTemperature
                +" and the high will be "+fahrenheitHighTemperature+".");

        celsiusLowTemperature=-2.4;
        celsiusHighTemperature=8.3;
        fahrenheitLowTemperature=9.0/5*celsiusLowTemperature+32;
        fahrenheitHighTemperature=9.0/5*celsiusHighTemperature+32;
        System.out.println("The low will be "+fahrenheitLowTemperature
                +" and the high will be "+fahrenheitHighTemperature+".");

        celsiusLowTemperature=7.7;
        celsiusHighTemperature=16.8;
        fahrenheitLowTemperature=9.0/5*celsiusLowTemperature+32;
        fahrenheitHighTemperature=9.0/5*celsiusHighTemperature+32;
        System.out.println("The low will be "+fahrenheitLowTemperature
                +" and the high will be "+fahrenheitHighTemperature+".");

        celsiusLowTemperature=14.1;
        celsiusHighTemperature=26.3;
        fahrenheitLowTemperature=9.0/5*celsiusLowTemperature+32;
        fahrenheitHighTemperature=9.0/5*celsiusHighTemperature+32;
        System.out.println("The low will be "+fahrenheitLowTemperature
                +" and the high will be "+fahrenheitHighTemperature+".");
    }
}