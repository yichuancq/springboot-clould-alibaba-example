package config;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@NacosPropertySource(dataId = "my-nacos-config", autoRefreshed = true)
@RestController
public class NacosConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosConfigApplication.class, args);
    }
    @NacosValue(value = "${nacos.test.propertie:123}", autoRefreshed = true)
    private String testProperties;

    @GetMapping("/test")
    public String test() {
        return testProperties;
    }
}
