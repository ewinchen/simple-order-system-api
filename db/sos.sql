CREATE DATABASE  IF NOT EXISTS `sos` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `sos`;
-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: sos
-- ------------------------------------------------------
-- Server version	5.7.22

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
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `order_no` varchar(45) NOT NULL,
  `create_date` datetime DEFAULT NULL,
  `customer` varchar(45) DEFAULT NULL,
  `create_by` varchar(45) DEFAULT NULL,
  `submit_by` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `goods` varchar(45) DEFAULT NULL,
  `quantity` decimal(10,2) DEFAULT NULL,
  `unit` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `order_no_UNIQUE` (`order_no`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,'001','2019-04-12 09:00:00','Microsoft',NULL,NULL,'NEW','Windows 10',19.00,'set'),(2,'002','2019-04-13 09:00:00','Apple','admin','admin','NEW','iPone X MAX',150.00,'set'),(3,'003','2019-04-12 10:00:00','Amazon','admin','admin','NEW','AWS EC2',20.00,'set'),(4,'004','2019-04-22 09:00:00','AMD','admin','admin','SUBMITTED','Ryzen 7',200.00,'set'),(6,'005','2019-04-22 09:00:00','Google','admin','admin','NEW','Pixel XL',999.00,'set'),(7,'006','2019-04-23 09:00:00','Facebook','admin','admin','NEW','AI solutions',10.00,'set'),(8,'007','2019-04-23 09:00:00','IBM','admin','admin','SUBMITTED','Silver Server',100.00,'set'),(9,'008','2019-04-23 09:00:00','Intel','admin','admin','SUBMITTED','Core i7-8700k',190.00,'set');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'sos'
--

--
-- Dumping routines for database 'sos'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-04-25 13:56:33
