package sourdeytem;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = appConfig.class)
public class appTest {

    @Autowired
    private cdPlayer player;

    @Test
    public void testPlay(){
         player.play();
    }
}
