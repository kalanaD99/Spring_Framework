package config;


import bean.MyConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Spring Bean Definitions walata source ekk
@Configuration
//how to scan pojos and enter to the application context
@ComponentScan(basePackages = "bean")
public class AppConfig {
    public  AppConfig(){
        System.out.println("App config object created");
    }

    //@Components annotation ek wenuwata application context ekt Spring bean ekk widiyata
    //introdue krnaw
    @Bean
    public MyConnection getConnection(){
        System.out.println("MyConnection started");
        return new MyConnection();

    }

}
