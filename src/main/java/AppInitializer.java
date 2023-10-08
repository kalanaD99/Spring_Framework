import bean.SpringBean;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class AppInitializer {
    public static void main(String[] args) {

        //meka run wenne awasanetama. jvm ek shutdown wenna kalin mokk hri process ekk
        // wennna onanm meka athule tma krnne
        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("JVM is about to shutdown");
            }
        }));

        //Conventions
        //==============
        // Create a BeanFactory and application context
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        SpringBean bean = ctx.getBean(SpringBean.class);
        bean.test1();
        System.out.println(bean);
        ctx.close();
    }
}
