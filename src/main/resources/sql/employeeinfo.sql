-- MySQL dump 10.10
--
-- Host: localhost    Database: mysql
-- ------------------------------------------------------
-- Server version	5.0.18-nt

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employeeinfo`
--

DROP TABLE IF EXISTS `employeeinfo`;
CREATE TABLE `employeeinfo` (
  `Id` int(11) NOT NULL auto_increment,
  `FirstName` varchar(255) NOT NULL default '' COMMENT '雇员的姓',
  `LastName` varchar(255) NOT NULL default '' COMMENT '用户的名',
  `DepartmentName` varchar(255) default NULL COMMENT '部门名称',
  `EmailAddress` varchar(255) default NULL COMMENT '邮箱地址',
  `FamilyAddress` varchar(255) default NULL COMMENT '家庭地址',
  `RegDate` datetime default NULL COMMENT '注册日期',
  `UpdateDate` datetime default NULL,
  PRIMARY KEY  (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='雇员信息表';

--
-- Dumping data for table `employeeinfo`
--


/*!40000 ALTER TABLE `employeeinfo` DISABLE KEYS */;
LOCK TABLES `employeeinfo` WRITE;
INSERT INTO `employeeinfo` VALUES (7,'张','三','开发部','112233@qq.com','高新二路',NULL,NULL),(8,'李','四','财务部','223366@163.com','科技四路',NULL,NULL);
UNLOCK TABLES;
/*!40000 ALTER TABLE `employeeinfo` ENABLE KEYS */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

