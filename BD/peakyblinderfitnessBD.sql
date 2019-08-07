-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  mer. 07 août 2019 à 09:16
-- Version du serveur :  5.7.26
-- Version de PHP :  7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `peakyblinderfitness`
--
CREATE DATABASE IF NOT EXISTS `peakyblinderfitness` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `peakyblinderfitness`;

-- --------------------------------------------------------

--
-- Structure de la table `exercice`
--

DROP TABLE IF EXISTS `exercice`;
CREATE TABLE IF NOT EXISTS `exercice` (
  `idexercice` int(11) NOT NULL AUTO_INCREMENT,
  `typeexercice` varchar(45) NOT NULL,
  `tempsexercice` int(11) NOT NULL,
  `dateexercice` varchar(45) NOT NULL,
  `user_iduser` int(11) NOT NULL,
  PRIMARY KEY (`idexercice`),
  KEY `fk_exercice_user1_idx` (`user_iduser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `objectif`
--

DROP TABLE IF EXISTS `objectif`;
CREATE TABLE IF NOT EXISTS `objectif` (
  `idobjectif` int(11) NOT NULL AUTO_INCREMENT,
  `dateobjectif` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `typeobjectif` varchar(45) NOT NULL,
  `deltapoid` double NOT NULL,
  `user_iduser` int(11) NOT NULL,
  PRIMARY KEY (`idobjectif`),
  KEY `fk_objectif_user1_idx` (`user_iduser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `poid`
--

DROP TABLE IF EXISTS `poid`;
CREATE TABLE IF NOT EXISTS `poid` (
  `idpoid` int(11) NOT NULL AUTO_INCREMENT,
  `datepoid` date DEFAULT NULL,
  `user_iduser` int(11) NOT NULL,
  PRIMARY KEY (`idpoid`),
  KEY `fk_poid_user1_idx` (`user_iduser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `iduser` int(11) NOT NULL AUTO_INCREMENT,
  `nomuser` varchar(45) NOT NULL,
  `prenomuser` varchar(45) NOT NULL,
  `mdpuser` varchar(45) NOT NULL,
  `sexeuser` varchar(45) DEFAULT NULL,
  `poidiniuser` double NOT NULL,
  `tailleuser` int(11) DEFAULT NULL,
  `ageuser` int(11) DEFAULT NULL,
  `mailuser` varchar(45) NOT NULL,
  PRIMARY KEY (`iduser`),
  UNIQUE KEY `mailuser_UNIQUE` (`mailuser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `exercice`
--
ALTER TABLE `exercice`
  ADD CONSTRAINT `fk_exercice_user1` FOREIGN KEY (`user_iduser`) REFERENCES `user` (`iduser`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `objectif`
--
ALTER TABLE `objectif`
  ADD CONSTRAINT `fk_objectif_user1` FOREIGN KEY (`user_iduser`) REFERENCES `user` (`iduser`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `poid`
--
ALTER TABLE `poid`
  ADD CONSTRAINT `fk_poid_user1` FOREIGN KEY (`user_iduser`) REFERENCES `user` (`iduser`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
