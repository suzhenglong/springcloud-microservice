DROP TABLE IF EXISTS `user`;
create table user (`id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键id', username varchar(40), name varchar(20), age int(3), balance decimal(10,2), primary key (id)) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_unicode_ci ROW_FORMAT = Dynamic;
