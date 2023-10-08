import bean.SpringBean1;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();


        //meka run wenne awasanetama. jvm ek shutdown wenna kalin mokk hri process ekk
        // wennna onanm meka athule tma krnne
       /* Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("JVM is about to shutdown");
            }
        }));
*/
        //kalin manually karpu de ctx ek through method ek call krla tynaw
        ctx.registerShutdownHook();
        //Conventions
        //==============
        // Create a BeanFactory and application context

        ctx.register(AppConfig.class);
        ctx.refresh();

        //to get the bean through the class
        SpringBean1 bean = ctx.getBean(SpringBean1.class);

        bean.test1();
        System.out.println(bean);

        ctx.close();
    }
}
