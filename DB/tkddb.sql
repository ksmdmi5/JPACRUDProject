-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema tkddb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `tkddb` ;

-- -----------------------------------------------------
-- Schema tkddb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `tkddb` DEFAULT CHARACTER SET utf8 ;
USE `tkddb` ;

-- -----------------------------------------------------
-- Table `tkd`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `tkd` ;

CREATE TABLE IF NOT EXISTS `tkd` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `technique` VARCHAR(45) NOT NULL,
  `type` VARCHAR(150) NOT NULL,
  `description` VARCHAR(250) NOT NULL,
  `belt` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB
AUTO_INCREMENT = 25
DEFAULT CHARACTER SET = utf8;

SET SQL_MODE = '';
DROP USER IF EXISTS tkduser@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'tkduser'@'localhost' IDENTIFIED BY 'tkd';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'tkduser'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
