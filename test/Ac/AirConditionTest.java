package Ac;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AirConditionTest {
    @Test
    public void testAirConditionToOn() {
        AirCondition airCondition = new AirCondition();
        airCondition.isOff();
        assertFalse(airCondition.isOff());
        airCondition.acTemperatureIsTurnedOn();
        assertTrue(airCondition.acTemperatureIsTurnedOn());

    }
    @Test
    public void testAirConditionToTurnoff(){
        AirCondition airCondition = new AirCondition();
        airCondition.isOff();
        assertFalse(airCondition.isOff());
        airCondition.acTemperatureIsTurnedOn();
        assertTrue(airCondition.acTemperatureIsTurnedOn());
        airCondition.acTemperatureIsTurnedOff();
        assertEquals(airCondition.acTemperatureIsTurnedOff(),true);


    }
    @Test
    public void testThatAirConditionTemperatureCanBeIncreased() {
        AirCondition airCondition = new AirCondition();
        airCondition.isOff();
        assertFalse(airCondition.isOff());
        airCondition.acTemperatureIsTurnedOn();
        assertTrue(airCondition.acTemperatureIsTurnedOn());
        airCondition.temperatureIncrease(16);
        assertEquals(17, airCondition.temperatureIncrease(17));
    }
    @Test
    public void testThatAirConditionTemperatureCanBeDecreased() {
        AirCondition airCondition = new AirCondition();
        airCondition.isOff();
        assertFalse(airCondition.isOff());
        airCondition.acTemperatureIsTurnedOn();
        assertTrue(airCondition.acTemperatureIsTurnedOn());
        airCondition.temperatureDecreeased(16);
        assertEquals(15, airCondition.temperatureIncrease(15));

    }
    @Test
    public void testThatAirConditionWhenTempertureIsIncreasedBeyond30IsStill30(){
        AirCondition airCondition = new AirCondition();
        airCondition.isOff();
        assertFalse(airCondition.isOff());
        airCondition.acTemperatureIsTurnedOn();
        assertTrue(airCondition.acTemperatureIsTurnedOn());
        airCondition.ifTemperatureIsIncreasedBeyond30DegreesTemperatureShouldReturnTo30Degrees(31);
        assertEquals(30, airCondition.ifTemperatureIsIncreasedBeyond30DegreesTemperatureShouldReturnTo30Degrees(30));

    }
    @Test
    public void testThatAirConditionWhenTemperatureIsDecreasedBeyond16IsStill16(){
        AirCondition airCondition = new AirCondition();
        airCondition.isOff();
        assertFalse(airCondition.isOff());
        airCondition.acTemperatureIsTurnedOn();
        assertTrue(airCondition.acTemperatureIsTurnedOn());
        airCondition.ifTemperatureIsDereasedBelow16DegreesTemperatureShouldReturnTo16Degrees(15);
        assertEquals(16,airCondition.ifTemperatureIsDereasedBelow16DegreesTemperatureShouldReturnTo16Degrees(16));

    }

}
