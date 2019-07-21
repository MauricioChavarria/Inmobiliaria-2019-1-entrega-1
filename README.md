# GESTOR DE ACTIVIDADES PARA EMPRESA INMOBILIARIA

## INTRODUCCION

# FASE DE ANALISIS

## Descripcion del funcionamineto de Inmobiliaria Arrenda-Todo

La empresa inmobiliaria Arrienda-Todo cuenta con aproximadamente 500 clientes, atiende diariamente a unos 45 usuarios entre clientes e invitados, y tiene más de 3500 contratos de arrendamiento y compraventa en el área metropolitana del Valle de Aburrá, y otros 12 municipios en el departamento de Antioquia. Tiene 15 empleados: 1 administrador, 2 secretarias, 9 asesores, 1 abogado, 1 tecnólogo en sistemas y 1 conserje.
La inmobiliaria actualmente cuenta con herramientas básicas en términos del soporte tecnológico, cuenta con 11 computadores con acceso a internet, una pequeña base de datos en línea donde guardan los datos de los clientes y de los contratos digitales y escaneados, impresora multifuncional en red, teléfono fijo y wifi.
Todos los clientes deben asistir a la oficina ubicada en Belén-Rosales para firmar un contrato, ya sea como vendedor/comprador o arrendador/arrendatario.
Los asesores deben tener un número de clientes, un cliente debe ser atendido por un asesor que es el mismo que lleva el contrato, estableciendo la relación entre vendedor/comprador o arrendador/arrendatario. Eso significa que cuando hay un cliente interesado en vender/arrendar, el asesor toma el caso y busca comprador/arrendatario y el mismo hace el contrato y lleva el seguimiento.


## Modelo verbal de las clases asociadas de la página

1) Inmueble:
un inmueble es una representación sobre la cual se hace o ejecuta un contrato, por tanto, siempre debe existir uno que respalde dicho contrato.Los inmuebles solo son ofrecidos por los clientes que desean poner en venta o arriendo su inmueble, un inmueble tiene 1 dueño (cliente vendedor/arrendador).Debe estar en uno de dos estados: disponible (venta o arriendo) o no disponible (vendido o arrendado).

2) Contrato:
Un contrato es el papel firmado, donde se incluyen los términos y condiciones del arriendo o compraventa. Este contrato hace referencia al producto final o servicio que presta la inmobiliaria.Un contrato tiene asociado un inmueble, solo puede ser de tipo Compraventa o Arriendo. Debe tener un cliente vendedor/arrendador y un comprador/arrendatario, debe ser diligenciado, autorizado y manipulado por un funcionario.

3) Arriendo:
Un arriendo es una clase de referencia ligada directamente al tipo de contrato, esta se usa cuando el inmueble se arrienda, por lo tanto, debe ser incluida en Contrato. Debe tener asociado un cliente arrendador/arrendatario. Debe existir en un contrato.

4) Compraventa:
Es una entidad de referencia ligada directamente al tipo de contrato, esta se da cuando se hace un contrato de compra o venta. Debe tener asociado un cliente vendedor/comprador, debe existir en un contrato.

5) Usuario:
Esta clase es la que aloja a todos los usuarios del sistema, tiene las funciones básicas de ser usuario, cada usuario debe tener estas características. Deben ser objetos de la clase usuario. Es la que inicia la aplicación por tanto cuenta con opciones de login y registro.
6) Usuario_Invitado:
Esta clase es heredada de Usuario, el usuario invitado es aquel que puede ingresar a la página y consultar opciones básicas, esto significa que no tiene permisos de acceso que tendría un usuario registrado.Tiene la opción de registrarse

7) Funcionario:
El funcionario es un tipo de Usuario, también heredada de Usuario,tiene opciones avanzadas entre las principales: crear contratos.

8) Administrador:
El usuario administrador posee todos los permisos de edición, agregar campos etc, también es heredado de Usuario.

9) Cliente:
Esta clase también es hija de Usuario, posee características propias como por ejemplo ofrecer inmuebles (poner en arriendo/venta o arrendar.

## Diagrama de clases UML

Esta representacion gráfica ayudará a entender el modelo verbal anteriormente descrito, en este mismo se pueden ver las relaciones que existe entre clases, la cardinalidad y atributos/métodos.

* [DIAGRAMA DE CLASES UML](https://drive.google.com/open?id=1Pcddm9otUvvFZf18R64ALlCXV5us9vxP).

## Diagrama de objetos UML

* [DIAGRAMA DE OBJETOS UML] : AQUÍ VA EL LINK



## Descripción detallada de cada clase

### Inmueble
Atributos:
<li>estrato: [private, Int], el estrato hace referencia a la clasificación social por numeros hecha en Colombia (1, 2, 3, 4, 5, 6)</li>
<li>direccion: [private, String], la direccion se escribe como una cadena de caracteres entre comillas ("Carrera100#10-20")</li>
<li>vigilancia: [private, Boolean], este atributo afirma o niega la existencia de vigilancia en el inmueble (True or False)</li>
<li>ascensor: [private, Boolean], este atributo afirma o niega la existencia de ascensor en el inmueble (True or False)</li>
<li>area: [private, Int], el área corresponde a la magnitud en metros cuadrados del inmueble (85)</li>
<li>cuartos: [private, Int], este atributo hace referencia al número de cuartos que posee el inmueble (1, 2,..., n)</li>
<li>baños: [private, Int], este atributo hace referencia al número de baños que posee el inmueble (1, 2,..., n)</li>
<li>tipo: [private, String], aquí se puede verificar el tipo de inmueble, escrito en una cadena de caracteres (casa, apartamento, etc)</li>
<li>estado: [private, String], este atributo hace referencia al tipo de contrato que desea realizar el cliente (enArriendo o enCompraventa)</li>
<li>antiguedad: [private, Int], hace referencia a la cantidad de años que tiene el inmueble (1, 2,....,n)</li>
<li>ciudad: [private, String] esta atributo describe la ciudad donde se encuentra ubicado el inmueble, descrito en una cadena de caracteres("Medellín", "Rionegro", etc)</li>
<li>disponible: [private, Boolean], aquí se evidencia si el inmueble está disponible (True:enArriendo o enCompraventa) o(False: arrendado o vendido)</li>

Métodos:


# FASE DE DISEÑO

# FASE DE IMPLEMENTACIÓN

# CONCLUSIONES

# ANEXOS

# BIBLIOGRAFÍA