package TV;

public class Television {
    private int volume;
    private int channel;
    public Television() {
        volume = 1;
        channel = 1;
    }
    public boolean tvIson() {
        return true;
    }

    public int televisionVolume() {
        return volume++;
    }

    public int televisionVolumeDecreased() {
        return volume--;
    }

    public int changeTelevisionChannel() {
        return channel++;
    }

    public int televisionChannelCanBeReduced() {
        return channel--;
    }

    public boolean turnOff() {
        return true;
    }
}
