package sourdeytem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class cdPlayer {
    //    @Autowired
    private cd cd;

    //    @Autowired
    private power power;

//    @Autowired
//    public void setCd(sourdeytem.cd cd) {
//        this.cd = cd;
//        System.out.println("cdSet...");
//    }
//
//
//
//    @Autowired
//    public void setPower(sourdeytem.power power) {
//        this.power = power;
//        System.out.println("powerSet...");
//    }


    public cdPlayer() {
        super();
        System.out.println("player无参构造函数");
    }

    //    @Autowired
//    public cdPlayer(sourdeytem.cd cd, sourdeytem.power power) {
//        this.cd = cd;
//        this.power = power;
//        System.out.println("cd,play多参数构造函数");
//    }


//    @Autowired
//    public cdPlayer(sourdeytem.cd cd) {
//        this.cd = cd;
//        System.out.println("cdPlayer 有参构造函数");
//    }
    @Autowired
    public void prepare(cd cd, power power) {
        this.cd = cd;
        this.power = power;
        System.out.println("prepare方法调用");
    }

    public void play() {
        power.supply();
        cd.play();
    }
}
