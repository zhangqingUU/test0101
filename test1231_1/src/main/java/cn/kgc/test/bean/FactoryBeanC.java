package cn.kgc.test.bean;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class FactoryBeanC {


    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
