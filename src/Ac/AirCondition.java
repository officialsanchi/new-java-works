package Ac;

public class AirCondition {
    private boolean powerOn;
    private int temperature = 16;
    public boolean isOff() {

        return false;
    }

    public boolean acTemperatureIsTurnedOn(){
        return true;
    }
    public boolean acTemperatureIsTurnedOff(){
        return true;
    }

    public int temperatureIncrease(int temp){
        return temperature++;
    }

    public int temperatureDecreeased(int temp){
        return temperature--;
    }

    public int ifTemperatureIsIncreasedBeyond30DegreesTemperatureShouldReturnTo30Degrees(int temp) {
        if (temp > 30) {

        }
        return 30;

        }
        public int ifTemperatureIsDereasedBelow16DegreesTemperatureShouldReturnTo16Degrees( int temp){
            if (temp < 16) {

            }
            return 16;

        }

    }