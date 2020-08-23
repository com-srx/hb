/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80016
Source Host           : localhost:3306
Source Database       : hb

Target Server Type    : MYSQL
Target Server Version : 80016
File Encoding         : 65001

Date: 2020-08-23 21:55:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for eth
-- ----------------------------
DROP TABLE IF EXISTS `eth`;
CREATE TABLE `eth` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `transaction_num` decimal(10,6) DEFAULT NULL COMMENT '交易数量',
  `transaction_type` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci DEFAULT NULL COMMENT '交易类型',
  `transaction_single_price` decimal(10,6) DEFAULT NULL COMMENT '交易单价',
  `transaction_sum_price` decimal(10,6) DEFAULT NULL COMMENT '交易总价',
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='eth基础表';

-- ----------------------------
-- Records of eth
-- ----------------------------
INSERT INTO `eth` VALUES ('3', '1.685198', '1', '2870.000000', '4836.520000', '2020-08-22 22:45:48', '2020-08-22 22:45:48');
INSERT INTO `eth` VALUES ('4', '1.053444', '1', '2847.800000', '3000.000000', '2020-08-21 09:35:29', null);

-- ----------------------------
-- Table structure for eth_buy
-- ----------------------------
DROP TABLE IF EXISTS `eth_buy`;
CREATE TABLE `eth_buy` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `eth_single_price` decimal(10,0) DEFAULT NULL COMMENT 'eth单价',
  `eth_buy_num` decimal(10,0) DEFAULT NULL COMMENT '购买数量',
  `eth_sum_price` decimal(10,0) DEFAULT NULL COMMENT 'eth总价',
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='eth购买表';

-- ----------------------------
-- Records of eth_buy
-- ----------------------------

-- ----------------------------
-- Table structure for eth_sell
-- ----------------------------
DROP TABLE IF EXISTS `eth_sell`;
CREATE TABLE `eth_sell` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `eth_single_price` decimal(10,0) DEFAULT NULL COMMENT 'eth单价',
  `eth_sell_num` decimal(10,0) DEFAULT NULL COMMENT '出售数量',
  `eth_sum_price` decimal(10,0) DEFAULT NULL COMMENT 'eth总价',
  `create_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci COMMENT='eth出售表';

-- ----------------------------
-- Records of eth_sell
-- ----------------------------
