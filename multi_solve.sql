-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 24, 2022 at 05:04 PM
-- Server version: 10.4.10-MariaDB
-- PHP Version: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `multi_solve`
--

-- --------------------------------------------------------

--
-- Table structure for table `photo_order`
--

CREATE TABLE `photo_order` (
  `order_id` int(11) NOT NULL,
  `event` varchar(50) NOT NULL,
  `duration` varchar(20) NOT NULL,
  `type` varchar(20) NOT NULL,
  `date` varchar(50) NOT NULL,
  `contact_number` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `photo_order`
--

INSERT INTO `photo_order` (`order_id`, `event`, `duration`, `type`, `date`, `contact_number`) VALUES
(60001, 'Birthday', '5H', 'Per/Click', '13', '01717338996'),
(60002, 'marrige', '5day', 'Per/Day', '06', '01717338996'),
(60003, 'Birthday', '23', 'Per/Day', '12', '0145412265');

-- --------------------------------------------------------

--
-- Table structure for table `tutor_order`
--

CREATE TABLE `tutor_order` (
  `order_id` int(11) NOT NULL,
  `version` varchar(50) NOT NULL,
  `class` varchar(10) NOT NULL,
  `subject` varchar(30) NOT NULL,
  `type` varchar(20) NOT NULL,
  `date` varchar(50) NOT NULL,
  `contact_number` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tutor_order`
--

INSERT INTO `tutor_order` (`order_id`, `version`, `class`, `subject`, `type`, `date`, `contact_number`) VALUES
(50001, 'Bangla', '6', 'Math', 'Monthly', 'January', '01717338996'),
(50002, 'English', '5', 'bangla', 'Monthly', '21', '01717338996'),
(50003, 'English', '1', 'Math', 'Hourly', '23', '01717225669');

-- --------------------------------------------------------

--
-- Table structure for table `user_data`
--

CREATE TABLE `user_data` (
  `user_id` int(11) NOT NULL,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) DEFAULT NULL,
  `address` varchar(150) NOT NULL,
  `email` varchar(50) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `age` int(11) DEFAULT NULL CHECK (`age` >= 18),
  `phone` varchar(11) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user_data`
--

INSERT INTO `user_data` (`user_id`, `first_name`, `last_name`, `address`, `email`, `gender`, `age`, `phone`, `password`) VALUES
(20001, 'Ahmed', 'Raz', 'Dhaka', 'razz@gmail.com', 'Male', 32, '01611200599', '1234'),
(20002, 'Siyamul', 'Islam', 'West Razabazar', 'siyamul.cse@gmail.com', 'Male', 22, '01717338996', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `worker_data`
--

CREATE TABLE `worker_data` (
  `worker_id` int(11) NOT NULL,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) DEFAULT NULL,
  `address` varchar(150) NOT NULL,
  `email` varchar(50) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `join_as` varchar(30) NOT NULL,
  `age` int(11) DEFAULT NULL CHECK (`age` >= 18),
  `phone` varchar(11) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `worker_data`
--

INSERT INTO `worker_data` (`worker_id`, `first_name`, `last_name`, `address`, `email`, `gender`, `join_as`, `age`, `phone`, `password`) VALUES
(10001, 'Siam', 'Islam', 'Dhaka', 'siyamul.cse@gmail.com', 'Male', 'Tutor', 22, '01717338996', '1234'),
(10002, 'Rahim', 'Ali', 'Bogura', 'rahim.bg@gmail.com', 'Male', 'Photographer', 41, '1777321995', '1234'),
(10003, 'Asma', 'Akter', 'Barisal', 'asma.new@gmail.com', 'Female', 'Tutor', 35, '1952455789', '1234'),
(10004, 'Asa', 'moni', 'chadpur', 'moniasa@gmail.com', 'Female', 'Photographer', 25, '01952455788', '1234'),
(10005, 'Bablu', 'Mia', 'Dhaka', 'bablu.new@hotmail.com', 'Male', 'Tutor', 32, '0145785412', '1234'),
(10006, 'Al', 'Hamra', 'Dhaka', 'ham@gmail.com', 'Female', 'Photographer', 25, '1521456321', '1234'),
(10008, 'Rashed', 'Ali', 'Chadpur', 'rashewd.cse@gmail.com', 'male', 'Tutor', 24, '01541236562', '1234'),
(10009, 'Harun', 'Azam', 'Noyakhali', 'harun@gmail.com', 'Male', 'Photographer', 33, '01854263656', '1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `photo_order`
--
ALTER TABLE `photo_order`
  ADD PRIMARY KEY (`order_id`);

--
-- Indexes for table `tutor_order`
--
ALTER TABLE `tutor_order`
  ADD PRIMARY KEY (`order_id`);

--
-- Indexes for table `user_data`
--
ALTER TABLE `user_data`
  ADD PRIMARY KEY (`user_id`),
  ADD UNIQUE KEY `phone` (`phone`);

--
-- Indexes for table `worker_data`
--
ALTER TABLE `worker_data`
  ADD PRIMARY KEY (`worker_id`),
  ADD UNIQUE KEY `phone` (`phone`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `photo_order`
--
ALTER TABLE `photo_order`
  MODIFY `order_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=60004;

--
-- AUTO_INCREMENT for table `tutor_order`
--
ALTER TABLE `tutor_order`
  MODIFY `order_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=50004;

--
-- AUTO_INCREMENT for table `user_data`
--
ALTER TABLE `user_data`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20004;

--
-- AUTO_INCREMENT for table `worker_data`
--
ALTER TABLE `worker_data`
  MODIFY `worker_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10010;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
