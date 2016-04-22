-- model: new model    version: 1.0
SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema openUk
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `openUk` DEFAULT CHARACTER SET utf8 ;
USE `openUk` ;

-- -----------------------------------------------------
-- Table `openUk`.`permissions`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `openUk`.`permissions` ;

CREATE TABLE IF NOT EXISTS `openUk`.`permissions` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `name` VARCHAR(45) NULL DEFAULT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '')
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `openUk`.`roles`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `openUk`.`roles` ;

CREATE TABLE IF NOT EXISTS `openUk`.`roles` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `name` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '')
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `openUk`.`role_permissions`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `openUk`.`role_permissions` ;

CREATE TABLE IF NOT EXISTS `openUk`.`role_permissions` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `role_id` INT(11) NOT NULL COMMENT '',
  `permission_id` INT(11) NOT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  INDEX `fk_role_id` (`role_id` ASC)  COMMENT '',
  INDEX `fk_permission_id` (`permission_id` ASC)  COMMENT '',
  CONSTRAINT `fk_permission_id`
    FOREIGN KEY (`permission_id`)
    REFERENCES `openUk`.`permissions` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_role_id`
    FOREIGN KEY (`role_id`)
    REFERENCES `openUk`.`roles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `openUk`.`users`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `openUk`.`users` ;

CREATE TABLE IF NOT EXISTS `openUk`.`users` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `username` VARCHAR(45) NULL DEFAULT NULL COMMENT '',
  `email` VARCHAR(45) NOT NULL COMMENT '',
  `active` TINYINT(1) NULL DEFAULT '0' COMMENT '',
  `status` VARCHAR(45) NULL DEFAULT NULL COMMENT '',
  `password` VARCHAR(45) NULL DEFAULT NULL COMMENT '',
  `role_id` INT(11) NOT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  UNIQUE INDEX `email_UNIQUE` (`email` ASC)  COMMENT '',
  INDEX `fk_user_to_role_idx` (`role_id` ASC)  COMMENT '',
  CONSTRAINT `fk_user_to_role`
    FOREIGN KEY (`role_id`)
    REFERENCES `openUk`.`roles` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
