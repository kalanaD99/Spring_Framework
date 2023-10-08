package bean;

import org.springframework.stereotype.Component;


//POJO driven approach because of @Component annotation
@Component
public class SpringBean1 {
    public SpringBean1(){
        System.out.println("SpringBean1 Object Created!");
    }
    public void test1(){
        System.out.println("Spring Bean Tested");
    }
}
