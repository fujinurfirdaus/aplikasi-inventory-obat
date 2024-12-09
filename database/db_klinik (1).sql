-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 09, 2024 at 04:03 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_klinik`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_bagian`
--

CREATE TABLE `tb_bagian` (
  `kode_bagian` varchar(100) NOT NULL,
  `nama_bagian` varchar(250) NOT NULL,
  `nama_pimpinan` varchar(50) NOT NULL,
  `tanggal` date NOT NULL DEFAULT current_timestamp(),
  `telephone` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tb_bagian`
--

INSERT INTO `tb_bagian` (`kode_bagian`, `nama_bagian`, `nama_pimpinan`, `tanggal`, `telephone`) VALUES
('POLI2410002', 'Poli Paru', 'Eni Surahman, M.Pd', '2024-10-23', '0822151678987'),
('POLI2410003', 'gncf', 'cnc', '2024-10-29', '54'),
('POLI2410004', 'xcbxb', 'xcbxc', '2024-10-29', '4444');

-- --------------------------------------------------------

--
-- Table structure for table `tb_detail_keluar`
--

CREATE TABLE `tb_detail_keluar` (
  `id_obatKeluar` varchar(20) NOT NULL,
  `kode_obat` varchar(100) NOT NULL,
  `nama_obat` varchar(100) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_detail_keluar`
--

INSERT INTO `tb_detail_keluar` (`id_obatKeluar`, `kode_obat`, `nama_obat`, `jumlah`) VALUES
('OUT2410003', 'ABPCAP', 'AB Phylline Capsule', 11),
('OUT2410004', 'ACLLG', 'Alex Cough Lozenges Lemon Ginger', 1),
('OUT2410004', 'ACLLG', 'Alex Cough Lozenges Lemon Ginger', 1),
('OUT2410005', 'AC150T', 'Aciloc 150 Tablet', 60),
('OUT2410005', 'AC150T', 'Aciloc 150 Tablet', 3),
('OUT2410006', 'A100INH', 'Asthalin 100mcg Inhaler', 11),
('OUT2410007', 'A100INH', 'Asthalin 100mcg Inhaler', 20),
('OUT2410008', 'AC150T', 'Aciloc 150 Tablet', 1),
('OUT2410008', 'ACLLG', 'Alex Cough Lozenges Lemon Ginger', 3),
('OUT2410008', 'ACLPLT', 'Aceclo Plus Tablet', 1),
('OUT2410009', 'A625DT', 'Augmentin 625 Duo Tablet', 1),
('OUT2410010', 'A625DT', 'Augmentin 625 Duo Tablet', 5),
('OUT2410011', 'ABPCAP', 'AB Phylline Capsule', 1),
('OUT2410012', 'A180T', 'Allegra 180mg Tablet', 1),
('OUT2411001', 'ABPCAP', 'AB Phylline Capsule', 6),
('OUT2411001', 'ACLLG', 'Alex Cough Lozenges Lemon Ginger', 9),
('OUT2411002', 'ABPCAP', 'AB Phylline Capsule', 1),
('OUT2411003', 'A180T', 'Allegra 180mg Tablet', 1),
('OUT2411004', 'AC150T', 'Aciloc 150 Tablet', 1),
('OUT2411005', 'AL400T', 'Albendazole 400mg Tablet', 1),
('OUT2412001', 'ABPCAP', 'AB Phylline Capsule', 11);

-- --------------------------------------------------------

--
-- Table structure for table `tb_detail_pemesanan`
--

CREATE TABLE `tb_detail_pemesanan` (
  `id_pemesanan` varchar(20) NOT NULL,
  `kode_obat` varchar(100) NOT NULL,
  `nama_obat` varchar(100) NOT NULL,
  `jumlah` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_detail_pemesanan`
--

INSERT INTO `tb_detail_pemesanan` (`id_pemesanan`, `kode_obat`, `nama_obat`, `jumlah`) VALUES
('ORD2410001', 'ABPCAP', 'AB Phylline Capsule', 1),
('ORD2410001', 'AC150T', 'Aciloc 150 Tablet', 11),
('ORD2410001', 'ACLLG', 'Alex Cough Lozenges Lemon Ginger', 11),
('ORD2410001', 'ACPPLT', 'Acemiz Plus Tablet', 1),
('ORD2410002', 'ABPCAP', 'AB Phylline Capsule', 8),
('ORD2410002', 'AC150T', 'Aciloc 150 Tablet', 11),
('ORD2410002', 'ACLLG', 'Alex Cough Lozenges Lemon Ginger', 111),
('ORD2410003', 'AC150T', 'Aciloc 150 Tablet', 11),
('ORD2410004', 'AC150T', 'Aciloc 150 Tablet', 11),
('ORD2410005', 'AC150T', 'Aciloc 150 Tablet', 1),
('ORD2410006', 'AC150T', 'Aciloc 150 Tablet', 11),
('ORD2410006', 'ACLPLT', 'Aceclo Plus Tablet', 13),
('ORD2410006', 'AF253T', 'Anafortan 25 mg/300 mg Tablet', 22),
('ORD2410007', 'ABPCAP', 'AB Phylline Capsule', 7),
('ORD2410008', 'AC625T', 'Amoxyclav 625 Tablet', 66),
('ORD2410009', 'AC625T', 'Amoxyclav 625 Tablet', 55),
('ORD2410009', 'ACLLG', 'Alex Cough Lozenges Lemon Ginger', 666),
('ORD2410010', 'AC625T', 'Amoxyclav 625 Tablet', 11),
('ORD2410011', 'AC150T', 'Aciloc 150 Tablet', 6),
('ORD2412001', 'ABPCAP', 'AB Phylline Capsule', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tb_kategori`
--

CREATE TABLE `tb_kategori` (
  `kode_kategori` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `nama_kategori` varchar(250) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

--
-- Dumping data for table `tb_kategori`
--

INSERT INTO `tb_kategori` (`kode_kategori`, `nama_kategori`) VALUES
('ANM01\r\n', 'Anthelmintics\r\n'),
('ATB01\r\n', 'Antibiotics\r\n'),
('INF01\r\n', 'Antifungals\r\n'),
('AAH01\r\n', 'Antihistamines & Allergy\r\n'),
('ANT01\r\n', 'Antivirals\r\n'),
('ANX01\r\n', 'Anxiolytics\r\n'),
('CVS01\r\n', 'Cardiovascular\r\n'),
('CRS01\r\n', 'Cough & Respiratory Syrups\r\n'),
('DRM01\r\n', 'Dermatologicals\r\n'),
('DIA01\r\n', 'Diabetes\r\n'),
('GAS01\r\n', 'Gastrointestinal\r\n'),
('GEN01\r\n', 'General Medicines\r\n'),
('IMM02\r\n', 'Immunologicals\r\n'),
('IMM01\r\n', 'Immunosuppressants\r\n'),
('AAH02\r\n', 'Nasal Sprays\r\n'),
('PAI01\r\n', 'Pain & Inflammation\r\n'),
('CRS02\r\n', 'Respiratory Inhalers\r\n'),
('URN01\r\n', 'Urological\r\n'),
('VIT01\r\n', 'Vitamins & Supplements\r\n');

--
-- Triggers `tb_kategori`
--
DELIMITER $$
CREATE TRIGGER `updateNamaKategori` AFTER UPDATE ON `tb_kategori` FOR EACH ROW BEGIN
UPDATE tb_obat SET `nama_kategori`= new.nama_kategori WHERE `kode_kategori`= new.kode_kategori;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `tb_obat`
--

CREATE TABLE `tb_obat` (
  `tanggal` date NOT NULL,
  `kode_obat` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `nama_obat` varchar(250) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `kode_kategori` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `nama_kategori` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `jumlah` int(11) NOT NULL,
  `satuan` varchar(10) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `keterangan` varchar(500) CHARACTER SET latin1 COLLATE latin1_swedish_ci DEFAULT NULL,
  `tglexp` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_520_ci;

--
-- Dumping data for table `tb_obat`
--

INSERT INTO `tb_obat` (`tanggal`, `kode_obat`, `nama_obat`, `kode_kategori`, `nama_kategori`, `jumlah`, `satuan`, `keterangan`, `tglexp`) VALUES
('2024-05-21', 'A100INH', 'Asthalin 100mcg Inhaler', 'CRS02\r ', 'Respiratory Inhalers\r ', 30, 'Inhaler (m', 'Inhaler bronkodilator yang mengandung salbutamol, digunakan untuk meredakan gejala asma.\r\n', '2024-10-31'),
('2024-05-21', 'A120T', 'Allegra 120mg Tablet', 'AAH01\r\n', 'Antihistamines & Allergy\r\n', 100, 'Tablet', 'Tablet antihistamin yang mengandung fexofenadine, digunakan untuk mengatasi alergi.\r\n', '2026-03-10'),
('2024-05-21', 'A180T', 'Allegra 180mg Tablet', 'AAH01\r\n', 'Antihistamines & Allergy\r\n', 89, 'Tablet', 'Tablet antihistamin yang mengandung fexofenadine, digunakan untuk mengatasi alergi.\r\n', '2026-03-10'),
('2024-05-21', 'A625DT', 'Augmentin 625 Duo Tablet', 'ATB01\r\n', 'Antibiotics\r\n', 10, 'Tablet', 'Tablet antibiotik kombinasi yang mengandung amoksisilin dan asam klavulanat. Dikonsumsi melalui mulut.\r\n', '2026-03-10'),
('2024-05-21', 'ABPCAP', 'AB Phylline Capsule', 'CRS02\r\n', 'Respiratory Inhalers\r\n', 57, 'Capsule', 'Kapsul bronkodilator yang mengandung acephylline, digunakan untuk mengobati penyakit pernapasan.\r\n', '2024-11-10'),
('2024-05-21', 'AC150T', 'Aciloc 150 Tablet', 'GAS01\r\n', 'Gastrointestinal\r\n', 61, 'Tablet', 'Tablet antagonis reseptor H2 yang mengandung ranitidine, digunakan untuk mengurangi produksi asam lambung.\r\n', '2025-12-10'),
('2024-05-21', 'AC625T', 'Amoxyclav 625 Tablet', 'ATB01\r\n', 'Antibiotics\r\n', 89, 'Tablet', 'Tablet antibiotik kombinasi yang mengandung amoksisilin dan asam klavulanat, digunakan untuk infeksi bakteri.\r\n', '2025-12-10'),
('2024-05-21', 'ACLLG', 'Alex Cough Lozenges Lemon Ginger', 'CRS01\r\n', 'Cough & Respiratory Syrups\r\n', 78, 'Lozenge', 'Permen hisap batuk yang mengandung guaifenesin, digunakan untuk meredakan batuk.\r\n', '2025-12-10'),
('2024-05-21', 'ACLPLT', 'Aceclo Plus Tablet', 'PAI01\r\n', 'Pain & Inflammation\r\n', 68, 'Tablet', 'Tablet kombinasi analgesik yang mengandung paracetamol dan aceclofenac, digunakan untuk mengurangi rasa sakit dan peradangan.\r\n', '2025-12-10'),
('2024-05-21', 'ACPPLT', 'Acemiz Plus Tablet', 'PAI01\r\n', 'Pain & Inflammation\r\n', 89, 'Tablet', 'Tablet kombinasi analgesik yang mengandung paracetamol dan aceclofenac, digunakan untuk mengurangi rasa sakit dan peradangan.\r\n', '2025-12-10'),
('2024-05-21', 'ACR20T', 'Aciloc RD 20 Tablet', 'GAS01\r\n', 'Gastrointestinal\r\n', 40, 'Tablet', 'Tablet liberasi terkontrol yang mengandung ranitidine, digunakan untuk mengurangi produksi asam lambung.\r\n', '2025-12-10'),
('2024-05-21', 'ADDSPN', 'Augmentin DDS Suspension', 'ATB01\r\n', 'Antibiotics\r\n', 37, 'Suspension', 'Suspensi antibiotik kombinasi yang mengandung amoksisilin dan asam klavulanat.\r\n', '2025-12-10'),
('2024-05-21', 'ADOSPN', 'Augmentin Duo Oral Suspension', 'ATB01\r\n', 'Antibiotics\r\n', 79, 'Suspension', 'Suspensi oral antibiotik kombinasi yang mengandung amoksisilin dan asam klavulanat.\r\n', '2025-12-10'),
('2024-05-21', 'ADP100T', 'Aldigesic P 100mg/325mg Tablet', 'PAI01\r\n', 'Pain & Inflammation\r\n', 5, 'Tablet', 'Tablet kombinasi analgesik yang mengandung paracetamol dan ibuprofen, digunakan untuk mengurangi rasa sakit dan peradangan.\r\n', '2026-09-10'),
('2024-05-21', 'ADPSF', 'Ascoril D Plus Syrup Sugar Free', 'CRS01\r\n', 'Cough & Respiratory Syrups\r\n', 25, 'Syrup (ml)', 'Sirup batuk yang mengandung dextromethorphan, guaifenesin, phenylephrine, dan chlorpheniramine. Bebas gula.\r\n', '2025-12-10'),
('2024-05-21', 'ADSPT', 'Aldigesic-SP Tablet', 'PAI01\r\n', 'Pain & Inflammation\r\n', 90, 'Tablet', 'Tablet kombinasi analgesik yang mengandung paracetamol, diclofenac, dan serratiopeptidase, digunakan untuk mengurangi rasa sakit dan peradangan.\r\n', '2025-12-10'),
('2024-05-21', 'ADXSF', 'Asthakind-DX Syrup Sugar Free', 'CRS01\r\n', 'Cough & Respiratory Syrups\r\n', 80, 'Syrup (ml)', 'Sirup batuk ekspektoran dan bronkodilator yang mengandung dextromethorphan, terbutaline, dan bromhexine. Bebas gula.\r\n', '2025-12-10'),
('2024-05-21', 'AESF', 'Asthakind Expectorant Sugar Free', 'CRS01\r\n', 'Cough & Respiratory Syrups\r\n', 80, 'Expectoran', 'Ekspektoran bebas gula yang mengandung bromhexine, guaifenesin, dan terbutaline, digunakan untuk meredakan batuk.\r\n', '2025-10-10'),
('2024-05-21', 'AF10PR', 'Alfoo 10mg Tablet PR', 'URN01\r\n', 'Urological\r\n', 71, 'Tablet', 'Tablet modifikasi pelepasan yang mengandung alfuzosin, digunakan untuk mengobati gejala pembesaran prostat jinak.\r\n', '2026-03-10'),
('2024-05-21', 'AF253T', 'Anafortan 25 mg/300 mg Tablet', 'GAS01\r ', 'Gastrointestinal\r ', 55, 'Tablet', 'Tablet kombinasi yang mengandung dicyclomine dan paracetamol, digunakan untuk mengobati kram perut dan nyeri.\r\n', '2024-11-06'),
('2024-05-21', 'AKOSOL', 'Alkasol Oral Solution', 'GEN01\r\n', 'General Medicines\r\n', 46, 'Solution (', 'Cairan oral yang mengandung disodium hydrogen citrate, digunakan untuk mengobati infeksi saluran kemih dan masalah lainnya.\r\n', '2026-03-10'),
('2024-05-21', 'AKTBL', 'Arkamin Tablet', 'CVS01\r\n', 'Cardiovascular\r\n', 5, 'Tablet', 'Tablet agonis alpha-2 adrenergik yang mengandung clonidine, digunakan untuk mengobati hipertensi.\r\n', '2026-03-10'),
('2024-05-21', 'AL400T', 'Albendazole 400mg Tablet', 'ANM01\r\n', 'Anthelmintics\r\n', 75, 'Tablet', 'Tablet antelmintik yang digunakan untuk mengatasi infeksi cacing.\r\n', '2026-09-10'),
('2024-05-21', 'ALCFSF', 'Asthakind-LS Expectorant Cola Sugar Free', 'CRS01\r\n', 'Cough & Respiratory Syrups\r\n', 90, 'Expectoran', 'Ekspektoran batuk bebas gula yang mengandung bromhexine, guaifenesin, dan terbutaline, dengan rasa cola.\r\n', '2026-03-10'),
('2024-05-21', 'ALDTBL', 'Aldactone Tablet', 'CVS01\r\n', 'Cardiovascular\r\n', 97, 'Tablet', 'Tablet antagonis aldosteron yang mengandung spironolactone, digunakan untuk mengobati tekanan darah tinggi dan kondisi lainnya.\r\n', '2026-03-10'),
('2024-05-21', 'ALJRS', 'Alex Junior Syrup', 'CRS01\r\n', 'Cough & Respiratory Syrups\r\n', 68, 'Syrup (ml)', 'Sirup batuk ekspektoran dan bronkodilator yang dikhususkan untuk anak-anak, mengandung guaifenesin, terbutaline, dan bromhexine.\r\n', '2026-03-10'),
('2024-05-21', 'ALM500C', 'Almox 500 Capsule', 'ATB01\r\n', 'Antibiotics\r\n', 79, 'Capsule', 'Kapsul antibiotik yang mengandung amoksisilin, digunakan untuk mengobati infeksi bakteri.\r\n', '2026-09-10'),
('2024-05-21', 'ALMGT', 'Allegra-M Tablet', 'AAH01\r\n', 'Antihistamines & Allergy\r\n', 18, 'Tablet', 'Tablet antihistamin yang mengandung fexofenadine dan montelukast, digunakan untuk alergi.\r\n', '2026-03-10'),
('2024-05-21', 'ALP25T', 'Alprax 0.25 Tablet', 'ANX01\r\n', 'Anxiolytics\r\n', 64, 'Tablet', 'Tablet anksiolitik yang mengandung alprazolam, digunakan untuk mengobati kecemasan dan gangguan kecemasan lainnya.\r\n', '2026-03-10'),
('2024-05-21', 'ALP50T', 'Alprax 0.5mg Tablet', 'ANX01\r\n', 'Anxiolytics\r\n', 37, 'Tablet', 'Tablet anksiolitik yang mengandung alprazolam, digunakan untuk mengobati kecemasan dan gangguan kecemasan lainnya.\r\n', '2026-03-10'),
('2024-05-21', 'ALSDP', 'Ascoril LS Drops', 'CRS01\r\n', 'Cough & Respiratory Syrups\r\n', 85, 'Drops (ml)', 'Tetes batuk ekspektoran dan bronkodilator yang mengandung guaifenesin, terbutaline, dan bromhexine.\r\n', '2026-03-10'),
('2024-05-21', 'ALSJS', 'Ascoril LS Junior Syrup', 'CRS01\r\n', 'Cough & Respiratory Syrups\r\n', 46, 'Syrup (ml)', 'Sirup batuk ekspektoran dan bronkodilator yang mengandung guaifenesin, terbutaline, dan bromhexine, disesuaikan untuk anak-anak.\r\n', '2026-03-10'),
('2024-05-21', 'ALSYR', 'Ascoril LS Syrup', 'CRS01\r\n', 'Cough & Respiratory Syrups\r\n', 34, 'Syrup (ml)', 'Sirup batuk ekspektoran dan bronkodilator yang mengandung guaifenesin, terbutalin, dan bromhexine.\r\n', '2026-03-10'),
('2024-05-21', 'ALT500T', 'Althrocin 500 Tablet', 'ATB01\r\n', 'Antibiotics\r\n', 50, 'Tablet', 'Tablet antibiotik makrolida yang mengandung erythromycin, digunakan untuk mengobati infeksi bakteri.\r\n', '2026-09-10'),
('0000-00-00', 'ALXSYR\r\n', 'Alex Syrup\r\n', 'CRS01\r\n', 'Cough & Respiratory Syrups', 76, 'Syrup (ml)', 'Sirup batuk ekspektoran dan bronkodilator yang mengandung guaifenesin, terbutaline, dan bromhexine.\r\n', '2026-03-10'),
('2024-05-21', 'ALXSYR', 'Alex Syrup', 'CRS01\r\n', 'Cough & Respiratory Syrups\r\n', 76, 'Syrup (ml)', 'Sirup batuk ekspektoran dan bronkodilator yang mengandung guaifenesin, terbutaline, dan bromhexine.\r\n', '2026-03-10'),
('2024-05-21', 'AMKAT', 'Amlokind-AT Tablet', 'CVS01\r\n', 'Cardiovascular\r\n', 46, 'Tablet', 'Tablet antihypertensi yang mengandung amlodipine dan atenolol, digunakan untuk mengatasi tekanan darah tinggi.\r\n', '2026-03-10'),
('2024-05-21', 'AMSYR', 'Ambrodil-S Syrup', 'CRS01\r\n', 'Cough & Respiratory Syrups\r\n', 5, 'Syrup (ml)', 'Sirup batuk ekspektoran dan bronkodilator yang mengandung terbutaline, bromhexine, dan guaifenesin.\r\n', '2026-03-10'),
('2024-05-21', 'AMX500C', 'Amoxycillin 500mg Capsule', 'ATB01\r\n', 'Antibiotics\r\n', 41, 'Capsule', 'Kapsul antibiotik yang mengandung amoksisilin, digunakan untuk mengobati infeksi bakteri.\r\n', '2026-09-10'),
('2024-05-21', 'AMXHT', 'Amixide-H Tablet', 'ANX01\r\n', 'Anxiolytics\r\n', 26, 'Tablet', 'Tablet kombinasi antidepresan yang mengandung amitriptyline dan chlordiazepoxide, digunakan untuk mengobati depresi.\r\n', '2026-03-10'),
('2024-05-21', 'ANBCRM', 'Anobliss Cream', 'DRM01\r\n', 'Dermatologicals\r\n', 82, 'Cream (g)', 'Krim topikal yang mengandung lidocaine, hydrocortisone, dan allantoin, digunakan untuk mengobati masalah kulit seperti gatal-gatal dan iritasi.\r\n', '2026-03-10'),
('2024-05-21', 'ANVCRM', 'Anovate Cream', 'DRM01\r\n', 'Dermatologicals\r\n', 82, 'Cream (g)', 'Krim topikal yang mengandung beclomethasone, lidocaine, dan gentamicin, digunakan untuk mengobati masalah kulit.\r\n', '2026-03-10'),
('2024-05-21', 'AR6LJ', 'Arachitol 6L Injection', 'VIT01\r\n', 'Vitamins & Supplements\r\n', 6, 'Injection ', 'Suntikan vitamin D yang digunakan untuk mengobati defisiensi vitamin D.\r\n', '2026-03-10'),
('2024-05-21', 'ASRPL', 'Asthalin Respules', 'CRS02\r\n', 'Respiratory Inhalers\r\n', 92, 'Respule', 'Respule bronkodilator yang mengandung salbutamol, digunakan untuk meredakan gejala asma dan penyakit paru obstruktif kronis.\r\n', '2026-03-10'),
('2024-05-21', 'ASRV', 'Allegra Suspension Raspberry & Vanilla', 'AAH01\r\n', 'Antihistamines & Allergy\r\n', 52, 'Suspension', 'Suspensi antihistamin yang mengandung fexofenadine, digunakan untuk mengatasi alergi.\r\n', '2026-03-10'),
('2024-05-21', 'ASSYR', 'Asthalin Syrup', 'CRS01\r\n', 'Cough & Respiratory Syrups\r\n', 16, 'Syrup (ml)', 'Sirup bronkodilator yang mengandung salbutamol, digunakan untuk mengatasi gejala asma dan penyakit paru obstruktif kronis.\r\n', '2026-03-10'),
('2024-05-21', 'AT10T', 'Atarax 10mg Tablet', 'AAH01\r\n', 'Antihistamines & Allergy\r\n', 23, 'Tablet', 'Tablet antihistamin dan anksiolitik yang mengandung hydroxyzine, digunakan untuk mengatasi kecemasan dan alergi.\r\n', '2026-03-10'),
('2024-05-21', 'AT1MT', 'Ativan 1mg Tablet', 'ANX01\r\n', 'Anxiolytics\r\n', 42, 'Tablet', 'Tablet anksiolitik yang mengandung lorazepam, digunakan untuk mengobati kecemasan dan gangguan kecemasan lainnya.\r\n', '2026-03-10'),
('2024-05-21', 'AT25T', 'Atarax 25mg Tablet', 'AAH01\r\n', 'Antihistamines & Allergy\r\n', 16, 'Tablet', 'Tablet antihistamin dan anksiolitik yang mengandung hydroxyzine, digunakan untuk mengatasi kecemasan dan alergi.\r\n', '2026-03-10'),
('2024-05-21', 'AT2MT', 'Ativan 2mg Tablet', 'ANX01\r\n', 'Anxiolytics\r\n', 51, 'Tablet', 'Tablet anksiolitik yang mengandung lorazepam, digunakan untuk mengobati kecemasan dan gangguan kecemasan lainnya.\r\n', '2026-03-10'),
('2024-05-21', 'ATCSR', 'Altraday Capsule SR', 'PAI01\r\n', 'Pain & Inflammation\r\n', 28, 'Capsule', 'Kapsul retard yang mengandung paracetamol, chlorpheniramine, dan phenylephrine, digunakan untuk meredakan demam, nyeri, dan gejala pilek.\r\n', '2026-03-10'),
('2024-05-21', 'ATOTBL', 'Atorva Tablet', 'CVS01\r\n', 'Cardiovascular\r\n', 98, 'Tablet', 'Tablet statin yang mengandung atorvastatin, digunakan untuk mengurangi kadar kolesterol.\r\n', '2026-03-10'),
('2024-05-21', 'ATSYR', 'Atarax Syrup', 'AAH01\r\n', 'Antihistamines & Allergy\r\n', 67, 'Syrup (ml)', 'Sirup antihistamin dan anksiolitik yang mengandung hydroxyzine, digunakan untuk mengatasi kecemasan dan alergi.\r\n', '2026-03-10'),
('2024-05-21', 'AV25T', 'Avil 25 Tablet', 'AAH01\r\n', 'Antihistamines & Allergy\r\n', 92, 'Tablet', 'Tablet antihistamin generasi pertama yang mengandung pheniramine, digunakan untuk alergi dan gatal-gatal.\r\n', '2026-03-10'),
('2024-05-21', 'AVINJ', 'Avil Injection', 'AAH01\r\n', 'Antihistamines & Allergy\r\n', 20, 'Injection ', 'Suntikan antihistamin generasi pertama yang mengandung pheniramine, digunakan untuk alergi dan gatal-gatal.\r\n', '2026-03-10'),
('2024-05-21', 'AVTBL', 'Avomine Tablet', 'AAH01\r\n', 'Antihistamines & Allergy\r\n', 86, 'Tablet', 'Tablet antihistamin yang mengandung promethazine, digunakan untuk mencegah mabuk perjalanan.\r\n', '2026-03-10'),
('2024-05-21', 'AX90T', 'Axcer 90mg Tablet', 'CVS01\r\n', 'Cardiovascular\r\n', 1, 'Tablet', 'Tablet antikoagulan yang mengandung aspirin, digunakan untuk mencegah pembekuan darah.\r\n', '2026-03-10'),
('2024-05-21', 'AZ200DS', 'Azee 200mg Dry Syrup', 'ATB01\r\n', 'Antibiotics\r\n', 86, 'Dry Syrup ', 'Serbuk kering antibiotik azalide yang mengandung azithromycin, digunakan untuk infeksi bakteri.\r\n', '2026-09-10'),
('2024-05-21', 'AZ200L', 'Azithral 200 Liquid', 'ATB01\r\n', 'Antibiotics\r\n', 6, 'Liquid (ml', 'Cairan antibiotik azalide yang mengandung azithromycin, digunakan untuk infeksi bakteri.\r\n', '2026-09-10'),
('2024-05-21', 'AZ500T', 'Azithral 500 Tablet', 'ATB01\r\n', 'Antibiotics', 91, 'Tablet', 'Tablet antibiotik azalide yang digunakan untuk mengobati infeksi bakteri.\r\n', '2026-09-10'),
('2024-05-21', 'AZ500T2', 'Azee 500 Tablet', 'ATB01\r\n', 'Antibiotics\r\n', 93, 'Tablet', 'Tablet antibiotik azalide yang mengandung azithromycin, digunakan untuk infeksi bakteri.\r\n', '2026-09-10'),
('2024-05-21', 'AZC500T', 'Azicip 500 Tablet', 'ATB01\r\n', 'Antibiotics\r\n', 57, 'Tablet', 'Tablet antibiotik azalide yang mengandung azithromycin, digunakan untuk infeksi bakteri.\r\n', '2026-09-10'),
('2024-05-21', 'AZM50T', 'Azmarda 50mg Tablet', 'CVS01\r\n', 'Cardiovascular\r\n', 40, 'Tablet', 'Tablet antikoagulan yang mengandung aspirin, digunakan untuk mencegah pembekuan darah.\r\n', '2026-03-10');

-- --------------------------------------------------------

--
-- Table structure for table `tb_obatkeluar`
--

CREATE TABLE `tb_obatkeluar` (
  `id_obatKeluar` varchar(20) NOT NULL,
  `tanggal` date NOT NULL DEFAULT current_timestamp(),
  `kode_bagian` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `nama_bagian` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_obatkeluar`
--

INSERT INTO `tb_obatkeluar` (`id_obatKeluar`, `tanggal`, `kode_bagian`, `nama_bagian`) VALUES
('OUT2410001', '2024-10-29', 'POLI2410002', 'Poli Paru'),
('OUT2410002', '2024-10-29', 'POLI2410002', 'Poli Paru'),
('OUT2410003', '2024-10-29', 'POLI2410002', 'Poli Paru'),
('OUT2410004', '2024-10-29', 'POLI2410004', 'xcbxb'),
('OUT2410005', '2024-10-29', 'POLI2410003', 'gncf'),
('OUT2410006', '2024-10-29', 'POLI2410002', 'Poli Paru'),
('OUT2410007', '2024-10-29', 'POLI2410002', 'Poli Paru'),
('OUT2410008', '2024-10-29', 'POLI2410004', 'xcbxb'),
('OUT2410009', '2024-10-29', 'POLI2410003', 'gncf'),
('OUT2410010', '2024-10-29', 'POLI2410003', 'gncf'),
('OUT2410011', '2024-10-29', 'POLI2410003', 'gncf'),
('OUT2410012', '2024-10-29', 'POLI2410004', 'xcbxb'),
('OUT2411001', '2024-11-07', 'POLI2410002', 'Poli Paru'),
('OUT2411002', '2024-11-08', 'POLI2410004', 'xcbxb'),
('OUT2411003', '2024-11-08', 'POLI2410004', 'xcbxb'),
('OUT2411004', '2024-11-08', 'POLI2410003', 'gncf'),
('OUT2411005', '2024-11-08', 'POLI2410003', 'gncf'),
('OUT2412001', '2024-12-09', 'POLI2410003', 'gncf');

-- --------------------------------------------------------

--
-- Table structure for table `tb_obat_masuk`
--

CREATE TABLE `tb_obat_masuk` (
  `tanggal` varchar(100) NOT NULL,
  `id_obatMasuk` varchar(100) NOT NULL,
  `kode_obat` varchar(100) NOT NULL,
  `nama_obat` varchar(100) NOT NULL,
  `supplier` varchar(250) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `tglExp` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tb_obat_masuk`
--

INSERT INTO `tb_obat_masuk` (`tanggal`, `id_obatMasuk`, `kode_obat`, `nama_obat`, `supplier`, `jumlah`, `tglExp`) VALUES
('2024-12-09', 'IN2411002', 'A100INH', 'Asthalin 100mcg Inhaler', 'PT. Pharmalab', 11, '0002-11-30'),
('2024-12-09', 'IN2412001', 'A625DT', 'Augmentin 625 Duo Tablet', 'PT. Farma Jaya\r ', 1, '2024-12-09'),
('2024-12-09', 'IN2412002', 'A120T', 'Allegra 120mg Tablet', 'CV. Medline\r ', 1, '2024-12-09');

--
-- Triggers `tb_obat_masuk`
--
DELIMITER $$
CREATE TRIGGER `nambahinstokObat` AFTER INSERT ON `tb_obat_masuk` FOR EACH ROW BEGIN
UPDATE tb_obat SET `jumlah`= jumlah + new.jumlah WHERE `kode_obat`= new.kode_obat;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `nguranginStokObat` AFTER DELETE ON `tb_obat_masuk` FOR EACH ROW BEGIN
UPDATE tb_obat SET `jumlah`= jumlah - OLD.jumlah WHERE `kode_obat`= OLD.kode_obat;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `tb_pemesanan`
--

CREATE TABLE `tb_pemesanan` (
  `id_pemesanan` varchar(20) NOT NULL,
  `tanggal` date NOT NULL,
  `kode_supplier` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `nama_supplier` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tb_pemesanan`
--

INSERT INTO `tb_pemesanan` (`id_pemesanan`, `tanggal`, `kode_supplier`, `nama_supplier`) VALUES
('ORD2410001', '2024-10-28', 'SUP2410001', ''),
('ORD2410002', '2024-10-28', 'SUP2410001', ''),
('ORD2410003', '2024-10-28', 'SUP2410001', ''),
('ORD2410004', '2024-10-29', 'SUP2410003', ''),
('ORD2410005', '2024-10-29', 'SUP2410004', ''),
('ORD2410006', '2024-10-29', 'SUP2410004', 'UD. Farmasi Sejahtera\r '),
('ORD2410007', '2024-10-29', 'SUP2410002', 'PT. Pharmalab'),
('ORD2410008', '2024-10-29', 'SUP2410002', 'PT. Pharmalab'),
('ORD2410009', '2024-10-29', 'SUP2410006', 'CV. Pharma Bersama\r '),
('ORD2410010', '2024-10-29', 'SUP2410003', 'CV. Medline\r '),
('ORD2410011', '2024-10-29', 'SUP2410002', 'PT. Pharmalab'),
('ORD2412001', '2024-12-09', 'SUP2410004', 'UD. Farmasi Sejahtera\r ');

-- --------------------------------------------------------

--
-- Table structure for table `tb_sementara_keluar`
--

CREATE TABLE `tb_sementara_keluar` (
  `kode_obat` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `nama_obat` varchar(100) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `satuan` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tb_sementara_pesan`
--

CREATE TABLE `tb_sementara_pesan` (
  `kode_obat` varchar(100) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `nama_obat` varchar(100) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `satuan` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tb_supplier`
--

CREATE TABLE `tb_supplier` (
  `tanggal` date NOT NULL,
  `kode_supplier` varchar(100) NOT NULL,
  `nama_supplier` varchar(250) NOT NULL,
  `notelpon_supplier` varchar(20) NOT NULL,
  `alamat_supplier` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tb_supplier`
--

INSERT INTO `tb_supplier` (`tanggal`, `kode_supplier`, `nama_supplier`, `notelpon_supplier`, `alamat_supplier`) VALUES
('2024-10-11', 'SUP2410001', 'ssss', '211', 'ss'),
('2016-11-02', 'SUP2410002', 'PT. Pharmalab', '0812-3456-7890', 'Jl. Industri No. 123, Jakarta'),
('2002-11-02', 'SUP2410003', 'CV. Medline\r ', '0856-7890-1234', 'Jl. Kesehatan No. 45, Surabaya\r\n'),
('2009-11-02', 'SUP2410004', 'UD. Farmasi Sejahtera\r ', '0821-2345-6789', 'Jl. Sehat No. 67, Bandung\r\n'),
('2030-11-02', 'SUP2410005', 'PT. Farma Jaya\r ', '0899-5678-1234', 'Jl. Terang No. 89, Yogyakarta\r\n'),
('2006-11-02', 'SUP2410006', 'CV. Pharma Bersama\r ', '0813-4567-8901', 'Jl. Bersama No. 12, Semarang\r\n'),
('2030-11-02', 'SUP2410007', 'UD. Sentosa\r ', '0857-8901-2345', 'Jl. Makmur No. 34, Medan\r\n'),
('2005-11-02', 'SUP2410008', 'PT. Sehat Mulia\r ', '0896-1234-5678', 'Jl. Bahagia No. 56, Palembang\r\n'),
('2004-07-02', 'SUP2410009', 'CV. Pharma Sukses\r ', '0822-3456-7890', 'Jl. Sukses No. 78, Makassar\r\n'),
('2002-11-02', 'SUP2410010', 'UD. Terang Jaya\r ', '0878-9012-3456', 'Jl. Jaya No. 90, Malang\r\n');

-- --------------------------------------------------------

--
-- Table structure for table `tb_user`
--

CREATE TABLE `tb_user` (
  `id_user` int(11) NOT NULL,
  `NIK` varchar(100) NOT NULL,
  `Nama` varchar(100) NOT NULL,
  `username` varchar(100) NOT NULL,
  `password` varchar(250) NOT NULL,
  `userLevel` enum('admin','staff','','') NOT NULL DEFAULT 'staff'
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `tb_user`
--

INSERT INTO `tb_user` (`id_user`, `NIK`, `Nama`, `username`, `password`, `userLevel`) VALUES
(2, '202143500345', 'FUJI NURFIRDAUS', 'FUJI', '123', 'admin'),
(3, '202143500389', 'Pajar', 'pajar', '123', 'admin'),
(4, '202143500377', 'Reza Aldiansyah', 'Reza', '123', 'admin'),
(5, '202143502806', 'Nur Khofifah', 'fifah', '123', 'admin'),
(6, '202143502808', 'Ahmad Dimyati', 'adim', '123', 'admin'),
(7, '202143500409', 'Agum', 'agum', '123', 'admin'),
(8, '2021454545', 'admin', 'admin', '123', 'admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_bagian`
--
ALTER TABLE `tb_bagian`
  ADD PRIMARY KEY (`kode_bagian`);

--
-- Indexes for table `tb_detail_keluar`
--
ALTER TABLE `tb_detail_keluar`
  ADD KEY `id_obatKeluar` (`id_obatKeluar`);

--
-- Indexes for table `tb_detail_pemesanan`
--
ALTER TABLE `tb_detail_pemesanan`
  ADD KEY `id_pemesanan` (`id_pemesanan`);

--
-- Indexes for table `tb_kategori`
--
ALTER TABLE `tb_kategori`
  ADD PRIMARY KEY (`kode_kategori`),
  ADD KEY `nama_kategori` (`nama_kategori`);

--
-- Indexes for table `tb_obat`
--
ALTER TABLE `tb_obat`
  ADD PRIMARY KEY (`kode_obat`),
  ADD KEY `kode_kategori` (`kode_kategori`),
  ADD KEY `nama_kategori` (`nama_kategori`),
  ADD KEY `jumlah` (`jumlah`);

--
-- Indexes for table `tb_obatkeluar`
--
ALTER TABLE `tb_obatkeluar`
  ADD PRIMARY KEY (`id_obatKeluar`),
  ADD KEY `kode_bagian` (`kode_bagian`);

--
-- Indexes for table `tb_obat_masuk`
--
ALTER TABLE `tb_obat_masuk`
  ADD PRIMARY KEY (`id_obatMasuk`),
  ADD KEY `kode_obat` (`kode_obat`);

--
-- Indexes for table `tb_pemesanan`
--
ALTER TABLE `tb_pemesanan`
  ADD PRIMARY KEY (`id_pemesanan`),
  ADD KEY `tb_pemesanan_ibfk_1` (`kode_supplier`);

--
-- Indexes for table `tb_sementara_keluar`
--
ALTER TABLE `tb_sementara_keluar`
  ADD KEY `kode_obat` (`kode_obat`);

--
-- Indexes for table `tb_sementara_pesan`
--
ALTER TABLE `tb_sementara_pesan`
  ADD UNIQUE KEY `unique_kode_obat` (`kode_obat`);

--
-- Indexes for table `tb_supplier`
--
ALTER TABLE `tb_supplier`
  ADD PRIMARY KEY (`kode_supplier`);

--
-- Indexes for table `tb_user`
--
ALTER TABLE `tb_user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_user`
--
ALTER TABLE `tb_user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tb_detail_keluar`
--
ALTER TABLE `tb_detail_keluar`
  ADD CONSTRAINT `tb_detail_keluar_ibfk_1` FOREIGN KEY (`id_obatKeluar`) REFERENCES `tb_obatkeluar` (`id_obatKeluar`);

--
-- Constraints for table `tb_detail_pemesanan`
--
ALTER TABLE `tb_detail_pemesanan`
  ADD CONSTRAINT `tb_detail_pemesanan_ibfk_1` FOREIGN KEY (`id_pemesanan`) REFERENCES `tb_pemesanan` (`id_pemesanan`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
