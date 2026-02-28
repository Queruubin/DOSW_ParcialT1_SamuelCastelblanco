# Samuel Felipe Castelbanco Tellez

## EventSync


## Diagrama de contexto

![alt text](./DosW.Parcial1/src/docs/public/contexto.png)

## Requerimientos

### Requerimientos funcionales

El sistema de EventSync debe tener la capacidad de:

1. Creacion de eventos 
2. Notificaciones push al ocurrir alguno de estos eventos
3. Inscripcion de usuarios o asistentes

### Requerimiento Funcional 1

| Campo | Descripción |
|------|-------------|
| **ID** | RF-01 |
| **Nombre del requerimiento** | Creacion de eventos |
| **Descripción** | *El sistema debe poder permitir crear diferentes tipos de eventos con sus respectivas reglas.* |
| **Actor** | *Tanto estudiantes, profesores y administradores pueden crear eventos* |
| **Flujo principal** | 1. El actor diligencia formulario para la creacion del evento<br>2. El sistema verifica las reglas<br>3. El sistema crea el evento y notifica a los usuarios |
| **Diagrama de caso de uso** | ![alt text](image-1.png) |
| **Patron** | *Factory* |


### 2.2 Requerimiento Funcional 2

| Campo | Descripción |
|------|-------------|
| **ID** | RF-02 |
| **Nombre del requerimiento** | Notificaciones push al ocurrir alguno de estos eventos |
| **Descripción** | *El sistema debe enviar notificaciones a los usuarios una vez creado un evento* |
| **Actor** | *Para este caso se usara firebase cloud messaging para el nevio de notificaciones* |
| **Flujo principal** | 1. Un usuario crea un evento.<br>2. Si fue exitoso la creacion. Se envia una notificaion a todos los usuarios|
| **Diagrama de caso de uso** | ![alt text](image-2.png)|

### Requerimientos no funcionales

El sistema de EventSync debe tener

1. Una paleta de colores oscura
2. La aplicacion debe soportar mas de 10.000 usuarios al mismo tiempo
