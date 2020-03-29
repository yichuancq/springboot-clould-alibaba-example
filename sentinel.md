# springboot-clould-alibaba-example
基于Spring Cloud Alibaba提供分布式应用服务开发的一站式解决方案案例
### Sentinel的控制台安装
    docker search sentinel
### 获取安装
    docker pull bladex/sentinel-dashboard
### Sentinel的控制台安装
     https://github.com/alibaba/Sentinel/releases
###使用docker安装控制台
    docker run --name sentinel-dashboard -p 9001:8858 -d bladex/sentinel-dashboard:latest

访问URL
    http://localhost:9001/#/login    
Sentinel 控制台引入基本的登录功能，默认用户名和密码都是 sentinel