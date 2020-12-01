package sourdeytem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

public class app {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(appConfig.class);
        cdPlayer player = context.getBean(cdPlayer.class);
        player.play();
    }
}
