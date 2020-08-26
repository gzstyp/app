/*
 Navicat Premium Data Transfer

 Source Server         : 192.168.3.166_MySQL8.0.15
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : 192.168.3.166:3308
 Source Schema         : jytc_pqmis

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 30/03/2019 00:26:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_core_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_core_menu`;
CREATE TABLE `sys_core_menu`  (
  `kid` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pid` int(10) UNSIGNED NULL DEFAULT 1024,
  `path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '',
  `icon` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '',
  `level` int(255) UNSIGNED NULL DEFAULT 0,
  PRIMARY KEY (`kid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_core_menu
-- ----------------------------
INSERT INTO `sys_core_menu` VALUES (1, '系统菜单', 1024, '', '', 1);
INSERT INTO `sys_core_menu` VALUES (2, '角色管理', 1, 'javascript:;', '', 2);
INSERT INTO `sys_core_menu` VALUES (3, '角色分配', 2, 'javascript:;', '', 3);

SET FOREIGN_KEY_CHECKS = 1;
