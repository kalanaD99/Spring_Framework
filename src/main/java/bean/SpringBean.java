package bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {
    public SpringBean(){
        System.out.println("Spring Bean Object Created!");
    }
    public void test1(){
        System.out.println("Spring Bean Tested");
    }
}
