# springboot-clould-alibaba-example
基于Spring Cloud Alibaba提供分布式应用服务开发的一站式解决方案案例
### Sentinel的控制台安装
    docker search sentinel
### 获取安装
    docker pull bladex/sentinel-dashboard
运行sentinel
    
    docker run --name sentinel-dashboard -p 9001:8858 -d bladex/sentinel-dashboard:latest 

## 看板
访问URL，Sentinel 控制台引入基本的登录功能，默认用户名和密码都是 sentinel 

    http://localhost:9001/#/login    
![img](screenshoot/centinel/board.png)

## 规则列表
进入规则列表

![img](screenshoot/centinel/rulelist.png)

### 访问写好的controller
```Java
/**
 * http://localhost:8090/hello
 * @return
 */
@GetMapping("welcome")
public String welcome() {
    return "welcome";
}

@GetMapping("hello")
@SentinelResource(value = "test.hello", fallback = "helloError")
public String hello() {
    return "hello";
}
public String helloError() {
    return "error";
}
```
