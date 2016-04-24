ALTER TABLE `openUk`.`categories` 
CHANGE COLUMN `image_link` `image_link` VARCHAR(200) NOT NULL COMMENT '' ;

UPDATE `openUk`.`categories` SET `image_link`='http://thedifference.ru/wp-content/uploads/2015/03/leksika.jpg' WHERE `id`='3';
UPDATE `openUk`.`categories` SET `image_link`='http://cs417231.vk.me/v417231018/1611/E2x0ZAfFZMM.jpg' WHERE `id`='4';
UPDATE `openUk`.`categories` SET `image_link`='http://ostriv.in.ua/images/publications/4/3889/1313477158.gif' WHERE `id`='2';
UPDATE `openUk`.`categories` SET `image_link`='http://image.zn.ua/media/images/614xX/Jan2011/6150.jpg' WHERE `id`='1';
