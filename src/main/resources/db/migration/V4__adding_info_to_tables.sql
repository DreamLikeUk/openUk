-- Inserting roles

INSERT INTO `openUk`.`roles` (`name`) VALUES ('ROLE_ADMIN');
INSERT INTO `openUk`.`roles` (`name`) VALUES ('ROLE_MODERATOR');
INSERT INTO `openUk`.`roles` (`name`) VALUES ('ROLE_USER');

-- Inserting permissions

INSERT INTO `openUk`.`permissions` (`name`) VALUES ('CAN_READ');
INSERT INTO `openUk`.`permissions` (`name`) VALUES ('CAN_ADD');
INSERT INTO `openUk`.`permissions` (`name`) VALUES ('CAN_EDIT');

-- Inserting permissions to roles

INSERT INTO `openUk`.`role_permissions` (`role_id`, `permission_id`) VALUES ('1', '1');
INSERT INTO `openUk`.`role_permissions` (`role_id`, `permission_id`) VALUES ('1', '2');
INSERT INTO `openUk`.`role_permissions` (`role_id`, `permission_id`) VALUES ('1', '3');
INSERT INTO `openUk`.`role_permissions` (`role_id`, `permission_id`) VALUES ('2', '1');
INSERT INTO `openUk`.`role_permissions` (`role_id`, `permission_id`) VALUES ('2', '3');
INSERT INTO `openUk`.`role_permissions` (`role_id`, `permission_id`) VALUES ('3', '1');

-- Inserting base categories

INSERT INTO `openUk`.`categories` (`name`, `image_link`) VALUES ('Орфографія', '#');
INSERT INTO `openUk`.`categories` (`name`, `image_link`) VALUES ('Фразеологія', '#');
INSERT INTO `openUk`.`categories` (`name`, `image_link`) VALUES ('Лексика', '#');
INSERT INTO `openUk`.`categories` (`name`, `image_link`) VALUES ('Редагування', '#');
INSERT INTO `openUk`.`categories` (`name`, `image_link`) VALUES ('Цікавинки', '#');

-- Inserting base statuses

INSERT INTO `openUk`.`statuses` (`name`, `points`) VALUES ('Першопрохідник', '70');
INSERT INTO `openUk`.`statuses` (`name`, `points`) VALUES ('Стріляеий заєць', '171');
INSERT INTO `openUk`.`statuses` (`name`, `points`) VALUES ('Досвідчений отаман', '400');
INSERT INTO `openUk`.`statuses` (`name`, `points`) VALUES ('Другий Шевченко', '1000');

