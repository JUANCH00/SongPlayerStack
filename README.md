#Resumen 
Este readme resume la ejecución del taller realizado por el estudiante de un un reproductor 
de musica utilizando las colas de java

#Requisitos para la ejecución.
-Jdk 17
-Puerto 8080 y 4200 disponibles
-Windos 11 (No probado en windos 10, MacOs y Linux)

#Ejecucion del proyecto
-Ubique el jar del proyecto en la carpeta deseada
-Abra la terminal en la carpeta donde ubico el jar
-Ejecute el comando
```cmd
java -jar .\   .jar
```
#Funcionamiento de las colas
En este proyecto de reproductor de musica se implemento el uso de colas de java.
Al agregar una nueva cancion esta se almacena en un stack. 
```java
public Object addToPlaylist(Song song) {
        playlist.push(song);
        return playlist;
    }
}
```
Para reproducir una cancion se utiliza el metodo pop() para facilitar el codigo.
```java
public Stack<Song> deleteFromPlaylist() throws ProjectException {
        if (!playlist.isEmpty()) {
            playlist.pop();
            return playlist;
        } else {
            throw new ProjectException(TypeMessage.EMPTY_LIST);
        }
    }
```
