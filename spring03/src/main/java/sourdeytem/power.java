package sourdeytem;

import org.springframework.stereotype.Component;

@Component
public class power {
    public power() {
        super();
    }
    public void supply(){
        System.out.println("电源打开");
    }
}
