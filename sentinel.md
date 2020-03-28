# springboot-clould-alibaba-example
基于Spring Cloud Alibaba提供分布式应用服务开发的一站式解决方案案例
### Sentinel的控制台安装
    docker search sentinel
### 获取安装
    docker pull sentinel:latest
### Sentinel的控制台安装
     https://github.com/alibaba/Sentinel/releases
###使用docker安装控制台
    docker search sentinel
    docker pull centinal
    docker run -d --name sentinel -p 8858:8858 bladex/sentinel-dashboard:1.7.0
这里需要注意的是用docker启动的该实例端口号为8858,而不是我们正常启动jar包的8080
命令启动

    java -Dserver.port=8080 -Dcsp.sentinel.dashboard.server=localhost:8080 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard.jar

启动后，界面如下,访问端口8080(以jar包启动为例)
        
    http://localhost:8080/#/login    
Sentinel 控制台引入基本的登录功能，默认用户名和密码都是 sentinel