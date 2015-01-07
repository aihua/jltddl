# MySQL-Front 5.1  (Build 4.13)

/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE */;
/*!40101 SET SQL_MODE='STRICT_TRANS_TABLES,NO_AUTO_CREATE_USER,NO_ENGINE_SUBSTITUTION' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES */;
/*!40103 SET SQL_NOTES='ON' */;


# Host: localhost    Database: freyja_1
# ------------------------------------------------------
# Server version 5.5.25a

USE `freyja_1`;

#
# Source for table t_user_0
#

DROP TABLE IF EXISTS `t_user_0`;
CREATE TABLE `t_user_0` (
  `uid` int(11) NOT NULL AUTO_INCREMENT,
  `open_Id` varchar(255) DEFAULT NULL,
  `nickName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=1000001 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

#
# Dumping data for table t_user_0
#


/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
