import bean.MyConnection;
import bean.SpringBean1;
import bean.SpringBean2;
import bean.SpringBean3;
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
       /* SpringBean1 bean1 = ctx.getBean(SpringBean1.class);
        bean1.test1();
        System.out.println("bean1");

        SpringBean2 bean2 = ctx.getBean(SpringBean2.class);
        System.out.println("bean2");

        SpringBean3 bean3 = ctx.getBean(SpringBean3.class);
        System.out.println("bean3");
*/
        //Another way to get the bean
        /*Object SpringBean3 = ctx.getBean("springBean3");
        System.out.println("Bean 3");*/

        MyConnection myConnection = ctx.getBean(MyConnection.class);
        System.out.println(myConnection);

        ctx.close();
    }
}
