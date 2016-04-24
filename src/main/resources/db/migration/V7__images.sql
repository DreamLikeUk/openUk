ALTER TABLE `openUk`.`categories` 
CHANGE COLUMN `image_link` `image_link` VARCHAR(250) NOT NULL COMMENT '' ;

UPDATE `openUk`.`categories` SET `image_link`='../resources/images/leksika.jpg' WHERE `id`='3';
UPDATE `openUk`.`categories` SET `image_link`='http://joymylife.org.ua/drawing/img/egik4.png' WHERE `id`='5';
