import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.soundsystem.CDPlayerConfig;
import org.soundsystem.CompactDisc;
import org.soundsystem.MediaPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertNotNull;

/**
 * Created by p3700639 on 10/26/2016.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest
{


    @Autowired
    private MediaPlayer player;

    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull()
    {
        assertNotNull(cd);
    }

    @Test
    public void play(){
        player .play();

    }
}
