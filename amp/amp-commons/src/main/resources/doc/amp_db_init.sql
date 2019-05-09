/*
SQLyog Ultimate v12.09 (64 bit)
MySQL - 5.7.24-log : Database - amp_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`amp_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

/*Table structure for table `sys_admin` */

CREATE TABLE `sys_admin` (
  `admin_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '后台管理主键',
  `admin_no` varchar(255) NOT NULL COMMENT '管理人员编号',
  `admin_name` varchar(255) NOT NULL COMMENT '管理人员姓名',
  `password` varchar(500) NOT NULL COMMENT '登录密码',
  `role_id` int(10) NOT NULL COMMENT '管理人员角色',
  `create_admin` int(10) NOT NULL COMMENT '添加人',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `update_admin` int(10) NOT NULL COMMENT '修改人',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COMMENT='管理人员信息表';

/*Data for the table `sys_admin` */

insert  into `sys_admin`(`admin_no`,`admin_name`,`password`,`role_id`,`create_admin`,`update_admin`) values ('001','admin','e10adc3949ba59abbe56e057f20f883e',1,1,1);
insert  into `sys_admin`(`admin_no`,`admin_name`,`password`,`role_id`,`create_admin`,`update_admin`) values ('002','administrator','e10adc3949ba59abbe56e057f20f883e',1,1,1);
insert  into `sys_admin`(`admin_no`,`admin_name`,`password`,`role_id`,`create_admin`,`update_admin`) values ('003','liuhuaiyuan','e10adc3949ba59abbe56e057f20f883e',2,1,1,1);

/*Table structure for table `sys_app_info` */

CREATE TABLE `sys_app_info` (
  `app_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `app_name` varchar(255) NOT NULL COMMENT '名称',
  `dev_id` int(10) NOT NULL COMMENT '开发人',
  `category_id` int(10) NOT NULL COMMENT '类别',
  `app_info` varchar(500) NOT NULL COMMENT '简介',
  `flatform_id` int(10) NOT NULL COMMENT '使用平台',
  `status_id` int(10) NOT NULL COMMENT '审核状态',
  `sale_id` int(10) DEFAULT NULL COMMENT 'app状态',
  `checker` int(10) NOT NULL COMMENT '审核人',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`app_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='app信息表';

/*Data for the table `sys_app_info` */

/*Table structure for table `sys_category` */

CREATE TABLE `sys_category` (
  `category_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `category_code` varchar(255) NOT NULL COMMENT '编号',
  `category_name` varchar(255) NOT NULL COMMENT '类别名称',
  `create_admin` int(10) NOT NULL COMMENT '创建人',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_admin` int(10) NOT NULL COMMENT '修改人',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`category_id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COMMENT='类别信息表';

/*Data for the table `sys_category` */

insert  into `sys_category`(`category_code`,`category_name`,`create_admin`,`update_admin`) values ('sale','购物比价',1,1);
insert  into `sys_category`(`category_code`,`category_name`,`create_admin`,`update_admin`) values ('entertainment','影音娱乐',1,1);
insert  into `sys_category`(`category_code`,`category_name`,`create_admin`,`update_admin`) values ('tools','实用工具',1,1);
insert  into `sys_category`(`category_code`,`category_name`,`create_admin`,`update_admin`) values ('convenience','便捷生活',1,1);
insert  into `sys_category`(`category_code`,`category_name`,`create_admin`,`update_admin``) values ('tour','旅游住宿',1,1);
insert  into `sys_category`(`category_code`,`category_name`,`create_admin`,`update_admin`) values ('photo','拍摄美化',1,1);
insert  into `sys_category`(`category_code`,`category_name`,`create_admin`,`update_admin`) values ('news','新闻阅读',1,1);
insert  into `sys_category`(`category_code`,`category_name`,`create_admin`,`update_admin`) values ('intercourse','社交通讯',1,1);
insert  into `sys_category`(`category_code`,`category_name`,`create_admin`,`update_admin`) values ('finance','金融理财',1,1);
insert  into `sys_category`(`category_code`,`category_name`,`create_admin`,`update_admin`) values ('education','教育',1,1);
insert  into `sys_category`(`category_code`,`category_name`,`create_admin`,`update_admin`) values ('navigation','出行导航',1,1);
insert  into `sys_category`(`category_code`,`category_name`,`create_admin`,`update_admin`) values ('food','美食',1,1);
insert  into `sys_category`(`category_code`,`category_name`,`create_admin`,`update_admin`) values ('vehicle','汽车',1,1);
insert  into `sys_category`(`category_code`,`category_name`,`create_admin`,`update_admin`) values ('business','商务',1,1);
insert  into `sys_category`(`category_code`,`category_name`,`create_admin`,`update_admin`) values ('children','儿童',1,1);
insert  into `sys_category`(`category_code`,`category_name`,`create_admin`,`update_admin`) values ('health','运动健康',1,1);
insert  into `sys_category`(`category_code`,`category_name`,`create_admin`,`update_admin`) values ('theme','主题个性',1,1);

/*Table structure for table `sys_dev` */

CREATE TABLE `sys_dev` (
  `dev_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `dev_no` varchar(255) NOT NULL COMMENT '编号',
  `dev_name` varchar(255) NOT NULL COMMENT '姓名',
  `password` varchar(500) NOT NULL COMMENT '登录密码',
  `cellphone` varchar(100) NOT NULL COMMENT '联系电话',
  `email` varchar(255) NOT NULL COMMENT '电子邮箱',
  `dev_info` varchar(500) NOT NULL COMMENT '开发人员简介',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`dev_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COMMENT='开发人员信息表';

/*Data for the table `sys_dev` */

insert  into `sys_dev`(`dev_no`,`dev_name`,`password`,`cellphone`,`email`,`dev_info`) values ('001','admin','e10adc3949ba59abbe56e057f20f883e','13888888888','admin@admin.com','管理员');
insert  into `sys_dev`(`dev_no`,`dev_name`,`password`,`cellphone`,`email`,`dev_info`) values ('002','user','e10adc3949ba59abbe56e057f20f883e','13666666666','user@hynuial.com','User');

/*Table structure for table `sys_dictionary` */

CREATE TABLE `sys_dictionary` (
  `dictionary_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `parent_id` int(10) NOT NULL COMMENT '上级字典',
  `dictionary_name` varchar(255) NOT NULL COMMENT '字典名称',
  `create_admin` int(10) NOT NULL COMMENT '创建人',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_admin` int(10) NOT NULL COMMENT '修改人',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`dictionary_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COMMENT='字典信息表';

/*Data for the table `sys_dictionary` */

insert  into `sys_dictionary`(`parent_id`,`dictionary_name`,`create_admin`,`update_admin`,`update_date`) values (0,'APP状态',1,1);
insert  into `sys_dictionary`(`parent_id`,`dictionary_name`,`create_admin`,`update_admin`,`update_date`) values (0,'所属平台',1,1);
insert  into `sys_dictionary`(`parent_id`,`dictionary_name`,`create_admin`,`update_admin`,`update_date`) values (0,'是否上架',1,1);
insert  into `sys_dictionary`(`parent_id`,`dictionary_name`,`create_admin`,`update_admin`,`update_date`) values (1,'待审核',1,1);
insert  into `sys_dictionary`(`parent_id`,`dictionary_name`,`create_admin`,`update_admin`,`update_date`) values (1,'审核通过',1,1);
insert  into `sys_dictionary`(`parent_id`,`dictionary_name`,`create_admin`,`update_admin`,`update_date`) values (1,'审核未通过',1,1);
insert  into `sys_dictionary`(`parent_id`,`dictionary_name`,`create_admin`,`update_admin`,`update_date`) values (2,'手机',1,1);
insert  into `sys_dictionary`(`parent_id`,`dictionary_name`,`create_admin`,`update_admin`,`update_date`) values (2,'平板',1,1);
insert  into `sys_dictionary`(`parent_id`,`dictionary_name`,`create_admin`,`update_admin`,`update_date`) values (2,'通用',1,1);
insert  into `sys_dictionary`(`parent_id`,`dictionary_name`,`create_admin`,`update_admin`,`update_date`) values (3,'已上架',1,1);
insert  into `sys_dictionary`(`parent_id`,`dictionary_name`,`create_admin`,`update_admin`,`update_date`) values (3,'已下架',1,1);

/*Table structure for table `sys_role` */

CREATE TABLE `sys_role` (
  `role_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `role_name` varchar(255) NOT NULL COMMENT '角色名称',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`role_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

/*Data for the table `sys_role` */

insert  into `sys_role`(`role_id`,`role_name`) values (1,'管理员');
insert  into `sys_role`(`role_id`,`role_name`) values (2,'审核员');

/*Table structure for table `sys_version` */

CREATE TABLE `sys_version` (
  `version_id` int(10) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `app_id` int(10) NOT NULL COMMENT '软件信息',
  `apk_name` varchar(500) NOT NULL COMMENT '开发包名称',
  `support_rom` varchar(255) NOT NULL COMMENT '硬件支持',
  `software_size` varchar(500) NOT NULL COMMENT '软件大小',
  `download_link` varchar(500) NOT NULL COMMENT '下载地址',
  `status_id` int(10) NOT NULL COMMENT '下载地址',
  `sale_id` int(10) DEFAULT NULL COMMENT '审核状态',
  `checker` int(10) NOT NULL COMMENT 'APP状态',
  `create_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`version_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='app版本信息';

/*Data for the table `sys_version` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
