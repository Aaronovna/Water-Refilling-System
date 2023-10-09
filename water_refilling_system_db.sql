/*
SQLyog Community v13.2.0 (64 bit)
MySQL - 8.0.32 : Database - water_refilling_system_db
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`water_refilling_system_db` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `water_refilling_system_db`;

/*Table structure for table `account` */

DROP TABLE IF EXISTS `account`;

CREATE TABLE `account` (
  `UID` decimal(5,0) DEFAULT NULL,
  `username` varchar(30) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `account` */

insert  into `account`(`UID`,`username`,`password`) values 
(10002,'admin','123');

/*Table structure for table `borrow` */

DROP TABLE IF EXISTS `borrow`;

CREATE TABLE `borrow` (
  `BID` decimal(8,0) DEFAULT NULL,
  `Fcustomer_no` decimal(6,0) DEFAULT NULL,
  `Ftransaction_code` decimal(8,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `borrow` */

/*Table structure for table `credit` */

DROP TABLE IF EXISTS `credit`;

CREATE TABLE `credit` (
  `CDTID` decimal(8,0) DEFAULT NULL,
  `Fcustomer_no` decimal(6,0) DEFAULT NULL,
  `Ftransaction_code` decimal(8,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `credit` */

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `customer_no` decimal(6,0) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `address` varchar(50) DEFAULT NULL,
  `contact_no` varchar(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `customer` */

/*Table structure for table `system_numeric_data` */

DROP TABLE IF EXISTS `system_numeric_data`;

CREATE TABLE `system_numeric_data` (
  `DID` decimal(4,0) DEFAULT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `Value` decimal(65,0) DEFAULT NULL,
  `Total` decimal(65,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `system_numeric_data` */

insert  into `system_numeric_data`(`DID`,`Name`,`Value`,`Total`) values 
(1001,'Revenue',0,NULL),
(1002,'Gallon_Slim',100,100),
(1003,'Gallon_Round',100,100),
(1004,'Slim_Price',30,35),
(NULL,'Round_Price',25,30);

/*Table structure for table `transaction` */

DROP TABLE IF EXISTS `transaction`;

CREATE TABLE `transaction` (
  `transaction_code` decimal(8,0) DEFAULT NULL,
  `service_type` varchar(10) DEFAULT NULL,
  `gallon_type` varchar(5) DEFAULT NULL,
  `quantity` decimal(1,0) DEFAULT NULL,
  `cash` decimal(6,0) DEFAULT NULL,
  `revenue` decimal(6,0) DEFAULT NULL,
  `change` decimal(6,0) DEFAULT NULL,
  `date` timestamp NULL DEFAULT NULL,
  `customer_no` decimal(10,0) DEFAULT NULL,
  `status` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `returned` tinyint(1) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `transaction` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
