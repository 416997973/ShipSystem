项目总述
====

开源协议
====
本系统100%开源，支持商用，遵守MIT协议，采用微服务+前后端分离+中央登录的模式，可支持新旧系统无缝对接

技术栈
====
* 核心框架：SpringBoot 2.0.0
* 持久层框架：Mybatis 1.3.2,Mybatis plus
* 日志管理：Log4j 2.10.0
* JS框架：Es6，vue3, nodejs
* UI框架: element plus, uni-app
* 后台框架: spring cloud , quartz,oss
* 项目管理框架: Maven 3.2.3

开发环境
====
建议开发者使用以下环境，可以避免版本带来的问题

* IDE: IDEA
* DB: Mysql8.0
* JDK: JDK1.8
* Maven: Maven3.2.3+

部署系统需要
====
* mysql 数据库
* redis 数据库
*ngix
* 建议使用Java语言的软件开发工具包：JDK1.8


系统支持
====
* quartz任务，使用微服务调用。
* 自动记录日志@SystemControllerLog("将我放在controller上面")，@SystemControllerLog("将我放在方法上面")
* 自动序列化日期
* 自动抓取亚马逊数据（所有支持的类容已加入在任务表：t_sys_quartz_task ）
* 广告数据抓取，需要自行修改 t_amz_region 中的授权
* 系统使用shiro管理登录，用redis记录登录的session。

部署说明
====
* 第一步：下载项目
* 第二步：看readme
* 第三步：打开config
* 第四步：看所有文件对应的readme
* 第五步：配置redis,mysql,node,jdk1.8导入对应配置
* 第六步：导入数据到mysql
* 第七步：用IDEA打开
* 第八步：运行dmin
* 第九步：用前端开发工具hbuild或者VSCode 打开UI
* 第十步：修改config里面的路由改成127.0.0.1 然后npm run serve

系统界面