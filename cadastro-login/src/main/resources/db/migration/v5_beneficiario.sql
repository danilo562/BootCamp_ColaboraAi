CREATE TABLE `projeto`.`beneficiario` (
  `idbeneficiario` INT NOT NULL AUTO_INCREMENT,
  `idcamp` INT NULL,
  `idusu` INT NULL,
  `obs` VARCHAR(200) NULL,
  `dtcad` DATETIME NULL,
  `delet` VARCHAR(1) NULL DEFAULT ' ',
  PRIMARY KEY (`idbeneficiario`));
