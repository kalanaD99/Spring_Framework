package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.security.auth.Destroyable;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SpringBean1 implements BeanNameAware, BeanFactoryAware, ApplicationContextAware,InitializingBean,DisposableBean {
    public SpringBean1(){
        System.out.println("Spring bean 1 generated");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name Aware called!");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean Factory Aware called! ");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context Aware called! ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Bean called! ");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("SpringBean1 Dispose! ");
    }
}
