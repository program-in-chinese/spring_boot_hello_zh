package 问好;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class 应用 {

    public static void main(String[] 参数) {
        SpringApplication.run(应用.class, 参数);
    }

    @Bean
    public CommandLineRunner 命令行运行器(ApplicationContext 上下文) {
        return 参数 -> {

            System.out.println("检查一下Spring Boot提供的beans:");

            String[] bean名 = 上下文.getBeanDefinitionNames();
            Arrays.sort(bean名);
            for (String 某bean名 : bean名) {
                System.out.println(某bean名);
            }

        };
    }

}