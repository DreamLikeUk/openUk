-- -----------------------------------------------------
-- Table `openUk`.`categories`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `openUk`.`categories` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `name` VARCHAR(45) NOT NULL COMMENT '',
  `description` VARCHAR(100) NULL COMMENT '',
  `image_link` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  UNIQUE INDEX `name_UNIQUE` (`name` ASC)  COMMENT '')
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `openUk`.`questions`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `openUk`.`questions` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `id_category` INT NOT NULL COMMENT '',
  `text` VARCHAR(100) NOT NULL COMMENT '',
  `points` INT NOT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  INDEX `fk_category_idx` (`id_category` ASC)  COMMENT '',
  CONSTRAINT `fk_category`
    FOREIGN KEY (`id_category`)
    REFERENCES `openUk`.`categories` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `openUk`.`answers`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `openUk`.`answers` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `id_question` INT NOT NULL COMMENT '',
  `text` VARCHAR(100) NULL COMMENT '',
  `correct` TINYINT(1) NOT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  INDEX `fk_question_idx` (`id_question` ASC)  COMMENT '',
  CONSTRAINT `fk_question`
    FOREIGN KEY (`id_question`)
    REFERENCES `openUk`.`questions` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `openUk`.`statuses`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `openUk`.`statuses` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `name` VARCHAR(45) NOT NULL COMMENT '',
  `points` INT NOT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  UNIQUE INDEX `name_UNIQUE` (`name` ASC)  COMMENT '')
ENGINE = InnoDB;




-- -----------------------------------------------------
-- Table `openUk`.`user_to_questions`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `openUk`.`user_to_questions` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `id_user` INT NOT NULL COMMENT '',
  `id_question` INT NOT NULL COMMENT '',
  `date_taken` DATETIME NOT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  INDEX `fk1_user_idx` (`id_user` ASC)  COMMENT '',
  INDEX `fk1_question_idx` (`id_question` ASC)  COMMENT '',
  CONSTRAINT `fk1_user`
    FOREIGN KEY (`id_user`)
    REFERENCES `openUk`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk1_question`
    FOREIGN KEY (`id_question`)
    REFERENCES `openUk`.`questions` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `openUk`.`badges`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `openUk`.`badges` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `id_category` INT NOT NULL COMMENT '',
  `name` VARCHAR(45) NOT NULL COMMENT '',
  `badge_link` VARCHAR(100) NOT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  UNIQUE INDEX `id_category_UNIQUE` (`id_category` ASC)  COMMENT '',
  UNIQUE INDEX `badge_link_UNIQUE` (`badge_link` ASC)  COMMENT '',
  UNIQUE INDEX `name_UNIQUE` (`name` ASC)  COMMENT '',
  CONSTRAINT `fk1_category`
    FOREIGN KEY (`id_category`)
    REFERENCES `openUk`.`categories` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `openUk`.`user_to_badges`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `openUk`.`user_to_badges` (
  `id` INT NOT NULL AUTO_INCREMENT COMMENT '',
  `id_badge` INT NOT NULL COMMENT '',
  `id_user` INT NOT NULL COMMENT '',
  PRIMARY KEY (`id`)  COMMENT '',
  INDEX `fk_badge_idx` (`id_badge` ASC)  COMMENT '',
  INDEX `fk_user_idx` (`id_user` ASC)  COMMENT '',
  CONSTRAINT `fk_user`
    FOREIGN KEY (`id_user`)
    REFERENCES `openUk`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_badge`
    FOREIGN KEY (`id_badge`)
    REFERENCES `openUk`.`badges` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

USE `openUk` ;


