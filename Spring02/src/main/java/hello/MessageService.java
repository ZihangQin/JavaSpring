package hello;


/**
 * 打印服务
 */

public class MessageService {

    public MessageService() {
        super();
        System.out.println("MessafeSercice");
    }

    /**
     * 打印功能
     * @return 返回打印字符串
     */
    public int getMessage(int a,int b){
        int c= a+b;
        return c;
    }
}
