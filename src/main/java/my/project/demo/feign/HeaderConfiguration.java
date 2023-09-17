package my.project.demo.feign;

import feign.RequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HeaderConfiguration {
    @Bean
    public RequestInterceptor requestInterceptor() {
        return requestTemplate -> {
            requestTemplate.header("X-Requested-With", "XMLHttpRequest");
            requestTemplate.header("Content-Type", "text/html;charset=UTF-8");
        };
    }
}
