-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Sep 26, 2016 at 05:26 AM
-- Server version: 10.1.13-MariaDB
-- PHP Version: 7.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pms`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_disease`
--

CREATE TABLE `tbl_disease` (
  `disease_id` int(11) NOT NULL,
  `disease_name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_disease`
--

INSERT INTO `tbl_disease` (`disease_id`, `disease_name`) VALUES
(1, 'Fever'),
(2, 'Cold');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_medicine`
--

CREATE TABLE `tbl_medicine` (
  `medicine_id` int(11) NOT NULL,
  `medicine_name` varchar(250) NOT NULL,
  `medicine_price` varchar(50) NOT NULL,
  `quantity` int(11) NOT NULL,
  `added_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `modified_date` timestamp NULL DEFAULT NULL,
  `status` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tbl_medicine`
--

INSERT INTO `tbl_medicine` (`medicine_id`, `medicine_name`, `medicine_price`, `quantity`, `added_date`, `modified_date`, `status`) VALUES
(1, '6-MP', '120', 500, '2016-09-26 01:17:33', NULL, 1),
(3, 'Methotexrate', '1200', 500, '2016-09-26 02:12:01', NULL, 0);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_patient`
--

CREATE TABLE `tbl_patient` (
  `patient_id` int(11) NOT NULL,
  `first_name` text NOT NULL,
  `last_name` varchar(255) NOT NULL,
  `email_id` varchar(255) NOT NULL,
  `contact_number` varchar(30) NOT NULL,
  `enquired_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `medicine_id` int(11) NOT NULL,
  `disease_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_disease`
--
ALTER TABLE `tbl_disease`
  ADD PRIMARY KEY (`disease_id`);

--
-- Indexes for table `tbl_medicine`
--
ALTER TABLE `tbl_medicine`
  ADD PRIMARY KEY (`medicine_id`);

--
-- Indexes for table `tbl_patient`
--
ALTER TABLE `tbl_patient`
  ADD PRIMARY KEY (`patient_id`),
  ADD KEY `disease_id` (`disease_id`),
  ADD KEY `medicine_id` (`medicine_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_disease`
--
ALTER TABLE `tbl_disease`
  MODIFY `disease_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `tbl_medicine`
--
ALTER TABLE `tbl_medicine`
  MODIFY `medicine_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `tbl_patient`
--
ALTER TABLE `tbl_patient`
  MODIFY `patient_id` int(11) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_patient`
--
ALTER TABLE `tbl_patient`
  ADD CONSTRAINT `tbl_patient_ibfk_1` FOREIGN KEY (`disease_id`) REFERENCES `tbl_disease` (`disease_id`),
  ADD CONSTRAINT `tbl_patient_ibfk_2` FOREIGN KEY (`disease_id`) REFERENCES `tbl_disease` (`disease_id`),
  ADD CONSTRAINT `tbl_patient_ibfk_3` FOREIGN KEY (`disease_id`) REFERENCES `tbl_disease` (`disease_id`),
  ADD CONSTRAINT `tbl_patient_ibfk_4` FOREIGN KEY (`medicine_id`) REFERENCES `tbl_medicine` (`medicine_id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
