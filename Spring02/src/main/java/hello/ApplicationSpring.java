package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ApplicationSpring {
    public static void main(String[] args) {
        System.out.println("主函数开启");
        // TODO: 2020/12/1  
        //初始化Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //创建MessagePrinter对象
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        //打印消息
        printer.printMessage();
    }
}
