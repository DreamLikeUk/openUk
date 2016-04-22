ALTER TABLE `openUk`.`users` 
ADD COLUMN `level` INT NULL COMMENT '' AFTER `role_id`,
ADD INDEX `fk_level_idx` (`level` ASC)  COMMENT '';
ALTER TABLE `openUk`.`users` 
ADD CONSTRAINT `fk_level`
  FOREIGN KEY (`level`)
  REFERENCES `openUk`.`statuses` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
