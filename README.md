# GESTOR DE ACTIVIDADES PARA EMPRESA INMOBILIARIA

## Introducción

### Descripcion del funcionamineto de Inmobiliaria Arrenda-Todo

La empresa inmobiliaria Arrienda-Todo cuenta con aproximadamente 500 clientes, atiende diariamente a unos 45 usuarios entre clientes e invitados, y tiene más de 3500 contratos de arrendamiento y compraventa en el área metropolitana del Valle de Aburrá, y otros 12 municipios en el departamento de Antioquia. Tiene 15 empleados: 1 administrador, 2 secretarias, 9 asesores, 1 abogado, 1 tecnólogo en sistemas y 1 conserje.
La inmobiliaria actualmente cuenta con herramientas básicas en términos del soporte tecnológico, cuenta con 11 computadores con acceso a internet, una pequeña base de datos en línea donde guardan los datos de los clientes y de los contratos digitales y escaneados, impresora multifuncional en red, teléfono fijo y wifi.
Todos los clientes deben asistir a la oficina ubicada en Belén-Rosales para firmar un contrato, ya sea como vendedor/comprador o arrendador/arrendatario.
Los asesores deben tener un número de clientes, un cliente debe ser atendido por un asesor que es el mismo que lleva el contrato, estableciendo la relación entre vendedor/comprador o arrendador/arrendatario. Eso significa que cuando hay un cliente interesado en vender/arrendar, el asesor toma el caso y busca comprador/arrendatario y el mismo hace el contrato y lleva el seguimiento.


### Modelo verbal de las clases asociadas de la página

#### Inmueble: un inmueble es una representación sobre la cual se hace o ejecuta un contrato, por tanto, siempre debe existir uno que respalde dicho contrato, los inmuebles solo son ofrecidos por los clientes que desean poner en venta o arriendo su inmueble. 
•	Un inmueble tiene 1 dueño (cliente vendedor/arrendador).
•	Debe estar en uno de dos estados: disponible (venta o arriendo) o no disponible (vendido o arrendado).

####Contrato
Un contrato es el papel firmado, donde se incluyen los términos y condiciones del arriendo o compraventa. Este contrato hace referencia al producto final o servicio que presta la inmobiliaria.
•	Un contrato tiene asociado un Inmueble
•	Solo puede ser de tipo Compraventa o Arriendo
•	Debe tener un cliente vendedor/arrendador y un comprador/arrendatario.
•	Debe ser diligenciado, autorizado y manipulado por un funcionario.
####Arriendo
Un arriendo es una clase de referencia ligada directamente al tipo de contrato, esta se usa cuando el inmueble se arrienda, por lo tanto, debe ser incluida en Contrato.
•	Debe tener asociado un cliente arrendador/arrendatario
•	Debe existir en un contrato
####Compraventa
Es una entidad de referencia ligada directamente al tipo de contrato, esta se da cuando se hace un contrato de compra o venta.
•	Debe tener asociado un cliente vendedor/comprador.
•	Debe existir en un contrato
####Usuario
Esta clase es la que aloja a todos los usuarios del sistema, tiene las funciones básicas de ser usuario.
•	Cada usuario debe tener estas características, deben ser objetos de la clase usuario.
•	Es la que inicia la aplicación por tanto cuenta con opciones de login y registro.
####Usuario_Invitado
Esta clase es heredada de Usuario, el usuario invitado es aquel que puede ingresar a la página y consultar opciones básicas.
####Funcionario
El funcionario es un tipo de Usuario, también heredada de Usuario. Tiene opciones avanzadas entre las principales, crear contratos.
####Administrador
El usuario administrador posee todos los permisos de edición, agregar campos etc, también es heredado de Usuario.
####Cliente
Esta clase también es hija de Usuario, posee características propias como por ejemplo ofrecer inmuebles (poner en arriendo/venta o arrendar/comprar). 




```
Give examples
```

### Installing

A step by step series of examples that tell you how to get a development env running

Say what the step will be

```
Give the example
```

And repeat

```
until finished
```

End with an example of getting some data out of the system or using it for a little demo

## Running the tests

Explain how to run the automated tests for this system

### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Dropwizard](http://www.dropwizard.io/1.0.2/docs/) - The web framework used
* [Maven](https://maven.apache.org/) - Dependency Management
* [ROME](https://rometools.github.io/rome/) - Used to generate RSS Feeds

## Contributing

Please read [CONTRIBUTING.md](https://gist.github.com/PurpleBooth/b24679402957c63ec426) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc