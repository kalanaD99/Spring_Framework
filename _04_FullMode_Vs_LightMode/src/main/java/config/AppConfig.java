package config;

import bean.MyBasicDataSource;
import bean.MyConnection;
import bean.SpringBeanOne;
import bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "bean")
public class AppConfig {

   /* @Bean
    public SpringBeanOne getBeanOne(){
        //Inter bean dependency(bean method ekk athule twath bean method ekk invoke krla tyna eka)
        SpringBeanTwo beanTwo = new SpringBeanTwo();
        return new SpringBeanOne();
    }
    @Bean
    public SpringBeanTwo getBeanTwo(){
        return new SpringBeanTwo();
    }*/
    public MyBasicDataSource basicDataSource(){

        MyConnection myConnection = myConnection();
        MyConnection myConnection1 = myConnection();

        MyBasicDataSource myBasicDataSource = new MyBasicDataSource();
        myBasicDataSource.setMyConnection(myConnection);

        return myBasicDataSource;
    }

    public MyConnection myConnection(){
        return new MyConnection();
    }
}
