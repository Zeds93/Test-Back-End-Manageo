Test Back - FizzBuzz

Pour réaliser le test Back End, j'ai lu le doc de Spring Boot et j'ai compris qu'il s'agit d'un Framework avec architecture MVC avec modèle, view et controller.
Dans ce cas, nous n'avons pas besoin d'un modele et d'une view, vu que le test s'agit de créer une petite API en GET avec renvoi de résultat en format JSON, et donc il n'y a pas besoin d'une interface graphique, ni d'une communication avec la BDD.

Pour la première étape, j'ai utilisé Spring Initializer pour avoir la structure du projet and j'ai importé le starter "Spring Web" pour pouvoir créer mon API.
Ensuite, j'ai créé le package "com.example.testbackend.Controller" où j'ai créé le controller "Index Controller.java" que contiennent deux méthodes principales:

- Index, qu'affiche "Saisir un nombre à partir de 1". C'est du simple texte qu'invite l'utilisateur à saisir un nombre dans l'URL.


- AfficheFizzBuzz, ou le test à été réalisé. Tout d'abord, avec @RequestMapping, on prévient le Framework que le path "/{nombre}", attend un parametre. La méthode "affichefizzbuzz" va être déclenché à partir du moment l'utilisateur rajoute une valeur numérique dans le path "/{nombre}". Cette méthode, pour que je puisse retourner un JSON, est du type "Map' avec key INTEGER et value en String.

J'ai importé la collection "import java .util .Map" et instancié "json" dans la classe HashMap que permet de créer un objet clé => valuer et ensuite, retourner le JSON.

La première condition c'est le cas d'erreur, c’est-à-dire si le nombre n'est pas égal ou supérieur à 1, la méthode renvoie un messgae d'erreur "Saisir un nombre valide".
Sinon, une boucle est lancée et va de 1 jusq'au nombre saisi. 

Pour connaitre si un nombre est divisible par 3 ou 5, j'ai utilisé la condition nombre % 0 == 0, et on comprend que le nombre est divisible par 3 ou 5 si le reste est 0.

Pour chaque nombre jusq'a celui saisi, s'il est divisible par 3 et 5, la méthode renvoie "FizzBuzz" a côté du nombre, 
si est divisible par 3 alors il renvoie "Fizz" à côté du nombre, 
si est divisible par 5 alors il renvoie "Buzz" a côté du nombre 
sinon il renvoie le nombre avec une chaine vide a côté du nombre. 


Pour réaliser ce test, je me suis renseigné sur la DOC officielle (pour l'initialisation du projet), Google et StackOverFlow et j'ai suivi un tuto d'introduction a Spring Boot.
