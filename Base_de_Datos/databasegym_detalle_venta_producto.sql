CREATE DATABASE  IF NOT EXISTS `databasegym` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `databasegym`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: databasegym
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `detalle_venta_producto`
--

DROP TABLE IF EXISTS `detalle_venta_producto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalle_venta_producto` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_venta` int NOT NULL,
  `id_producto` int NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `precio` decimal(10,2) NOT NULL,
  `cantidad` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_venta_producto`
--

LOCK TABLES `detalle_venta_producto` WRITE;
/*!40000 ALTER TABLE `detalle_venta_producto` DISABLE KEYS */;
INSERT INTO `detalle_venta_producto` VALUES (1,4,1,'Playera M',150.00,1),(2,5,1,'Playera M',150.00,1),(3,6,3,'Agua 500ml',6.00,1),(4,7,2,'Toallas',65.00,1),(5,8,1,'Playera M',150.00,1),(6,9,2,'Toallas',65.00,1),(7,9,3,'Agua 500ml',6.00,1),(8,9,2,'Toallas',65.00,1),(9,10,3,'Agua 500ml',6.00,7),(10,11,1,'Playera M',150.00,2),(11,12,3,'Agua 500ml',6.00,7),(12,13,1,'Playera M',150.00,1),(13,14,2,'Toallas',65.00,1),(14,14,3,'Agua 500ml',6.00,1),(15,14,3,'Agua 500ml',6.00,6),(16,15,3,'Agua 500ml',6.00,4),(17,16,1,'Playera M',150.00,2),(18,16,2,'Toallas',65.00,5),(19,17,1,'Playera M',150.00,2),(20,18,1,'Playera M',150.00,1);
/*!40000 ALTER TABLE `detalle_venta_producto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-04-05  3:10:13
