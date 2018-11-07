create database mybatis;

CREATE TABLE `mybatis`.`t_customer` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NULL,
  `jobs` VARCHAR(45) NULL,
  `phone` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));


INSERT INTO `mybatis`.`t_customer` (`username`, `jobs`, `phone`) VALUES ('zs', 'teacher', '123456789');
INSERT INTO `mybatis`.`t_customer` (`username`, `jobs`, `phone`) VALUES ('ls', 'worker', '789456123');


CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `mybatis`.`user`(`username`,`password`)VALUES('bjypc','123456');