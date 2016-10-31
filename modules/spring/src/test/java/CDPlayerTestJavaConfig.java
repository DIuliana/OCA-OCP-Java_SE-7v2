import org.junit.Test;
import org.soundsystemjavaconfig.CompactDisc;
import org.soundsystemjavaconfig.SgtPeppers;
import org.soundsystemjavaconfig.Beans;
import org.soundsystemjavaconfig.CDPlayer;
import org.soundsystemjavaconfig.CDPlayerConfig;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by p3700639 on 10/31/2016.
 */

@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTestJavaConfig
{
    Beans beans = new Beans();

    CDPlayer cdPlayer = beans.cdPlayer();

    CDPlayer anotherCDPlayer = beans.anotherCDPlayer();

    CompactDisc cd = new SgtPeppers();

    CDPlayer injectedCompactDiscPlayer = beans.cdPlayer(cd);

    @Test
    public void play()
    {
        cdPlayer.play();
        anotherCDPlayer.play();
        injectedCompactDiscPlayer.play();
    }
}
