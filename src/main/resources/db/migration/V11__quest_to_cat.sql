ALTER TABLE `openUk`.`questions` 
CHANGE COLUMN `text` `text` VARCHAR(300) NOT NULL COMMENT '' ;

INSERT INTO `openUk`.`questions` (`id_category`, `text`, `points`) VALUES ('1', 'Правильно написано всі слова у рядку', '1');
INSERT INTO `openUk`.`questions` (`id_category`, `text`, `points`) VALUES ('1', 'Апостроф потрібно  вставити у всіх рядках КРІМ', '1');
INSERT INTO `openUk`.`questions` (`id_category`, `text`, `points`) VALUES ('1', 'М’який знак потрібно вставити у рядку', '1');
INSERT INTO `openUk`.`questions` (`id_category`, `text`, `points`) VALUES ('1', 'Правильно написані всі слова у рядку', '1');
