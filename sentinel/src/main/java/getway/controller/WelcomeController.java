package getway.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    /**
     * http://localhost:8090/hello
     * 不注册限流
     *
     * @return
     */
    @GetMapping("welcome")
    public String welcome() {
        return "welcome";
    }

    /**
     * 注解限流
     *
     * @return
     */
    @GetMapping("hello")
    @SentinelResource(value = "test.hello", fallback = "helloError")
    public String hello() {
        return "hello";
    }

    public String helloError() {
        return "error";
    }


}
