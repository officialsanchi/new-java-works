package Ride;

public class Bike {
    private int gear = 0;
    private int speed = 1;
    private boolean isOn;

    public boolean bikeIsOn(){

        return true;
    }

    public int accelerate(int speedIncraese){
        int currentSpeed;
        if (speedIncraese > 0 && speedIncraese <= 20) {
            currentSpeed = speedIncraese + 1;
            System.out.println("1");
        } else if (speedIncraese >= 21 && speedIncraese <= 30) {
            currentSpeed = speedIncraese + 2;
            System.out.println("gear2");
        } else if (speedIncraese >= 31 && speedIncraese <= 40) {
            currentSpeed = speedIncraese + 3;
            System.out.println("gear3");
        } else {
            currentSpeed = speedIncraese + 4;
            System.out.println("gear4");
        }
        return currentSpeed;

    }
    public int bikeSpeedDecraese(int speedDec) {

        return speed--;
    }

    public int decelerate(int speedIncraese) {
        int currentSpeed;
        if (speedIncraese > 0 && speedIncraese <= 20) {
            currentSpeed = speedIncraese - 1;
            System.out.println("1");
        } else if (speedIncraese >= 21 && speedIncraese <= 30) {
            currentSpeed = speedIncraese - 2;
            System.out.println("gear2");
        } else if (speedIncraese >= 31 && speedIncraese <= 40) {
            currentSpeed = speedIncraese - 3;
            System.out.println("gear3");
        } else {
            currentSpeed = speedIncraese - 4;
            System.out.println("gear4");
        }
        return currentSpeed;

    }


    public int  speedIncrease(int speedIncraese ) {
        return speed++;
    }
}

