# ��Ŀ���

SpringCloud΢������ʵս������Greenwich�汾��SpringBoot2.1.7�汾ʵ�֣�

������Ҫ������

| ΢�����ɫ                 | ��Ӧ�ļ���ѡ��                              |
| --------------------- | ------------------------------------ |
| ע������(Register Server) | Eureka                               |
| �����ṩ��                 | spring mvc��spring-data-jpa��h2��       |
| ����������                 | Ribbon/Feign���ѷ����ṩ�ߵĽӿ�               |
| �۶���                   | Hystrix������Hystrix Dashboard�Լ�Turbine |
| ���÷���                  | Spring Cloud Config Server           |
| API Gateway           | Zuul                                 |
| ������·׷��           | Sleuth                                 |

�̵̳�ַ�У�����������...����

1. [SpringCloud�����ŵ���ͨ�̳̣�һ��- �����ע���뷢��(Eureka)](https://hemin.blog.csdn.net/article/details/107317235)
2. [SpringCloud�����ŵ���ͨ�̳̣�����- �����ṩ��](https://hemin.blog.csdn.net/article/details/107319172)
3. [SpringCloud�����ŵ���ͨ�̳̣�����- ���������ߣ�ʵ�ַ�ʽһ(ribbon)](https://hemin.blog.csdn.net/article/details/107320219)
4. [SpringCloud�����ŵ���ͨ�̳̣��ģ�- ���������ߣ�ʵ�ַ�ʽ��(feign)](https://hemin.blog.csdn.net/article/details/107320748)
5. SpringCloud�����ŵ���ͨ�̳̣��壩- �߿��õķ���ע������(Eureka)
6. SpringCloud�����ŵ���ͨ�̳̣�����- ��·��/����������(ribbon + hystrix)
7. SpringCloud�����ŵ���ͨ�̳̣��ߣ�- ��·��/����������(feign + hystrix)
8. SpringCloud�����ŵ���ͨ�̳̣��ˣ�- ��̬·������(zuul)
9. SpringCloud�����ŵ���ͨ�̳̣��ţ�- ��̬·����������(zuul+ratelimit)
10. SpringCloud�����ŵ���ͨ�̳̣�ʮ��- �ֲ�ʽ��������
11. SpringCloud�����ŵ���ͨ�̳̣�ʮһ��- �߿��õķֲ�ʽ��������
12. SpringCloud�����ŵ���ͨ�̳̣�ʮ����- ��·�����(hystrix dashboard)
13. SpringCloud�����ŵ���ͨ�̳̣�ʮ����- ·���ۺϼ��(hystrix turbine)
14. SpringCloud�����ŵ���ͨ�̳̣�ʮ�ģ�- ������·׷��
15. SpringCloud�����ŵ���ͨ�̳̣�ʮ�壩- ��Ϣ����bus
16. SpringCloud�����ŵ���ͨ�̳̣�ʮ����- ���ؼ�Ȩ��֤
17. SpringCloud�����ŵ���ͨ�̳̣�ʮ�ߣ�- SpringBoot Admin���̨
18. SpringCloud�����ŵ���ͨ�̳̣�ʮ�ˣ�- ��Ŀʵս/΢����ܹ����

# ׼��

## ����׼����

| ����    | �汾������                |
| ----- | -------------------- |
| JDK   | 1.8                  |
| IDE ? | Eclipse ���� IntelliJ IDEA |
| Maven | 3.x                  |

## ���������ã�

| ���������ã�C:\Windows\System32\drivers\etc\hosts�ļ��� |
| ---------------------------------------- |
| 127.0.0.1 discovery config-server gateway movie user feign ribbon |

## �����滮��

| ��Ŀ����                                     | �˿�   | ����                     | URL             |
| ---------------------------------------- | ---- | ---------------------- | --------------- |
| microservice-api-gateway                 | 8050 | API Gateway            | �������            |
| microservice-config-client               | 8041 | ���÷���Ŀͻ���               | �������            |
| microservice-config-server               | 8040 | ���÷���                   | �������            |
| microservice-consumer-movie-feign        | 8020 | Feign Demo             |         |
| microservice-consumer-movie-feign-with-hystrix | 8021 | Feign Hystrix Demo     |        |
| microservice-consumer-movie-feign-with-hystrix-stream | 8022 | Hystrix Dashboard Demo |        |
| microservice-consumer-movie-ribbon       | 8010 | Ribbon Demo            |        |
| microservice-consumer-movie-ribbon-with-hystrix | 8011 | Ribbon Hystrix Demo    |      |
| microservice-discovery-eureka            | 8761 | ע������                   |                |
| microservice-hystrix-dashboard           | 8030 | hystrix���              |  |
| microservice-hystrix-turbine             | 8031 | turbine                |  |
| microservice-provider-user               | 8000 | �����ṩ��                  |              |
| microservice-consumer-zipkin-hi               | 8988 | ������·׷�٣�����1                 |              |
| microservice-consumer-zipkin-greet            | 8989 | ������·׷�٣�����2                 |              |
|                                          |      |                        |                 |

[�̳�˵����ַ���ɰ汾�ĵ�](https://github.com/hemin1003/spring-cloud-book)

## ����

1. [SpringCloud�����ŵ���ͨ�̳�](https://blog.csdn.net/hemin1003/article/details/82043611)

2. [SpringBoot�����ŵ���ͨ�̳�](https://blog.csdn.net/hemin1003/article/details/82038244)

3. [SpringCloud Alibaba�����ŵ���ͨ�̳�](https://blog.csdn.net/hemin1003/article/details/82043611)

## [������](http://heminit.com/about/)

��ӭ�������⣬�ɼ��ҵĸ���QQ 469580884����Ⱥ�� 751925591��һ��̽�ֽ�������

[�ҵĲ��͵�ַ-����ר��](http://blog.csdn.net/hemin1003)

[��������](http://heminit.com)

## ��л
������������ޣ����������Һ�һ�����ȣ�
<br/>
<img src="http://cdn.popstar.toponegames.mobi/img/wechat.jpeg" width="240px" height="240px" />&nbsp;&nbsp;&nbsp;&nbsp;
<img src="http://cdn.popstar.toponegames.mobi/img/alipay.jpeg" width="240px" height="240px" />