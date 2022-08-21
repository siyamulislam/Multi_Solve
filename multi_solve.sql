-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 11, 2022 at 08:13 PM
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
(10001, 'Siam', 'Islam', 'dhaka', 'siyamul.cse@gmail.com', 'Male', 'Tutor', 22, '01717338996', '1234'),
(10002, 'Rahim', 'Ali', 'Bogura', 'rahim.bg@gmail.com', 'Male', 'Photographer', 44, '01777321995', '1234'),
(10003, 'Asma', 'Akter', 'Barishal', 'asma.new@gmail.com', 'Female', 'Tutor', 35, '01952455789', '1234'),
(10004, 'Asa', 'moni', 'chadpur', 'moniasa@gmail.com', 'Female', 'Photographer', 25, '01952455788', '1234'),
(10005, 'Bablu', 'Mia', 'Dhaka', 'bablu.new@hotmail.com', 'Male', 'Tutor', 32, '0145785412', '1234'),
(10006, 'Al', 'Hamra', 'Dhaka', 'ham@gmail.com', 'Male', 'Photographer', 19, '03235655', '1213'),
(10007, 'RAshed', 'Khan', 'Dhaka', 'rsad@gmail.com', 'Male', 'Photographer', 21, '01615237685', '12340');

--
-- Indexes for dumped tables
--

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
-- AUTO_INCREMENT for table `worker_data`
--
ALTER TABLE `worker_data`
  MODIFY `worker_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10008;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
