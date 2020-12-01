package sourdeytem;

import org.springframework.stereotype.Component;

@Component
public class cd {
    public cd() {
        super();
        System.out.println("cd无参构造函数");
    }
    public void play(){
        System.out.println("正在播放cd.......");
    }
}
