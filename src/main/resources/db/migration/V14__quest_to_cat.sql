ALTER TABLE `openUk`.`questions` 
CHANGE COLUMN `text` `text` VARCHAR(300) NOT NULL COMMENT '' ;

INSERT INTO `openUk`.`questions` (`id_category`, `text`, `points`) VALUES ('1', 'Оберіть правильну відповідь', '1');