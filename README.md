## 志豪的Blog

##资料
[Spring文档](https://spring.io/guides/gs/serving-web-content/)

[Spring Web](https://spring.io/guides/gs/serving-web-content/)

[Bootstrap](https://v3.bootcss.com/components/)

[github](https://github.com/lgitizh960314/blog)

[es中文社区](https://elasticsearch.cn/)

[github Oauth](https://developer.github.com/apps/building-oauth-apps/)

##工具
[git](https://git-scm.com/)

[MyBatis-Spring-Boot-Starter](http://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)


##脚本
```sql
create table USER
(
    ID           INTEGER default NEXT VALUE FOR auto_increment,
    ACCOUNT_ID   VARCHAR(100),
    NAME         VARCHAR(50),
    TOKEN        CHAR(36),
    GMT_CREATE   BIGINT,
    GMT_MODIFIED BIGINT
);
```
分页

```sql
USE `db_blog`;

DROP TABLE IF EXISTS `tb_admin_user`;
CREATE TABLE `tb_admin_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) NOT NULL,
  `password_md5` varchar(50) NOT NULL,
  `user_token` varchar(50) NOT NULL,
  `is_deleted` tinyint(4) DEFAULT '0',
  `create_time` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DELETE FROM tb_admin_user;

INSERT  INTO `tb_admin_user`(`id`,`user_name`,`password_md5`,`user_token`,`is_deleted`,`create_time`) VALUES (1,'admin','e10adc3949ba59abbe56e057f20f883e','d87edfdd63674b9591602b26bfb7f93f',0,'2018-07-04 11:21:14'),(2,'test2','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:28'),(3,'test3','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:32'),(4,'test4','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:32'),(5,'test5','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:33'),(6,'test6','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:34'),(7,'test7','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:35'),(8,'test8','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:35'),(9,'test9','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:36'),(10,'test10','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:37'),(11,'test11','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:38'),(12,'test12','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:38'),(13,'test13','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:39'),(14,'test14','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:40'),(15,'test15','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:40'),(16,'test16','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:41'),(17,'test17','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:41'),(18,'test18','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:42'),(19,'test19','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:46'),(20,'admin2','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:28'),(21,'admin3','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:32'),(22,'admin4','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:32'),(23,'admin5','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:33'),(24,'admin6','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:34'),(25,'admin7','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:35'),(26,'admin8','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:35'),(27,'admin9','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:36'),(28,'admin10','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:37'),(29,'admin11','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:38'),(30,'admin12','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:38'),(31,'admin13','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:39'),(32,'admin14','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:40'),(33,'admin15','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:40'),(34,'admin16','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:41'),(35,'admin17','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:41'),(36,'admin18','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:42'),(37,'admin19','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:46'),(38,'admin011','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:38'),(39,'admin02','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:28'),(40,'admin03','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:32'),(41,'admin04','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:32'),(42,'admin05','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:33'),(43,'admin06','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:34'),(44,'admin07','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:35'),(45,'admin08','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:35'),(46,'admin09','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:36'),(47,'admin010','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:37'),(48,'admin011','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:38'),(49,'admin012','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:38'),(50,'admin013','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:39'),(51,'admin014','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:40'),(52,'admin015','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:40'),(53,'admin016','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:41'),(54,'admin017','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:41'),(55,'admin018','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:42'),(56,'admin019','098f6bcd4621d373cade4e832627b4f6','\'\'',0,'2018-07-09 17:22:46'),(57,'ZHENFENG13','77c9749b451ab8c713c48037ddfbb2c4','592e62069daf32211a71aa892ec1b8f5',0,'2018-07-12 16:08:49'),(58,'213312','eqwfasdfa','\'\'',0,'2018-07-12 16:10:14'),(59,'14415143','51435135','\'\'',0,'2018-07-12 19:43:06'),(60,'shisan','e10adc3949ba59abbe56e057f20f883e','d9ab78a7c39f383e47b7c4ffbb407c87',0,'2018-07-12 19:45:32'),(61,'zhangsan','fcea920f7412b5da7be0cf42b8c93759','',0,'2018-07-12 20:20:22'),(150,'test-user1','3d0faa930d336ba748607ab7076ebce2','\'\'',0,'2018-08-04 17:37:32'),(151,'3123213213','6fdce2f14f4baf2d666fa13dfd8d1945','\'\'',0,'2018-08-15 20:43:42'),(152,'lou2','25f9e794323b453885f5181f1b624d0b','\'\'',0,'2019-01-05 19:55:30'),(153,'lou3','e10adc3949ba59abbe56e057f20f883e','\'\'',0,'2019-01-06 00:28:06'),(154,'lou1','e10adc3949ba59abbe56e057f20f883e','\'\'',0,'2019-01-10 11:05:52');
```

实际开发时候使用

```sql
CREATE DATABASE /*!32312 IF NOT EXISTS*/`my_blog_db` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `my_blog_db`;
/*Table structure for table `tb_admin_user` */
DROP TABLE IF EXISTS `tb_admin_user`;
CREATE TABLE `tb_admin_user` (
  `admin_user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '管理员id',
  `login_user_name` varchar(50) NOT NULL COMMENT '管理员登陆名称',
  `login_password` varchar(50) NOT NULL COMMENT '管理员登陆密码',
  `nick_name` varchar(50) NOT NULL COMMENT '管理员显示昵称',
  `locked` tinyint(4) DEFAULT '0' COMMENT '是否锁定 0未锁定 1已锁定无法登陆',
  PRIMARY KEY (`admin_user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*Data for the table `tb_admin_user` */
insert  into `tb_admin_user`(`admin_user_id`,`login_user_name`,`login_password`,`nick_name`,`locked`) values (1,'admin','e10adc3949ba59abbe56e057f20f883e','李志豪',0);
```

## 问题
**1.为什么要实现Serialization？**

1、将对象的状态保存在存储媒体中以便可以在以后重新创建出完全相同的副本；2、按值将对象从一个应用程序域发送至另一个应用程序域。实现serializabel接口的作用是就是可以把对象存到字节流，然后可以恢复，所以你想如果你的对象没实现序列化怎么才能进行持久化和网络传输呢，要持久化和网络传输就得转为字节流，所以在分布式应用中及设计数据持久化的场景中，你就得实现序列化。

是不是每个实体bean都要实现序列化，答案其实还要回归到第一个问题，那就是你的bean是否需要持久化存储媒体中以及是否需要传输给另一个应用，没有的话就不需要，例如我们利用fastjson将实体类转化成json字符串时，并不涉及到转化为字节流，所以其实跟序列化没有关系。

　　有的时候并没有实现序列化，依然可以持久化到数据库。这个其实我们可以看看实体类中常用的数据类型，例如Date、String等等，它们已经实现了序列化，而一些基本类型，数据库里面有与之对应的数据结构，从我们的类声明来看，我们没有实现serializabel接口，其实是在声明的各个不同变量的时候，由具体的数据类型帮助我们实现了序列化操作。

　　在NoSql数据库中，并没有与我们java基本类型对应的数据结构，所以在往nosql数据库中存储时，我们就必须将对象进行序列化，同时在网络传输中我们要注意到两个应用中javabean的serialVersionUID要保持一致，不然就不能正常的进行反序列化。