package Ride;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BikeTest{
    @Test
    public void testBikeIsOn() {
        Bike bike = new Bike();
        bike.bikeIsOn();
        assertTrue(bike.bikeIsOn());
    }
    @Test
    public void testThatWhenBikeIsOnGearIsOnToo(){
        Bike bike = new Bike();
        bike.bikeIsOn();
        assertTrue(bike.bikeIsOn());
    }
    @Test
    public void testThatSpeedCanIncrease(){
        Bike bike = new Bike();
        bike.bikeIsOn();
        assertTrue(bike.bikeIsOn());
        bike.speedIncrease(1);
        assertEquals(2,bike.speedIncrease(1));

    }
    @Test
    public void testThatSpeedCanDecrease(){
        Bike bike = new Bike();
        bike.bikeIsOn();
        assertTrue(bike.bikeIsOn());
        bike.bikeSpeedDecraese(1);
        assertEquals(0,bike.bikeSpeedDecraese(1));

    }
    @Test
    public void testThatBikeCanAccelerate(){
        Bike bike = new Bike();
        bike.bikeIsOn();
        assertTrue(bike.bikeIsOn());
        bike.accelerate(41);
        assertEquals(45,bike.accelerate(41));

    }
    @Test
    public void testThatBikeCanDecelerate(){
        Bike bike = new Bike();
        bike.bikeIsOn();
        assertTrue(bike.bikeIsOn());
        bike.decelerate(21);
        assertEquals(19,bike.decelerate(21));
        bike.bikeSpeedDecraese(1);
        assertEquals(19,bike.bikeSpeedDecraese(21));
    }
}

