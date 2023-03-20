
# Apuntes Compu Movil
## Intro al Curso
La computación móvil consiste en el uso de un computador mientras se está en movimiento
Estos dispositivos oseen potencia similar a la de computadores tradicionales, pero tienen conectividad en cualquier parte en cualquier momento, permitiendo movilidad y nuevos tipos de servicios y aplicaciones.
## Intro a Android
Tipos de desarrollo móvil:
### Web
Significa que se muestre a través de un navegador web
Es fácil su implementación y su accesibilidad en cualquier dispositivo, pero no puede usar todas las herramientas que tiene el dispositivo, adicional mente la dependencia a la conexión a internet y es mas normal el uso de apps específicas que en el navegador
### Hybrid
Se realiza el desarrollo web, y se genera una copia para Android
Método fácil y ayuda a acercarse a el desarrollo para los teléfonos, pero presenta problemas de usabilidad en algunos dispositivos.
### Nativo
Construir las aplicaciones para el mismo sistema operativo.
Accede a las herramientas del dispositivo, mejor interfaz y accesibilidad online y offline. Pero se debe hacer una implementación distinta para cada plataforma, y los desarrolladores son costosos.
### Nativo Multiplataforma
Con esta opción se pueden crear aplicaciones para tanto web como desktop
Es buena pues tiene los beneficios de la nativa y con un solo lenguaje para la bese del código, pero se requiere un nuevo lenguaje y el despliegue se debe hacer de manera manual en cada plataforma.
# Android Studio
Definir tamaños de objetos con
### DP
Depende de la densidad de pixeles, recomendado para la mayoría de los elementos
### PX
Es el pixel como tal, no recomendado para la mayoría de los objetos 
### SP
Recomendado para las fuentes de texto
## Strings
Es recomendado que las cadenas de texto se ubiquen en un archivo Strings.xml
En este se guardan los contenidos de los textView con su nombre.
## Actividades
Siempre existe una actividad launcher definida (la que se abre primero cunado se usa la app)
Que se compone de 2 secciones La pantalla como se va a mostrar (XML) y la lógica (Kotlin/java)
La clase R es la que contiene las referencias a los recursos.
En kotlin se pueden declarar variables (var) y valores (val)
Estos se pueden usar para adquirir valores de parte del usuario, transferir datos entre actividades, etc.
## Toast
Son mensajes pequeños por un tiempo limitado , para informar al usuario de acciones.
## Botones
Son botones para indicar que se va a realizar una acción. Esto se hace con un onClick.
## Ciclo de Vida
Una actividad pasa por diferentes etapas durante su ejecución:
Android define una serie de callbacks que se ejecutan en cada momento del ciclo de vida.
- Cuando se lanza una aplicación se utilizan, onCreate() y onStart() 
- Cuando el usuario empieza a dejar la actividad, el sistema llama a los callbacks que desarman la actividad. En algunos casos esta acción es sólo parcial (onPause()), por ejemplo cuando el usuario cambia a otra aplicación, y aún puede volver a utilizar la actividad donde la dejó 
- En este último caso la actividad se reactiva con el callback onResume() 
- El sistema puede terminar los procesos de una aplicación y sus actividades (onStop() y onDestroy()) dependiendo de los recursos disponibles y otras variables como el tiempo que ha estado inactiva. También lo puede hacer el usuario directamente al cerrar la aplicación 
- Dependiendo de la complejidad de la actividad, no se necesitan manejar todos los estados del ciclo de vida
## Intents
Estos son para iniciar otra actividad, puede tener bundles en los que se le envía información.
## Layouts
Un layout es el que describe como se ponen los elementos en la pantalla.
Tipos de layout:
- Linear: línea horizontal o vertical de los elementos.
- Relative: poner una localización relativa a los demás elementos.
- Web View: pantalla de página web
- Framelayout:  se usa para superponer objetos.
- Constrainlayout: su posición es relativa a otros elementos en pantalla
- Listview: mostrar una lista de elementos en lista
- GridView: mostrar elementos en una red 
## Spinner
Es un elemento que permite elegir de un listado predeterminado de opciones.
## Permisos
Estos se deben pedir de manera explicita. Estos se dan de manera automanica si no representan un riesgo para el usuario, si no se le piden al usuario de manera directa.






