/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : simple_boot

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 22/05/2022 14:38:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`
(
    `id`          binary(16)                                                   NOT NULL,
    `create_time` timestamp                                                    NULL DEFAULT NULL,
    `create_user` binary(16)                                                   NULL DEFAULT (`id`),
    `update_time` timestamp                                                    NULL DEFAULT CURRENT_TIMESTAMP,
    `update_user` binary(16)                                                   NULL DEFAULT (`id`),
    `deleted`     tinyint                                                      NULL DEFAULT 0 COMMENT '软删除，默认为0， 0：未删除，1:已删除',
    `username`    varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
    `password`    varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
    PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB
  CHARACTER SET = utf8mb4
  COLLATE = utf8mb4_general_ci
  ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
