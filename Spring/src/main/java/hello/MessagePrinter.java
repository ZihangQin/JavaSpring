package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 打印机
 */

@Component
public class MessagePrinter {
    public MessagePrinter() {
        super();
        System.out.println("MessagePrinter");
    }

    //在printer中调用service中的类，定义为成员变量
    private MessageService service;

    //为service生成一个set方法
    @Autowired//自动调取set方法
    public void setService(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
