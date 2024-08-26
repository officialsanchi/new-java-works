package TV;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    @Test
    public void testThatTelevisionIsOn(){
        Television television = new Television();
        television.tvIson();
        assertTrue(television.tvIson());

    }
    @Test
    public void testThatTelevisionVolumeCanBeIncreased(){
        Television television = new Television();
        television.tvIson();
        assertTrue(television.tvIson());
        television.televisionVolume();
        assertEquals(2,television.televisionVolume());
    }
    @Test
    public void testThatTelevisionVolumeCanBeDecreased(){
        Television television = new Television();
        television.tvIson();
        television.televisionVolume();
        assertEquals(2,television.televisionVolume());
        television.televisionVolumeDecreased();
        assertEquals(2,television.televisionVolumeDecreased());
    }
    @Test
    public void testThatTelevisionChannelCanBeIncreased(){
        Television television = new Television();
        television.tvIson();
        television.changeTelevisionChannel();
        assertEquals(2,television.changeTelevisionChannel());
    }
    @Test
    public void testThatTelevisionChannelCanBeDecreased(){
        Television television = new Television();
        television.tvIson();
        television.changeTelevisionChannel();
        assertEquals(2,television.changeTelevisionChannel());
        television.televisionChannelCanBeReduced();
        assertEquals(2,television.televisionChannelCanBeReduced());
    }
    @Test
    public void testThatTelevisionIsOff(){
        Television television = new Television();
        television.tvIson();
        television.turnOff();
        assertTrue(television.turnOff());
    }
}
