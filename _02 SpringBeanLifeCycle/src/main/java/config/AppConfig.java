package config;

import bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages = "bean")
public class AppConfig {
       @Bean
      // @Scope("prototype")
       public MyConnection myConnection(){
           return new MyConnection();

    }
}
