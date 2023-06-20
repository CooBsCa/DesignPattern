# Design Pattern  

![Alt text](images/image1.png)  

## Description des patterns :  
  
- nom
- description
- exemple de code sous forme de diargramme UML
- la structure standard (abstraite)
- exemple de code  

## Cas concret d'étude pour ce cours

Nous allons prende en exemple le cas d'une société qui vend des véhicules en ligne.  

## Première grande famille de design pattern : les patterns de construction  

le but est de faire des wrapper autour de classe concrète et favorisé l'usage d'interface

single tone -> une classe une instance


### Le pattern Abstract Factory
le but de ce pattern est de permettre de fabriquer des objets regroupes en "famille" sans avoir a connaitre les classes cibles destinée à la fabrication de ces objets.

![Alt text](images/image2.png) 

l'object cata prend en objet une instance de fabrique de Véhicule  


### Le pattern Builder 

Ce pattern permet d'abstraire la construction d'objets complexes de leur implementation de sorte qu'un client puisse creer des objets complexes sans avoir a se preocuper des differences d'implementation.

![Alt text](images/image3.png)