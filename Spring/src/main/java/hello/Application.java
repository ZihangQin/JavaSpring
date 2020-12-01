package hello;

public class Application {
    public static void main(String[] args) {
        System.out.println("主函数开启");

        //打印机对象
        MessagePrinter printer = new MessagePrinter();
        //消息服务对象
        MessageService service = new MessageService();
        //设置打印机对象的service属性
        printer.setService(service);
        //打印机消息
        printer.printMessage();
    }
}
