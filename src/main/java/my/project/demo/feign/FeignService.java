package my.project.demo.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

//@FeignClient(name = "test", url = "https://www.barotem.com/product", configuration = {HeaderConfiguration.class})
@FeignClient(name = "test", url = "https://www.barotem.com/product")
public interface FeignService {

    @PostMapping(value = "/lists/3227", produces = "text/html;charset=UTF-8")
    String getBarotem();

}

