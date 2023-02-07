-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Feb 07, 2023 at 05:21 AM
-- Server version: 8.0.30
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `health_book`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_admin`
--

CREATE TABLE `tb_admin` (
  `id_admin` varchar(15) NOT NULL,
  `nama_admin` varchar(30) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_admin`
--

INSERT INTO `tb_admin` (`id_admin`, `nama_admin`, `username`, `password`) VALUES
('001', 'Antar S', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `tb_history_pasien`
--

CREATE TABLE `tb_history_pasien` (
  `no_pasien` varchar(17) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `nama_pasien` varchar(30) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `jenis_kelamin` varchar(12) NOT NULL,
  `alamat` text NOT NULL,
  `no_tlp` varchar(15) NOT NULL,
  `kode_kamar` varchar(8) NOT NULL,
  `lantai` varchar(10) NOT NULL,
  `no_kamar` varchar(10) NOT NULL,
  `tipe_kamar` varchar(8) NOT NULL,
  `harga_permalam` int NOT NULL,
  `cek_in` varchar(10) NOT NULL,
  `cek_out` varchar(10) NOT NULL,
  `lama_menginap` int NOT NULL,
  `total_biaya` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_history_pasien`
--

INSERT INTO `tb_history_pasien` (`no_pasien`, `nama_pasien`, `jenis_kelamin`, `alamat`, `no_tlp`, `kode_kamar`, `lantai`, `no_kamar`, `tipe_kamar`, `harga_permalam`, `cek_in`, `cek_out`, `lama_menginap`, `total_biaya`) VALUES
('3323040', 'Ahmad Fikri', 'Laki-laki', 'Muntilan Magelang', '0831234567890', '2001', 'Lantai 2', '002', 'Kelas 2', 500000, '06-02-2023', '06-02-2023', 0, 500000),
('33230', 'Test', 'Laki-laki', 'Purwokerto', '08310000', '2001', 'Lantai 2', '002', 'Kelas 2', 500000, '07-02-2023', '07-02-2023', 0, 500000),
('1234', 'Bca', 'Perempuan', 'Bandung', '980', '2003', 'Lantai 2', '003', 'Kelas 3', 300000, '07-02-2023', '07-02-2023', 0, 300000),
('123', 'Abc', 'Laki-laki', 'Jakarta', '321', '2001', 'Lantai 2', '002', 'Kelas 2', 500000, '07-02-2023', '07-02-2023', 0, 500000),
('123', 'surti', 'Perempuan', 'Magelang', '890', '2003', 'Lantai 2', '003', 'Kelas 3', 300000, '07-02-2023', '07-02-2023', 1, 300000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_kamar`
--

CREATE TABLE `tb_kamar` (
  `kode_kamar` varchar(10) NOT NULL,
  `lantai` varchar(10) NOT NULL,
  `no_kamar` varchar(5) NOT NULL,
  `tipe_kamar` varchar(15) NOT NULL,
  `harga_permalam` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_kamar`
--

INSERT INTO `tb_kamar` (`kode_kamar`, `lantai`, `no_kamar`, `tipe_kamar`, `harga_permalam`) VALUES
('2001', 'Lantai 2', '002', 'Kelas 2', 500000),
('2003', 'Lantai 2', '003', 'Kelas 3', 300000);

-- --------------------------------------------------------

--
-- Table structure for table `tb_karyawan`
--

CREATE TABLE `tb_karyawan` (
  `id_karyawan` varchar(20) NOT NULL,
  `nama_karyawan` varchar(30) NOT NULL,
  `jenis_kelamin` varchar(15) NOT NULL,
  `alamat` varchar(50) NOT NULL,
  `no_tlp` varchar(15) NOT NULL,
  `password` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_karyawan`
--

INSERT INTO `tb_karyawan` (`id_karyawan`, `nama_karyawan`, `jenis_kelamin`, `alamat`, `no_tlp`, `password`) VALUES
('21103098', 'Kenni Pratiwi', 'Perempuan', 'Banyumas', '083418364', '101010'),
('2215103004', 'Anastasya Bella', 'Perempuan', 'Jakarta Selatan', '081938173', '67890');

-- --------------------------------------------------------

--
-- Table structure for table `tb_pasien`
--

CREATE TABLE `tb_pasien` (
  `no_pasien` varchar(17) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `nama_pasien` varchar(30) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `jenis_kelamin` varchar(12) NOT NULL,
  `alamat` text NOT NULL,
  `no_tlp` varchar(15) NOT NULL,
  `kode_kamar` varchar(8) NOT NULL,
  `tgl_cek_in` varchar(10) NOT NULL,
  `jam_cek_in` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_admin`
--
ALTER TABLE `tb_admin`
  ADD PRIMARY KEY (`id_admin`);

--
-- Indexes for table `tb_history_pasien`
--
ALTER TABLE `tb_history_pasien`
  ADD KEY `no_tamu` (`no_pasien`),
  ADD KEY `kode_kamar` (`kode_kamar`);

--
-- Indexes for table `tb_kamar`
--
ALTER TABLE `tb_kamar`
  ADD PRIMARY KEY (`kode_kamar`);

--
-- Indexes for table `tb_karyawan`
--
ALTER TABLE `tb_karyawan`
  ADD PRIMARY KEY (`id_karyawan`);

--
-- Indexes for table `tb_pasien`
--
ALTER TABLE `tb_pasien`
  ADD PRIMARY KEY (`no_pasien`),
  ADD KEY `kode_kamar` (`kode_kamar`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tb_history_pasien`
--
ALTER TABLE `tb_history_pasien`
  ADD CONSTRAINT `tb_history_pasien_ibfk_1` FOREIGN KEY (`kode_kamar`) REFERENCES `tb_kamar` (`kode_kamar`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `tb_pasien`
--
ALTER TABLE `tb_pasien`
  ADD CONSTRAINT `tb_pasien_ibfk_1` FOREIGN KEY (`kode_kamar`) REFERENCES `tb_kamar` (`kode_kamar`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
