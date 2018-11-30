-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: matematicas
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `alumno`
--

DROP TABLE IF EXISTS `alumno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `alumno` (
  `idAlumno` varchar(40) NOT NULL,
  `nombreAlumno` varchar(40) NOT NULL,
  `apellidoAlumno` varchar(40) NOT NULL,
  `nivel` int(3) NOT NULL,
  `idProfesor` int(2) NOT NULL,
  PRIMARY KEY (`idAlumno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumno`
--

LOCK TABLES `alumno` WRITE;
/*!40000 ALTER TABLE `alumno` DISABLE KEYS */;
INSERT INTO `alumno` VALUES ('DannyVilla02','Daniel','Carmona',3,0),('EdgarGc026','Edgar','Gonzalez',2,1),('LuisParada21','Luis','Parada',2,0),('MacRuben','Ruben','Mac-kienly',4,0);
/*!40000 ALTER TABLE `alumno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ejercicios`
--

DROP TABLE IF EXISTS `ejercicios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `ejercicios` (
  `numEjercicio` int(3) NOT NULL,
  `descripcion` varchar(250) NOT NULL,
  `resultado` varchar(49) NOT NULL,
  `nivel` int(2) DEFAULT NULL,
  PRIMARY KEY (`numEjercicio`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ejercicios`
--

LOCK TABLES `ejercicios` WRITE;
/*!40000 ALTER TABLE `ejercicios` DISABLE KEYS */;
INSERT INTO `ejercicios` VALUES (1,'Ernesto jugó a lanzar dardos a los globos. Jugó 5 veces y cada vez trono 3 globos ¿Cuantos globos trono en total?','15',1),(2,'Laura jugó al lanzamiento de aros. En cada juego dan 4 aros. Si jugó 6 veces, ¿Cuántos aros lanzó?','24',1),(3,'Don Gabriel compró algodones de $15 cada uno. Si compro 3 algodones, ¿cuantó pagó?','45',1),(4,'Raúl y Manuel compraron 4 elotes de $8 cada uno. ¿Cuánto pagaron?','32',1),(5,'Si el kilogramo de jitomate cuesta $7, ¿Cuánto debe pagar por 4 kilos?','28',1),(6,'Si le ofrecen 2 elotes por $5. Si paga $10, ¿Cuántos elotes compró?','4',1),(7,'El kilogramo de cebolla cuesta $4. Si necesita 2 kilogramos, ¿Cuánto debe pagar?','8',1),(8,'Compró 3 kilogramos de mango. Si el kilogramo cuesta $8, ¿Cuánto pago?','24',1),(9,'En la huerta de Pedro hay 8 filas de 7 arboles cada una. ¿Cuántos arboles hay en total?','56',1),(10,'Pedro metio 10 naranjas en cada bolsa. Si uso 9 bolsas, ¿Cuántas naranjas metio en total a las bolsas?','90',1),(11,'Andres compró 4 cajas de dulces a $41, ¿Cuánto pagó en total por los dulces?','164',2),(12,'Si hay 34 alumnos por salon en una escuela, ¿Cuántos alumnos hay en 2 salones?','68',2),(13,'Mariana lee 51 paginas de su libro favorito por dia, ¿Cuántas paginas leera en 7 dias?','357',2),(14,'5 amigos quieren comprar un videojuego, cada uno pondra $80 para comprarlo, ¿Cuánto cuesta el videojuego?','400',2),(15,'Un paquete de paletas contiene 62 paletas, ¿Cuántas paletas hay en 3 paquetes?','186',2),(16,'Un granjero planta 92 semillas por dia, ¿Cuántas semillas plantara en 4 dia?','368',2),(17,'Goku entrena 20 horas por dia, si el entrena por 9 dias, ¿Cuántas horas entrenó en total?','180',2),(18,'Un carro recorre 51 km por litro, ¿Cuántos km recorre el carro si tenia 6 litros de gasolina?','306',2),(19,'En el torneo del poder pelearan 11 universos y en cada universo hay 10 guerreros, ¿Cuántos guerreros pelearan?','110',2),(20,'Lourdes, Samantha y Julia tienen 45 muñecas cada una, ¿Cuántas muñecas tienen entre las 3?','135',2),(21,'Selma tiene 4450 piedras para construir una jardinera, ¿Cuántas piedra usara para construir 6 jardineras?','26700',3),(22,'Juan tiene $2693 en el banco del norte y tiene el triple en el banco del sur, ¿Cuánto dinero tiene en el banco del sur?','8079',3),(23,'Marco tiene una colección de autos de juguete y tiene 25 vitrinas. Si en cada una hay 248, ¿Cuántos autos tiene?','6200',3),(24,'En una caja hay 378 tornillos, ¿Cuántos hay en 24 cajas?','9072',3),(25,'En el bosque sembraron 356 pinos, ¿Cuántos necesitan para 15 bosques?','5340',3),(26,'En un criadero nacen 264 truchas cada mes, ¿Cuántas truchas nacen en 1 año?','3168',3),(27,'En una tienda tienen 562 pelotas en cada barril. Si tienen 12 barriles, ¿Cuántas pelotas tienen?','6744',3),(28,'Cristina ha ahorrado $2643 pesos cada mes, ¿Cuánto ha ahorrado en un año?','31716',3),(29,'Lili le compró a cada nieto un oso de peluche de $846. Si tiene 15 nietos, ¿Cuánto dinero gasto?','12690',3),(30,'Mabel necesita 3 bolas de estabre de 230 metros para crear un sueter, ¿Cuánto metros de estambre necesita para tejer 4 sueters?','2760',3);
/*!40000 ALTER TABLE `ejercicios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesor`
--

DROP TABLE IF EXISTS `profesor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `profesor` (
  `id` int(2) NOT NULL,
  `usuario` varchar(39) NOT NULL,
  `password` varchar(39) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesor`
--

LOCK TABLES `profesor` WRITE;
/*!40000 ALTER TABLE `profesor` DISABLE KEYS */;
INSERT INTO `profesor` VALUES (1,'EdgarGc','Csgo1997');
/*!40000 ALTER TABLE `profesor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `respuestas`
--

DROP TABLE IF EXISTS `respuestas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `respuestas` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `valor` varchar(50) NOT NULL,
  `isCorrecta` tinyint(4) NOT NULL,
  `numEjercicio` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `respuestaFK_idx` (`numEjercicio`),
  CONSTRAINT `respuestaFK` FOREIGN KEY (`numEjercicio`) REFERENCES `ejercicios` (`numejercicio`)
) ENGINE=InnoDB AUTO_INCREMENT=121 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `respuestas`
--

LOCK TABLES `respuestas` WRITE;
/*!40000 ALTER TABLE `respuestas` DISABLE KEYS */;
INSERT INTO `respuestas` VALUES (1,'15',1,1),(2,'12',0,1),(3,'18',0,1),(4,'16',0,1),(5,'10',0,2),(6,'24',1,2),(7,'11',0,2),(8,'2',0,2),(9,'9',0,3),(10,'14',0,3),(11,'45',1,3),(12,'44',0,3),(13,'21',0,4),(14,'4',0,4),(15,'20',0,4),(16,'32',1,4),(17,'28',1,5),(18,'5',0,5),(19,'19',0,5),(20,'27',0,5),(21,'1',0,6),(22,'4',1,6),(23,'3',0,6),(24,'9',0,6),(25,'10',0,7),(26,'12',0,7),(27,'8',1,7),(28,'3',0,7),(29,'22',0,8),(30,'21',0,8),(31,'20',0,8),(32,'24',1,8),(33,'56',1,9),(34,'55',0,9),(35,'45',0,9),(36,'57',0,9),(37,'80',0,10),(38,'90',1,10),(39,'50',0,10),(40,'60',0,10),(41,'100',0,11),(42,'123',0,11),(43,'164',1,11),(44,'111',0,11),(45,'70',0,12),(46,'90',0,12),(47,'55',0,12),(48,'68',1,12),(49,'357',1,13),(50,'376',0,13),(51,'123',0,13),(52,'321',0,13),(53,'100',0,14),(54,'400',1,14),(55,'200',0,14),(56,'300',0,14),(57,'170',0,15),(58,'180',0,15),(59,'186',1,15),(60,'191',0,15),(61,'265',0,16),(62,'366',0,16),(63,'360',0,16),(64,'368',1,16),(65,'180',1,17),(66,'190',0,17),(67,'100',0,17),(68,'200',0,17),(69,'111',0,18),(70,'306',1,18),(71,'222',0,18),(72,'305',0,18),(73,'202',0,19),(74,'220',0,19),(75,'110',1,19),(76,'100',0,19),(77,'130',0,20),(78,'140',0,20),(79,'145',0,20),(80,'135',1,20),(81,'26700',1,21),(82,'27600',0,21),(83,'22222',0,21),(84,'20000',0,21),(85,'8080',0,22),(86,'8079',1,22),(87,'8086',0,22),(88,'8081',0,22),(89,'6300',0,23),(90,'6500',0,23),(91,'6200',1,23),(92,'6192',0,23),(93,'9090',0,24),(94,'9012',0,24),(95,'9100',0,24),(96,'9072',1,24),(97,'5340',1,25),(98,'5430',0,25),(99,'3540',0,25),(100,'0453',0,25),(101,'1396',0,26),(102,'3168',1,26),(103,'8136',0,26),(104,'3068',0,26),(105,'6745',0,27),(106,'6710',0,27),(107,'6744',1,27),(108,'6740',0,27),(109,'31968',0,28),(110,'30123',0,28),(111,'31715',0,28),(112,'31716',1,28),(113,'12690',1,29),(114,'10269',0,29),(115,'12700',0,29),(116,'12801',0,29),(117,'2750',0,30),(118,'2760',1,30),(119,'2770',0,30),(120,'2761',0,30);
/*!40000 ALTER TABLE `respuestas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-27 19:43:49
