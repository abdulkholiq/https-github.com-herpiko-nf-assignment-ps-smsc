-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Apr 23, 2014 at 07:24 AM
-- Server version: 5.6.14
-- PHP Version: 5.5.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `addressbook`
--

-- --------------------------------------------------------

--
-- Table structure for table `person`
--

CREATE TABLE IF NOT EXISTS `person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(30) NOT NULL,
  `phone` varchar(30) NOT NULL,
  `email` varchar(30) DEFAULT NULL,
  `gender` varchar(30) DEFAULT NULL,
  `city` varchar(30) DEFAULT NULL,
  `location` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=38 ;

--
-- Dumping data for table `person`
--

INSERT INTO `person` (`id`, `name`, `phone`, `email`, `gender`, `city`, `location`) VALUES
(24, 'Abdullah Al Mizan', '01827740140', 'mizan.se@outlook.com', 'Male', 'kishorganj', 'Azimpur'),
(25, 'Tahsir Ahmed  Munna', '01926973066', 'tahsirahmedmunna@gmail.com', 'Male', 'Dhaka', 'lalbag'),
(27, 'Jahidul Islam bd', '01838676468', 'jahidulislambd52@gmail.com', 'Male', 'Gazipur', 'Mazukhan'),
(28, 'Arifin Islam', '01747703842', 'arifin447@diu.edu.bd', 'Male', 'Dhaka', 'Dhanamondi'),
(30, 'Bithi Akther', '01914098182', 'bithiakther@live.com', 'Female', 'Mymenshingh', 'Gafargoan'),
(31, 'tutul bd', '01830516053', 's.i.tutulks@gmail.com', 'Male', 'Dhaka', 'Dhanmodi'),
(32, 'yamin alam', '01751300314', 'lafijyamin@gmail.com', 'Male', 'dinajpur', 'dhanmondi'),
(33, 'Mehedi hasan', '01848384834', 'mehedi', 'Male', 'Dhaka', 'Dhanmondi'),
(35, 'Rakib Hasan Bappi', '01751398320', 'hasanbappi@gmail.com', 'Male', 'Dhaka', 'Mirpur'),
(36, 'Azizul Hakim', '01683495632', 'azizul395@diu.edu.bd', 'Male', 'Gazipur', 'Dhanmondi'),
(37, 'Eva', '87457', 'uiwejkfh@gmail.com', 'Female', 'Dhaka', 'Dhanmondi');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `ID` int(30) NOT NULL AUTO_INCREMENT,
  `Name` varchar(30) NOT NULL,
  `UserName` varchar(30) NOT NULL,
  `Password` int(30) NOT NULL,
  PRIMARY KEY (`UserName`),
  UNIQUE KEY `ID` (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 COMMENT='This Table just for user login System' AUTO_INCREMENT=8 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`ID`, `Name`, `UserName`, `Password`) VALUES
(1, 'Admin', 'Admin', 1234),
(5, 'Arifin Islam', 'arifin', 1234),
(6, 'Abdullah Al Mamun', 'mamun', 1234),
(2, 'Abdullah Al Mizan', 'Mizan', 1011),
(4, 'Md. Mijanur Rahman', 'mmr', 1234),
(3, 'Tahsir Ahmed MUnna', 'Munna', 1234),
(7, 'Sharmin Sultana Urmi', 'urmi', 1234);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
