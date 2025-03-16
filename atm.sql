-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: May 19, 2019 at 08:30 AM
-- Server version: 5.7.21
-- PHP Version: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `atm`
--

-- --------------------------------------------------------

--
-- Table structure for table `bank_account`
--

DROP TABLE IF EXISTS `bank_account`;
CREATE TABLE IF NOT EXISTS `bank_account` (
  `ac_no` varchar(50) NOT NULL,
  `name` varchar(100) NOT NULL,
  `ac_type` varchar(50) NOT NULL,
  `card_no` varchar(50) NOT NULL,
  `pin_no` varchar(50) NOT NULL,
  `balance` double NOT NULL,
  PRIMARY KEY (`ac_no`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bank_account`
--

INSERT INTO `bank_account` (`ac_no`, `name`, `ac_type`, `card_no`, `pin_no`, `balance`) VALUES
('111-222-333', 'TGSR Kumara', 'Serving', '123456', '1122', 158800),
('222-333-444', 'WAWGSD Weerasinghe', 'Serving', '654321', '3344', 407500);

-- --------------------------------------------------------

--
-- Table structure for table `withdraw`
--

DROP TABLE IF EXISTS `withdraw`;
CREATE TABLE IF NOT EXISTS `withdraw` (
  `ac_no` varchar(100) NOT NULL,
  `amount` varchar(100) NOT NULL,
  `date` varchar(50) NOT NULL,
  `time` varchar(50) NOT NULL,
  `description` varchar(100) NOT NULL,
  PRIMARY KEY (`ac_no`,`time`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `withdraw`
--

INSERT INTO `withdraw` (`ac_no`, `amount`, `date`, `time`, `description`) VALUES
('111-222-333', '5000', '2018-11-24', '3:46:29', 'wd'),
('111-222-333', '3000', '2018-11-24', '3:46:14', 'wd'),
('111-222-333', '5000', '2018-11-24', '2:56:43', 'wd'),
('222-333-444', '500', '2018-11-24', '2:53:34', 'wd'),
('111-222-333', '1000', '2018-11-24', '2:53:8', 'wd'),
('111-222-333', '900', '2018-11-24', '2:50:52', 'wd'),
('111-222-333', '100', '2018-11-24', '2:49:58', 'wd'),
('111-222-333', '7000', '2018-11-24', '2:49:39', 'wd'),
('111-222-333', '100', '2018-11-24', '0:51:8', 'wd'),
('111-222-333', '100', '2018-11-24', '0:50:56', 'wd'),
('111-222-333', '100', '2018-11-24', '0:50:44', 'wd'),
('222-333-444', '500', '2018-11-24', '0:40:55', 'wd'),
('111-222-333', '200', '2018-11-24', '0:40:17', 'wd'),
('111-222-333', '500', '2018-11-24', '0:40:0', 'wd'),
('111-222-333', '346', '2018-11-24', '0:39:34', 'wd'),
('111-222-333', '555', '2018-11-24', '0:27:10', 'wd'),
('111-222-333', '999', '2018-11-24', '10:27:27', 'wd'),
('123654789', '511', '1414', '1414', 'wd'),
('222-333-444', '500', '2018-11-24', '3:48:2', 'wd'),
('222-333-444', '1000', '2018-11-24', '3:48:16', 'wd'),
('111-222-333', '100', '2018-11-24', '4:31:39', 'wd'),
('111-222-333', '1000', '2018-11-25', '1:16:49', 'wd'),
('null', 'null', 'null', 'null', 'wd'),
('1', '11', '1', '11', 'wd'),
('111-222-333', '100', '2018-11-28', '0:43:47', 'wd'),
('111-222-333', '1000', '2018-12-20', '9:58:43', 'wd'),
('111-222-333', '5000', '2018-12-20', '9:59:5', 'TR'),
('111-222-333', '5000', '2018-12-20', '10:27:23', 'wd'),
('111-222-333', '4000', '2018-12-20', '10:27:38', 'wd');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
