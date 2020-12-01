package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan//自动扫描Component

public class ApplicationSpring {
    public static void main(String[] args) {
        System.out.println("主函数开启");

        //初始化Spring容器
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationSpring.class);
        //创建MessagePrinter对象
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        //创建messageService对象
//        MessageService service = context.getBean(MessageService.class);

        System.out.println(printer);
//        System.out.println(service);

        //设置打印对象的service
//        printer.setService(service);
        //打印消息
        printer.printMessage();
    }
}
