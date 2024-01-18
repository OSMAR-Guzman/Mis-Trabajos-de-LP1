-- ---
-- Globals
-- ---

-- SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
-- SET FOREIGN_KEY_CHECKS=0;

-- ---
-- Table 'Productos'
-- 
-- ---

DROP TABLE IF EXISTS `Productos`;
		
CREATE TABLE `Productos` (
  `id` INTEGER NOT NULL AUTO_INCREMENT,
  `Nombre` MEDIUMTEXT NOT NULL,
  `Precio` INTEGER NOT NULL,
  `StockActual` INTEGER NOT NULL,
  PRIMARY KEY (`id`)
);

-- ---
-- Table 'Proveedor'
-- 
-- ---

DROP TABLE IF EXISTS `Proveedor`;
		
CREATE TABLE `Proveedor` (
  `id` INTEGER NULL AUTO_INCREMENT DEFAULT NULL,
  `Nombre` MEDIUMTEXT NOT NULL,
  `Contacto` INTEGER NOT NULL,
  PRIMARY KEY (`id`)
);

-- ---
-- Table 'EntradaInventario'
-- 
-- ---

DROP TABLE IF EXISTS `EntradaInventario`;
		
CREATE TABLE `EntradaInventario` (
  `id` INTEGER NULL AUTO_INCREMENT DEFAULT NULL,
  `id_Productos` INTEGER NOT NULL,
  `Cantidad` INTEGER NULL DEFAULT NULL,
  `FechaEntrada` MEDIUMTEXT NOT NULL,
  PRIMARY KEY (`id`)
);

-- ---
-- Table 'Ubi_de_Almacenamiento'
-- 
-- ---

DROP TABLE IF EXISTS `Ubi_de_Almacenamiento`;
		
CREATE TABLE `Ubi_de_Almacenamiento` (
  `id` INTEGER NULL AUTO_INCREMENT DEFAULT NULL,
  `id_Productos` INTEGER NOT NULL,
  `Estante` INTEGER NOT NULL,
  `Fila` INTEGER NOT NULL,
  `Seccion` INTEGER NOT NULL,
  PRIMARY KEY (`id`)
);

-- ---
-- Table 'SalidasInvetario'
-- 
-- ---

DROP TABLE IF EXISTS `SalidasInvetario`;
		
CREATE TABLE `SalidasInvetario` (
  `id` INTEGER NULL AUTO_INCREMENT DEFAULT NULL,
  `id_Productos` INTEGER NOT NULL,
  `Cantidad` INTEGER NOT NULL,
  `FechaSalida` INTEGER NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
);

-- ---
-- Foreign Keys 
-- ---

ALTER TABLE `EntradaInventario` ADD FOREIGN KEY (id_Productos) REFERENCES `Productos` (`id`);
ALTER TABLE `Ubi_de_Almacenamiento` ADD FOREIGN KEY (id_Productos) REFERENCES `Productos` (`id`);
ALTER TABLE `SalidasInvetario` ADD FOREIGN KEY (id_Productos) REFERENCES `Productos` (`id`);

-- ---
-- Table Properties
-- ---

-- ALTER TABLE `Productos` ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
-- ALTER TABLE `Proveedor` ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
-- ALTER TABLE `EntradaInventario` ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
-- ALTER TABLE `Ubi_de_Almacenamiento` ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
-- ALTER TABLE `SalidasInvetario` ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ---
-- Test Data
-- ---

-- INSERT INTO `Productos` (`id`,`Nombre`,`Precio`,`StockActual`) VALUES
-- ('','','','');
-- INSERT INTO `Proveedor` (`id`,`Nombre`,`Contacto`) VALUES
-- ('','','');
-- INSERT INTO `EntradaInventario` (`id`,`id_Productos`,`Cantidad`,`FechaEntrada`) VALUES
-- ('','','','');
INSERT INTO `Ubi_de_Almacenamiento` (`id`,`id_Productos`,`Estante`,`Fila`,`Seccion`) VALUES
('','','','','');
INSERT INTO `SalidasInvetario` (`id`,`id_Productos`,`Cantidad`,`FechaSalida`) VALUES
-- ('','','','');