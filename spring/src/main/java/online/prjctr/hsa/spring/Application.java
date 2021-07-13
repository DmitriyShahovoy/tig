package online.prjctr.hsa.spring;

import online.prjctr.hsa.spring.user.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@SpringBootApplication
@Configuration
@EnableWebMvc
@ComponentScan("online.prjctr.hsa")
public class Application {

    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
