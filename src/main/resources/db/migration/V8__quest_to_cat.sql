ALTER TABLE `openUk`.`questions` 
CHANGE COLUMN `text` `text` VARCHAR(300) NOT NULL COMMENT '' ;

INSERT INTO `openUk`.`questions` (`id_category`, `text`, `points`) VALUES ('1', 'Оберіть правильний варіант', '1');
INSERT INTO `openUk`.`questions` (`id_category`, `text`, `points`) VALUES ('1', 'Літеру <em>о</em> на місці пропуску треба писати в усіх словах рядка', '1');
INSERT INTO `openUk`.`questions` (`id_category`, `text`, `points`) VALUES ('1', 'Літеру <em>и</em> на місці пропуску треба вставити', '1');
INSERT INTO `openUk`.`questions` (`id_category`, `text`, `points`) VALUES ('1', 'М’який знак треба писати на місці обох пропусків у словах', '1');
INSERT INTO `openUk`.`questions` (`id_category`, `text`, `points`) VALUES ('1', 'Літеру <em>е</em> треба писати в усіх словах рядка', '1');
INSERT INTO `openUk`.`questions` (`id_category`, `text`, `points`) VALUES ('1', 'Усі слова написані правильно в рядку', '1');
INSERT INTO `openUk`.`questions` (`id_category`, `text`, `points`) VALUES ('1', 'Правильно написано всі прислівники рядка', '1');
INSERT INTO `openUk`.`questions` (`id_category`, `text`, `points`) VALUES ('1', 'Вставте пропущену букву', '1');
INSERT INTO `openUk`.`questions` (`id_category`, `text`, `points`) VALUES ('1', 'оберіть правильний варіант', '1');
INSERT INTO `openUk`.`questions` (`id_category`, `text`, `points`) VALUES ('1', 'Вставте пропущену букву', '1');
INSERT INTO `openUk`.`questions` (`id_category`, `text`, `points`) VALUES ('1', 'Вставте пропущену букву', '1');

