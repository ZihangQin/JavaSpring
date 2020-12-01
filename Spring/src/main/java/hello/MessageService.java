package hello;

import org.springframework.stereotype.Component;

/**
 * 打印服务
 */
@Component
public class MessageService {

    public MessageService() {
        super();
        System.out.println("MessafeSercice");
    }

    /**
     * 打印功能
     * @return 返回打印字符串
     */
    public String getMessage(){
        return "hello word";
    }
}
