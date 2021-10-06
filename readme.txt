Test Back - FizzBuzz

Pour réaliser le test Back End, j'ai lu la doc de Spring Boot et j'ai compris 
que il s'agit d'un framework avec architecture MVC avec model, view et controller.

Dans ce cas, nous n'avons pas besoin d'un modele et d'une view, vu que le test s'agit
de créer une petite API avec renvoi de résultat en format JSON, et donc il n'y a pas besoin
d'une interface graphique, ni d'une communication avec la BDD.

Pour la premiere étape, j'ai utilisé Spring Initializer pour avoir la structure du projet and j'ai importé le starter "Spring Web" pour pouvoir créer mon API.

Ensuite, j'ai crée le package pour le controller "com.example.testBackEnd.controller" ou j'ai crée le controller
"IndexController.java" que contient deux méthodes principal: 

- Index, que affiche "Saisir un nombre a partir de 1". C'est du simple text que invite 
l'utilisateur a saisir un nombre dans l'URL.

- afficheFizzBuzz, ou le test à été realisé. Tout d'abord, avec @RequestMapping, on prévient
le framework que le path "/{nombre}", attend une valeur. 
La methode "afficheFizzBuzz" va etre déclanché a partir du moment l'utilisateur rajoute une valeur
numérique dans le path "/{nombre}". Cette methode, pour que je puisse retourner un JSON, est de type 
'Map'.

J'ai importé la collection "import java.util.Map" et instancié "json" dans la class
HashMap que permet de créer un object cléf => valuer et ensuite retourner le JSON.

La premiere condition c'est le cas d'erreur, c'est a dire si le nombre n'es pas égal ou superieur
a 1, la méthode renvoie un erreur "Saisir un nombre valide".

Sinon, une boucle est lancé et va de 1 jusq'au nombre saisi. 

Pour connaitre si un nombre est divisibile par 3 ou 5, j'ai utilisé la condition nombre % 0 == 0, et on comprends 
que le nombre est divisible par 3 ou 5 si le reste est 0.

Pour chaque nombre jusq'a celui saisi, si il est divisible par 3 et 5, la méthode renvoie "FizzBuzz" a coté du nombre, 
si est divisible par 3 alors il renvoie "Fizz" a coté du nombre,
si est dibisible par 5 alors il renvoie "Buzz" a coté du nombre
sinon il renvoie le nombre avec une chaine vide a coté du nombre. 


Pour realiser ce test, je me suis renseigné sur la DOC officielle (pour l'initialisation du projet), Google et StackOverFlow.
