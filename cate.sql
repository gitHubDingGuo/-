/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2019-09-16 17:16:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `adminName` varchar(25) DEFAULT NULL,
  `phoneNumber` varchar(11) DEFAULT NULL,
  `email` varchar(25) DEFAULT NULL,
  `sex` varchar(1) DEFAULT NULL,
  `role` varchar(16) DEFAULT NULL,
  `enjoinTime` datetime DEFAULT NULL,
  `adminPassword` varchar(20) DEFAULT NULL,
  `statues` int(2) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', '123456', '123456', '123456', '男', '管理员', '2019-01-01 21:05:17', '123456', '0');
INSERT INTO `admin` VALUES ('2', '111111', '10000', '111111', '女', '编辑人员', '2019-01-01 21:05:17', '111111', '0');

-- ----------------------------
-- Table structure for all_recipe
-- ----------------------------
DROP TABLE IF EXISTS `all_recipe`;
CREATE TABLE `all_recipe` (
  `allID` int(11) NOT NULL,
  `pictureName` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `mainIngredient` varchar(60) DEFAULT NULL,
  `flavour` varchar(60) DEFAULT NULL,
  `step` varchar(255) DEFAULT NULL,
  `recipeName` varchar(205) DEFAULT NULL,
  PRIMARY KEY (`allID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of all_recipe
-- ----------------------------
INSERT INTO `all_recipe` VALUES ('1', 'allImg/1.png', '如何粗粮细做-玉米面发面豆沙饼', '面粉：100g;酵母：5g;鸡蛋：2个；清水：适量；', '豆沙馅', '1加沸水，搅拌至无干粉，放凉。玉米面烫过以后，口感更细腻。2再加入清水，和成柔软的面团，至冰箱冷藏发酵过夜3\r\n7\r\n排气，搓条4锅烧热，刷油，下饼胚，表面也刷油，锁住水分，盖盖子，中小火煎。5两面都煎至金黄，按压饼可快速回弹，饼就熟了', '香煎面包');
INSERT INTO `all_recipe` VALUES ('2', 'allImg/2.png', '如何做鱼香菜饼？', '鱼肉：100g;面粉400g;酵母：5g;牛奶：20g;', '食盐：10g;胡椒粉：10g.菜籽油：60g;清水适量。', '1面粉散开，鱼肉打散，2面粉发酵;3鱼肉和面粉糅合4上锅香煎。', '鱼香菜饼');
INSERT INTO `all_recipe` VALUES ('3', 'allImg/3.png', '关于五味杂陈？', '鱼肉：100g;面粉400g;酵母：5g;牛奶：20g;', '食盐：10g;胡椒粉：10g.菜籽油：60g;清水适量。', '1面粉散开，鱼肉打散，2面粉发酵;3鱼肉和面粉糅合4上锅香煎。', '五味杂陈');
INSERT INTO `all_recipe` VALUES ('4', 'allImg/4.png', '关于酸辣黄鱼？', '面粉：100g;酵母：5g;鸡蛋：2个；清水：适量；', '鸡精：10g;食用油：30g;', '1准备好需要的食材，干贝提前泡发，花蛤冲洗干净,2开火，锅内倒入适量的食用油，先加入生姜片爆香3接着倒入沥干水分的干贝翻炒接着加入花蛤翻炒。4非常鲜美的干贝花蛤儿菜汤！', '酸辣黄鱼');
INSERT INTO `all_recipe` VALUES ('5', 'allImg/5.png', '关于五香熏鱼？', '面粉：100g;酵母：5g;鸡蛋：2个；清水：适量；', '鸡精：10g;食用油：30g;', '1面粉散开，鱼肉打散，2面粉发酵;3鱼肉和面粉糅合4上锅香煎。', '五香熏鱼');
INSERT INTO `all_recipe` VALUES ('6', 'allImg/6.png', '关于御泉柠檬？', '花蛤：260g；干贝：25g;儿菜：5-6棵；盐：10g;酱油：30g;', '食盐：10g;胡椒粉：10g.菜籽油：60g;清水适量。', '1加沸水，搅拌至无干粉，放凉。玉米面烫过以后，口感更细腻。2再加入清水，和成柔软的面团，至冰箱冷藏发酵过夜3\r\n7\r\n排气，搓条4锅烧热，刷油，下饼胚，表面也刷油，锁住水分，盖盖子，中小火煎。5两面都煎至金黄，按压饼可快速回弹，饼就熟了', '御泉柠檬');
INSERT INTO `all_recipe` VALUES ('7', 'allImg/7.png', '关于樱桃橙檬？', '面粉：100g;酵母：5g;鸡蛋：2个；清水：适量；', '食盐：10g;胡椒粉：10g.菜籽油：60g;清水适量。', '1面粉散开，鱼肉打散，2面粉发酵;3鱼肉和面粉糅合4上锅香煎。', '樱桃橙檬');
INSERT INTO `all_recipe` VALUES ('8', 'allImg/8.png', '关于果物纷纷？', '花蛤：260g；干贝：25g;儿菜：5-6棵；盐：10g;酱油：30g;', '鸡精：10g;食用油：30g;', '1加沸水，搅拌至无干粉，放凉。玉米面烫过以后，口感更细腻。2再加入清水，和成柔软的面团，至冰箱冷藏发酵过夜3\r\n7\r\n排气，搓条4锅烧热，刷油，下饼胚，表面也刷油，锁住水分，盖盖子，中小火煎。5两面都煎至金黄，按压饼可快速回弹，饼就熟了', '果物纷纷');

-- ----------------------------
-- Table structure for collection
-- ----------------------------
DROP TABLE IF EXISTS `collection`;
CREATE TABLE `collection` (
  `collectionId` int(10) NOT NULL AUTO_INCREMENT,
  `accountNumber` varchar(60) DEFAULT NULL,
  `allID` int(10) DEFAULT NULL,
  PRIMARY KEY (`collectionId`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of collection
-- ----------------------------
INSERT INTO `collection` VALUES ('15', '123@qq.com', '5');
INSERT INTO `collection` VALUES ('19', '11@qq.com', '0');
INSERT INTO `collection` VALUES ('22', '2@qq.com', '0');
INSERT INTO `collection` VALUES ('23', '1@qq.com', '0');

-- ----------------------------
-- Table structure for comment
-- ----------------------------
DROP TABLE IF EXISTS `comment`;
CREATE TABLE `comment` (
  `commentId` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(255) DEFAULT NULL,
  `accountNumber` varchar(20) DEFAULT NULL,
  `allId` int(11) DEFAULT NULL,
  PRIMARY KEY (`commentId`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of comment
-- ----------------------------
INSERT INTO `comment` VALUES ('2', '好吃', '1@qq.com', '0');
INSERT INTO `comment` VALUES ('3', '干贝菜汤真好喝。', '1@qq.com', '2');
INSERT INTO `comment` VALUES ('4', '鱼香菜饼我喜欢', '1@qq.com', '2');
INSERT INTO `comment` VALUES ('5', '真香！', '1@qq.com', '1');
INSERT INTO `comment` VALUES ('6', '真好吃', '1@qq.com', '1');
INSERT INTO `comment` VALUES ('7', '开心', '1@qq.com', '1');
INSERT INTO `comment` VALUES ('8', '今天晚上回去做.。', '1@qq.com', '0');
INSERT INTO `comment` VALUES ('9', '今天晚上回去做.。', '1@qq.com', '0');
INSERT INTO `comment` VALUES ('10', '你们会做吗。', '1@qq.com', '1');
INSERT INTO `comment` VALUES ('11', '呵呵哈哈哈', '1@qq.com', '0');
INSERT INTO `comment` VALUES ('12', '我来了，小老弟。', '1@qq.com', '0');
INSERT INTO `comment` VALUES ('13', '我也喜欢吃', '992279357@qq.com', '0');
INSERT INTO `comment` VALUES ('14', '6666666', '9922793571@qq.com', '0');
INSERT INTO `comment` VALUES ('15', '这个看起来好垃圾的样子。', '9922793571@qq.com', '2');
INSERT INTO `comment` VALUES ('16', '你这个内容和实质的内容不符合啊，人才。', '1@qq.com', '8');
INSERT INTO `comment` VALUES ('17', '这个看起来好垃圾的样子。', '1@qq.com', '0');
INSERT INTO `comment` VALUES ('18', '这是我写的评论.', '12@qq.com', '0');
INSERT INTO `comment` VALUES ('19', '垃圾网站，继续加油写完善', '11@qq.com', '0');
INSERT INTO `comment` VALUES ('20', '在发一遍', '2@qq.com', '0');
INSERT INTO `comment` VALUES ('21', '垃圾网站，继续加油写完善', '11@qq.com', '0');

-- ----------------------------
-- Table structure for feedback
-- ----------------------------
DROP TABLE IF EXISTS `feedback`;
CREATE TABLE `feedback` (
  `content` varchar(255) DEFAULT NULL,
  `feedBackId` int(10) NOT NULL AUTO_INCREMENT,
  `accountNumber` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`feedBackId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of feedback
-- ----------------------------
INSERT INTO `feedback` VALUES ('你们的网站可以再垃圾一点吗，卡成狗了。', '1', '1@qq.com');
INSERT INTO `feedback` VALUES ('做出这种垃圾，还好意思放出来。', '2', '9922793571@qq.com');
INSERT INTO `feedback` VALUES ('666666', '3', '123@qq.com');
INSERT INTO `feedback` VALUES ('继续做好一点网站', '4', '11@qq.com');
INSERT INTO `feedback` VALUES ('666666666', '5', '2@qq.com');

-- ----------------------------
-- Table structure for idcard
-- ----------------------------
DROP TABLE IF EXISTS `idcard`;
CREATE TABLE `idcard` (
  `id` tinyint(2) NOT NULL AUTO_INCREMENT,
  `code` varchar(18) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of idcard
-- ----------------------------
INSERT INTO `idcard` VALUES ('1', '123456789123456789');

-- ----------------------------
-- Table structure for me
-- ----------------------------
DROP TABLE IF EXISTS `me`;
CREATE TABLE `me` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(10) DEFAULT NULL,
  `salary` double(5,2) DEFAULT NULL,
  `sex` varchar(2) DEFAULT NULL,
  `hobby` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of me
-- ----------------------------
INSERT INTO `me` VALUES ('1', '1', '1.00', '男', '射箭');
INSERT INTO `me` VALUES ('2', '2', '2.00', '男', '男女');
INSERT INTO `me` VALUES ('3', '3', '3.00', '男', '男女');
INSERT INTO `me` VALUES ('4', '55', '555.00', '女', '射箭,跳水');
INSERT INTO `me` VALUES ('5', '5', '5.00', '女', '跳水');
INSERT INTO `me` VALUES ('6', '33', '33.00', '男', '射箭');
INSERT INTO `me` VALUES ('7', '2', '2.00', '男', '射箭');
INSERT INTO `me` VALUES ('8', '1', '1.00', '男', '射箭');

-- ----------------------------
-- Table structure for menu_message
-- ----------------------------
DROP TABLE IF EXISTS `menu_message`;
CREATE TABLE `menu_message` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `accountName` varchar(30) DEFAULT NULL,
  `menuName` varchar(50) DEFAULT NULL,
  `difficulty` varchar(10) DEFAULT '一星',
  `pictureName` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `mainIngredient` varchar(50) DEFAULT NULL,
  `flavour` varchar(100) DEFAULT NULL,
  `step` varchar(255) DEFAULT '',
  `knack` varchar(50) DEFAULT NULL,
  `userName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of menu_message
-- ----------------------------
INSERT INTO `menu_message` VALUES ('1', '', '', '', '', '', null, null, '', '', null);
INSERT INTO `menu_message` VALUES ('9', '9922793571@qq.com', '1236', '一星', 'recipeImg/1547004972860.jpg', '123', '123', '123', '123', '123', null);
INSERT INTO `menu_message` VALUES ('11', '123@qq.com', '美味的花', '一星', 'recipeImg/1547110343035.jpg', '123', '123', '123', '123', '123', null);
INSERT INTO `menu_message` VALUES ('15', '1@qq.com', '美味的花', '一星', 'recipeImg/1547114118213.jpg', 'f', '1', '1', '1', '1', null);

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `id` tinyint(2) NOT NULL AUTO_INCREMENT,
  `ordersn` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `user_id` tinyint(2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `user_id` (`user_id`),
  CONSTRAINT `user_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES ('1', '999999', '1');
INSERT INTO `orders` VALUES ('2', '88888', '1');
INSERT INTO `orders` VALUES ('3', '7777777', '31');
INSERT INTO `orders` VALUES ('4', '666666666', '31');

-- ----------------------------
-- Table structure for orders_detail
-- ----------------------------
DROP TABLE IF EXISTS `orders_detail`;
CREATE TABLE `orders_detail` (
  `id` tinyint(2) NOT NULL AUTO_INCREMENT,
  `orders_id` tinyint(2) DEFAULT NULL,
  `product_id` tinyint(2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `orders_id` (`orders_id`),
  KEY `product_id` (`product_id`),
  CONSTRAINT `orders_id` FOREIGN KEY (`orders_id`) REFERENCES `orders` (`id`),
  CONSTRAINT `product_id` FOREIGN KEY (`product_id`) REFERENCES `product` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of orders_detail
-- ----------------------------
INSERT INTO `orders_detail` VALUES ('1', '1', '1');
INSERT INTO `orders_detail` VALUES ('2', '1', '2');
INSERT INTO `orders_detail` VALUES ('3', '2', '1');
INSERT INTO `orders_detail` VALUES ('4', '2', '2');
INSERT INTO `orders_detail` VALUES ('5', '3', '1');

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` tinyint(2) NOT NULL,
  `name` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `idcard_id` tinyint(2) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `idcard_id` (`idcard_id`),
  CONSTRAINT `idcard_id` FOREIGN KEY (`idcard_id`) REFERENCES `idcard` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', '陈恒', '88', '1');

-- ----------------------------
-- Table structure for product
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` tinyint(2) NOT NULL,
  `name` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `price` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of product
-- ----------------------------
INSERT INTO `product` VALUES ('1', '好书', '88');
INSERT INTO `product` VALUES ('2', '坏书', '8.8');

-- ----------------------------
-- Table structure for register
-- ----------------------------
DROP TABLE IF EXISTS `register`;
CREATE TABLE `register` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `accountNumber` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `status` int(11) DEFAULT '0',
  `sex` char(6) DEFAULT NULL,
  `phoneNumber` varchar(15) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `address` varchar(30) DEFAULT NULL,
  `enjoinTime` datetime DEFAULT NULL,
  `name` varchar(30) DEFAULT '123',
  `fileName` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=54 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of register
-- ----------------------------
INSERT INTO `register` VALUES ('36', '123@qq.com', '757545', '0', '女', '12345678944', '12345678944@qq.com', '郴州市区', null, '张三', null);
INSERT INTO `register` VALUES ('37', '88787@qq.com', '554545', '0', '女', '12345678966', '12345678966@qq.com', '岳阳市区', null, '李四', null);
INSERT INTO `register` VALUES ('41', '125800@qq.com', '125800', '0', '女', '12345678933', '12345678933@qq.com', '长沙市区', null, '王五', null);
INSERT INTO `register` VALUES ('42', '12580@qq.com', '12580', '0', '男', '12345688888', '12345688888@qq.com', '浏阳市区', null, '溜溜', null);
INSERT INTO `register` VALUES ('43', 'erer@qq.com', 'dfdf', '0', '男', '12548653555', '12548653555@qq.com', '张家界市区', null, '小明', null);
INSERT INTO `register` VALUES ('44', '44245242@qq.com', '24242424', '0', '女', '15627561712', '15627561712@qq.com', '张家界市区', null, '李哥', null);
INSERT INTO `register` VALUES ('45', '992279357@qq.com', '123456', '0', '男', '15627523467', '15627523467@qq.com', '张家界市区', null, '发哥', null);
INSERT INTO `register` VALUES ('46', '9922793571@qq.com', '123456', '0', '男', '10086', '1314520@qq.com', '张家界市区', null, '李勇', 'img/3.png');
INSERT INTO `register` VALUES ('48', '1@qq.com', '111111', '0', 'null', '112233', '1@qq.com', 'dfdf', null, '123', 'recipeImg/1547126819703.jpg');
INSERT INTO `register` VALUES ('49', '12@qq.com', '123456', '0', null, null, null, null, null, '123', null);
INSERT INTO `register` VALUES ('50', '11@qq.com', '123456', '0', 'null', '1234567899', '123456789@qq.com', '123', null, '123', 'recipeImg/1547167161974.png');
INSERT INTO `register` VALUES ('51', '2@qq.com', '123456', '0', 'null', '1', '1@qq.com', '1', null, '123', 'recipeImg/1547131432182.jpg');
INSERT INTO `register` VALUES ('52', '123456@qq.com', '123456', '0', null, null, null, null, null, '123', null);
INSERT INTO `register` VALUES ('53', '11123456@qq.com', '123456', '0', null, null, null, null, null, '123', null);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `uid` tinyint(2) NOT NULL AUTO_INCREMENT,
  `uname` varchar(20) COLLATE utf8_unicode_ci DEFAULT NULL,
  `usex` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `password` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '张三', '女', '1');
INSERT INTO `user` VALUES ('31', '李四', '男', '2');

-- ----------------------------
-- Table structure for you
-- ----------------------------
DROP TABLE IF EXISTS `you`;
CREATE TABLE `you` (
  `sid` int(11) NOT NULL,
  `sname` varchar(12) NOT NULL,
  `sex` varchar(12) NOT NULL,
  `age` int(11) NOT NULL,
  `time` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of you
-- ----------------------------
