-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: stu
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `classes`
--

DROP TABLE IF EXISTS `classes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `classes` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '班级号',
  `name` varchar(255) NOT NULL COMMENT '班级名',
  `userid` int DEFAULT NULL COMMENT '班主任id',
  PRIMARY KEY (`id`),
  UNIQUE KEY `classes_name_uindex` (`name`),
  KEY `userid` (`userid`),
  CONSTRAINT `userid` FOREIGN KEY (`userid`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=41 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `classes`
--

LOCK TABLES `classes` WRITE;
/*!40000 ALTER TABLE `classes` DISABLE KEYS */;
INSERT INTO `classes` VALUES (1,'一班',1),(17,'计算二班',1),(18,'计算四班',1),(25,'软件二班',1),(29,'添加班级测试',1),(30,'三班',1),(40,'计算五班',1);
/*!40000 ALTER TABLE `classes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `course` (
  `Cno` char(5) NOT NULL,
  `Cname` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Tno` char(3) NOT NULL,
  PRIMARY KEY (`Cno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES ('2','马克思','666'),('200','马克思主义','804'),('3-105','计算机导论','825'),('3-235','数据结构','825'),('3-236','离散数学','831'),('3-245','操作系统','804'),('30','课程测试','50'),('320','课程测试','804'),('4-101','[马克思主义基本原理]概论','811'),('4-123','毛泽东思想和中国特色社会主义理论体系概论]','811'),('6-166','数字电路','856'),('9-886','[数学100%技巧','831'),('9-888','高等数学','831');
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `manger`
--

DROP TABLE IF EXISTS `manger`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `manger` (
  `name` varchar(10) CHARACTER SET gb18030 COLLATE gb18030_chinese_ci NOT NULL,
  `password` varchar(10) CHARACTER SET gb18030 COLLATE gb18030_chinese_ci NOT NULL,
  PRIMARY KEY (`name`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=gb18030;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `manger`
--

LOCK TABLES `manger` WRITE;
/*!40000 ALTER TABLE `manger` DISABLE KEYS */;
INSERT INTO `manger` VALUES ('Allen','123456');
/*!40000 ALTER TABLE `manger` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `score`
--

DROP TABLE IF EXISTS `score`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `score` (
  `Sno` char(3) NOT NULL,
  `Cno` char(5) NOT NULL,
  `Degree` decimal(4,1) DEFAULT NULL,
  PRIMARY KEY (`Sno`,`Cno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `score`
--

LOCK TABLES `score` WRITE;
/*!40000 ALTER TABLE `score` DISABLE KEYS */;
INSERT INTO `score` VALUES ('101','3-105',64.0),('101','4-101',88.0),('101','4-123',87.0),('101','6-166',85.0),('101','9-886',100.0),('103','3-245',86.0),('103','4-101',78.0),('103','4-123',77.0),('103','6-166',0.0),('103','9-886',90.0),('105','3-105',88.0),('105','3-245',75.0),('107','3-105',91.0),('107','6-166',79.0),('108','3-105',78.0),('108','6-166',81.0),('109','3-105',76.0),('109','3-245',68.0),('111','3-105',64.0),('111','4-101',88.0),('111','4-123',87.0),('111','6-166',85.0),('111','9-886',100.0),('113','3-245',86.0),('113','4-101',78.0),('113','4-123',77.0),('113','6-166',0.0),('113','9-886',90.0),('115','3-105',60.0),('115','3-245',75.0),('117','3-105',91.0),('117','6-166',79.0),('118','3-105',78.0),('118','6-166',81.0),('119','3-105',76.0),('119','3-245',68.0),('121','3-105',64.0),('121','4-101',88.0),('121','4-123',87.0),('121','6-166',85.0),('121','9-886',100.0),('123','3-245',86.0),('123','4-101',78.0),('123','4-123',77.0),('123','6-166',0.0),('123','9-886',90.0),('125','3-105',88.0),('125','3-245',75.0),('127','3-105',91.0),('127','6-166',79.0),('128','3-105',78.0),('128','6-166',81.0),('129','3-105',77.0),('129','3-245',68.0),('2','200',100.0),('305','2',90.0);
/*!40000 ALTER TABLE `score` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `Sno` char(3) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Sname` char(4) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Ssex` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Sbirthday` varchar(10) DEFAULT NULL,
  `Classid` int DEFAULT NULL,
  PRIMARY KEY (`Sno`),
  KEY `classid` (`Classid`),
  CONSTRAINT `classid` FOREIGN KEY (`Classid`) REFERENCES `classes` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES ('101','李军帅','男','1996-03-20',1),('103','陆君茹','男','1994-04-03',30),('104','陈文文','男','1994-08-13',1),('105','匡明强','男','1998-10-02',30),('106','李丽丽','女','1996-11-13',1),('107','王丽娜','女','1996-01-23',1),('108','曾华庆','男','1999-09-01',1),('109','王芳芳','女','1995-03-10',1),('111','李一','男','1996-02-20',1),('113','陆一','男','1994-04-03',1),('114','陈一','男','1994-08-13',1),('115','匡一','男','1998-10-02',1),('116','李一','女','1996-11-13',1),('117','王一','女','1996-01-23',1),('118','曾一','男','1999-09-01',1),('119','王一','女','1995-03-10',1),('121','李二','男','1996-02-20',1),('123','陆二','男','1994-04-03',1),('124','陈二','男','1994-08-13',1),('125','匡二','男','1998-10-02',1),('126','李二','女','1996-11-13',1),('127','王二','女','1996-01-23',1),('128','曾二','男','1999-09-01',1),('129','王二','女','1995-03-10',1),('200','陈锐','男','2022-06-08',25),('300','学生','男','2015-06-09',30),('302','王五','男','2015-08-03',25);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `teacher` (
  `Tno` char(3) NOT NULL,
  `Tname` char(4) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Tsex` char(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `Tbirthday` varchar(10) DEFAULT NULL,
  `Prof` char(3) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `Depart` char(5) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`Tno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES ('102','测试','男','2016-05-31','教师','计算机学院'),('666','历史','男','2015-06-03','副教授','计算机学院'),('789','历史','女','2022-06-08','副教授','人工智能'),('804','李诚','女','1958-12-02','副教授','计算机系'),('811','李强栋','男','1977-09-24','讲师','历史系'),('825','王萍','女','1972-05-05','助教','计算机系'),('828','李丽丽','女','1976-11-13','讲师','计算机系'),('831','刘冰','女','1977-08-14','助教','电子工程系'),('999','王二','男','2022-06-03','副教授','计算机学院');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `password` varchar(255) DEFAULT NULL COMMENT '用户密码',
  `email` varchar(255) NOT NULL COMMENT '用户邮箱',
  `allow` int DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_name_uindex` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'test1','321','1373716338@qq.ocm',1),(19,'锐','123','1373716338@qq.com',1),(25,'shi','23','3037256239@qq.com',1),(29,'myy','123','1539672096@qq.com',1),(30,'test10','123','1373716338@qq.com',1),(31,'test20','123','1373716338@qq.com',1),(35,'test13','123','1373716338@qq.com',1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-21 18:01:21
