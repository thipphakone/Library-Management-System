-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 18, 2026 at 09:35 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `library`
--

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `B_id` varchar(6) NOT NULL,
  `B_Name` varchar(20) NOT NULL,
  `Author` varchar(30) DEFAULT NULL,
  `Publisher` varchar(30) DEFAULT NULL,
  `Price` decimal(10,2) DEFAULT 0.00,
  `type_id` varchar(6) DEFAULT NULL,
  `status` enum('Available','Unavailable') NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`B_id`, `B_Name`, `Author`, `Publisher`, `Price`, `type_id`, `status`) VALUES
('B001', 'Java Beginner', 'Dr.Java', 'TechPress', 80000.00, 'T001', 'Available'),
('B002', 'Python Beginner', 'Dr.py', 'TeachPress', 85000.00, 'T001', 'Available'),
('B003', 'My Way', 'Kawin', 'TechPress', 10000.00, 'T002', 'Available'),
('B004', 's', 'aa', 'ss', 122222.00, 'T001', 'Unavailable');

-- --------------------------------------------------------

--
-- Table structure for table `book_type`
--

CREATE TABLE `book_type` (
  `type_id` varchar(6) NOT NULL,
  `type_name` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `book_type`
--

INSERT INTO `book_type` (`type_id`, `type_name`) VALUES
('T001', 'IT'),
('T002', 'Novel'),
('T003', 'Science');

-- --------------------------------------------------------

--
-- Table structure for table `borrow`
--

CREATE TABLE `borrow` (
  `Br_ID` varchar(6) NOT NULL,
  `M_id` varchar(6) DEFAULT NULL,
  `S_id` varchar(6) DEFAULT NULL,
  `Borrowing_Date` date DEFAULT NULL,
  `Due_date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `borrow`
--

INSERT INTO `borrow` (`Br_ID`, `M_id`, `S_id`, `Borrowing_Date`, `Due_date`) VALUES
('BR001', 'M001', 'S001', '2026-02-12', '2026-02-18'),
('BR002', 'M002', 'S001', '2026-02-12', '2026-02-18'),
('BR003', 'M001', 'S001', '2026-02-12', '2026-03-12'),
('BR004', 'M001', 'S001', '2026-02-12', '2026-02-27'),
('BR005', 'M001', 'S001', '2026-02-12', '2026-02-18'),
('BR006', 'M001', 'S001', '2026-02-03', '2026-02-18'),
('BR007', 'M001', 'S001', '2026-04-01', '2026-04-30');

-- --------------------------------------------------------

--
-- Table structure for table `borrow_detail`
--

CREATE TABLE `borrow_detail` (
  `Br_id` varchar(6) NOT NULL,
  `B_id` varchar(6) NOT NULL,
  `Return_date` date DEFAULT NULL,
  `Fine_Amount` decimal(10,2) DEFAULT 0.00
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `borrow_detail`
--

INSERT INTO `borrow_detail` (`Br_id`, `B_id`, `Return_date`, `Fine_Amount`) VALUES
('BR001', 'B001', '2026-02-12', 0.00),
('BR001', 'B002', '2026-02-12', 0.00),
('BR001', 'B003', '2026-02-12', 0.00),
('BR002', 'B004', '2026-02-12', 0.00),
('BR003', 'B001', '2026-02-12', 0.00),
('BR004', 'B001', '2026-02-12', 0.00),
('BR004', 'B002', '2026-02-12', 0.00),
('BR005', 'B003', '2026-02-12', 0.00),
('BR006', 'B002', '2026-02-12', 0.00),
('BR006', 'B003', '2026-02-12', 0.00),
('BR007', 'B004', NULL, 0.00);

-- --------------------------------------------------------

--
-- Table structure for table `member`
--

CREATE TABLE `member` (
  `M_id` varchar(6) NOT NULL,
  `M_Name` varchar(20) NOT NULL,
  `M_Surname` varchar(20) DEFAULT NULL,
  `Gender` enum('Male','Female') DEFAULT NULL,
  `Email` varchar(30) DEFAULT NULL,
  `Phone` varchar(14) DEFAULT NULL,
  `Village` varchar(30) DEFAULT NULL,
  `District` varchar(30) DEFAULT NULL,
  `Province` varchar(30) DEFAULT NULL,
  `Date_of_Member` date DEFAULT NULL,
  `Expiration_Date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `member`
--

INSERT INTO `member` (`M_id`, `M_Name`, `M_Surname`, `Gender`, `Email`, `Phone`, `Village`, `District`, `Province`, `Date_of_Member`, `Expiration_Date`) VALUES
('M001', 'khunthaxai', 'khammavong', 'Male', 'khan12@gmail.com', '11223344', 'DongDok', 'xaithany', 'Vientiane Capital', '2024-02-13', '2026-04-15'),
('M002', 'www', 'eee', 'Male', '', '', '', '', '', '2026-02-20', '2026-02-12'),
('M003', 'wwww', 'eee', 'Male', '', '', '', '', '', '2026-02-20', '2026-02-12');

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `S_id` varchar(6) NOT NULL,
  `S_Name` varchar(20) NOT NULL,
  `S_Surname` varchar(20) DEFAULT NULL,
  `Phone` varchar(14) DEFAULT NULL,
  `position` enum('Morning','Evening') DEFAULT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`S_id`, `S_Name`, `S_Surname`, `Phone`, `position`, `password`) VALUES
('S001', 'Thipphakone', 'Nouanthasim', '02052763004', 'Evening', 'T1234'),
('S002', 'Souphansa', 'Phommakhod', '02097262767', 'Morning', 'S1234');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`B_id`),
  ADD KEY `type_id` (`type_id`);

--
-- Indexes for table `book_type`
--
ALTER TABLE `book_type`
  ADD PRIMARY KEY (`type_id`);

--
-- Indexes for table `borrow`
--
ALTER TABLE `borrow`
  ADD PRIMARY KEY (`Br_ID`),
  ADD KEY `M_id` (`M_id`),
  ADD KEY `S_id` (`S_id`);

--
-- Indexes for table `borrow_detail`
--
ALTER TABLE `borrow_detail`
  ADD PRIMARY KEY (`Br_id`,`B_id`),
  ADD KEY `fk_b_id` (`B_id`);

--
-- Indexes for table `member`
--
ALTER TABLE `member`
  ADD PRIMARY KEY (`M_id`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`S_id`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `books`
--
ALTER TABLE `books`
  ADD CONSTRAINT `books_ibfk_1` FOREIGN KEY (`type_id`) REFERENCES `book_type` (`type_id`);

--
-- Constraints for table `borrow`
--
ALTER TABLE `borrow`
  ADD CONSTRAINT `borrow_ibfk_1` FOREIGN KEY (`M_id`) REFERENCES `member` (`M_id`),
  ADD CONSTRAINT `borrow_ibfk_2` FOREIGN KEY (`S_id`) REFERENCES `staff` (`S_id`);

--
-- Constraints for table `borrow_detail`
--
ALTER TABLE `borrow_detail`
  ADD CONSTRAINT `fk_b_id` FOREIGN KEY (`B_id`) REFERENCES `books` (`B_id`),
  ADD CONSTRAINT `fk_br_id` FOREIGN KEY (`Br_id`) REFERENCES `borrow` (`Br_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
