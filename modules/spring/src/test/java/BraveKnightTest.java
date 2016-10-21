import org.junit.Test;

import org.springinaction.knights.BraveKnight;
import org.springinaction.knights.Quest;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by p3700639 on 10/21/2016.
 */
public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest(){

        Quest mockQuest=mock(Quest.class);

        BraveKnight braveKnight=new BraveKnight(mockQuest);
        braveKnight.embarkOnQuest();

        BraveKnight anotherBraveKnight=new BraveKnight(mockQuest);
        anotherBraveKnight.embarkOnQuest();

        verify(mockQuest,times(2)).embark();
    }

}
