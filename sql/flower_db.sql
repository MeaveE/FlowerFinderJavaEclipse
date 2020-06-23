DROP TABLE `Flower`;

CREATE TABLE `Flower` (
  `idNumber` int(11) NOT NULL AUTO_INCREMENT,
  `Image` varchar(500),
  `flowerName` varchar(100) NOT NULL,
  `description` varchar(200) NOT NULL,
  `season` varchar(100) NOT NULL,
  `habitat` varchar(100) NOT NULL,
  `userNotes`varchar(100),
  `UserImage` blob,
  PRIMARY KEY  (`idNumber`)
  );
  
  insert  into `Flower`(`Image`,`flowerName`,`description`,`season`,`habitat`,`userNotes`) values ('https://images-na.ssl-images-amazon.com/images/I/715GnZOpkXL._SY355_.jpg','Oxeye Daisy','The daisy is small with white petals and a yellow center','May - September','Grassy Places',NULL),
  																									('https://www.first-nature.com/flowers/images/veronica-chamaedrys1.jpg','Germander Speedwell','Small blue and low lieing','Summer','gardens and lawns',NULL),
  																									('http://www.wildflowerfinder.org.uk/Flowers/P/Pimpernel(Scarlet)/Pimpernel(Scarlet)_2004_08_05_Cark_068.jpg','scarlet pimpernel','low-growing creeping stem, flower bright scarlet 12mm across','May - September','Farm, grassland, sand dunes',NULL),
  																									('https://dpdgay9x1sxad.cloudfront.net/wp-content/uploads/sites/13/2018/04/Greater-Willowherb-1-320x427.jpg','Great WillowHerb','200cm height, rose-pink petals,flower 25mm diameter', 'July - August', 'Damp places riverbanks, ditches',NULL)
