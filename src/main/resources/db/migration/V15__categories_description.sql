ALTER TABLE `openUk`.`categories`
CHANGE COLUMN `description` `description` VARCHAR(400) NULL DEFAULT NULL COMMENT '' ;

UPDATE `openUk`.`categories` SET `description`='У розділі  ”Орфографія" подано типові тестові завдання для обрання трійки слів з правильними літерами. Можуть бути завдання, де потрібно вписати прaвильну літеру. Всього завдань з розділу - 10.'WHERE `id`='1';
UPDATE `openUk`.`categories` SET `description`='У розділі  ”Фразеологія" подано типові тестові завдання для обрання відповідності фразеологізм-значення. Всього завдань з розділу - 10. 'WHERE `id`='2';
UPDATE `openUk`.`categories` SET `description`='У розділі  “Лексика" подано типові тестові завдання для обрання відповідності слово-значення. Всього завдань з розділу - 10.'WHERE `id`='3';
UPDATE `openUk`.`categories` SET `description`='У розділі  "Редагування" подано типові тестові завдання для обрання правильного речення. Всього завдань з розділу - 10'WHERE `id`='4';
UPDATE `openUk`.`categories` SET `description`='У розділі ”Цікавинки" подано цікаві та, можливо, малознайомі факти про українську мову.'WHERE `id`='5';
