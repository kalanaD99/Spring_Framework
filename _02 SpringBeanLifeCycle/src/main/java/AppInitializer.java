import bean.SpringBean1;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        /*SpringBean1 bean1 = ctx.getBean(SpringBean1.class);
        System.out.println(bean1);*/

        SpringBean1 bean = ctx.getBean(SpringBean1.class);
        System.out.println(bean);
    }
}
