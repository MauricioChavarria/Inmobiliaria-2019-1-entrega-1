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
un inmueble es una representación sobre la cual se hace o ejecuta un contrato, por tanto, siempre debe existir uno que respalde dicho contrato. Los inmuebles solo son ofrecidos por los clientes que desean poner en venta o arriendo su inmueble, un inmueble tiene 1 dueño (cliente vendedor/arrendador). Debe estar en uno de dos estados: disponible (venta o arriendo) o no disponible (vendido o arrendado).

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



## Descripción detallada de cada clase de la aplicacion

### Inmueble

**Atributos:**

<li>codigo_inmueble: [private, Int] (12345)</li>
<li>estrato: [private, Int] (1 o 2 o 3 o 4 o 5 o 6)</li>
<li>direccion: [private, String] ("Carrera100#10-20")</li>
<li>vigilancia: [private, Boolean] (True or False)</li>
<li>ascensor: [private, Boolean](True or False)</li>
<li>area: [private, Int] (85)</li>
<li>cuartos: [private, Int] (1 o 2 o ... o n)</li>
<li>baños: [private, Int] (1 o 2 o ... o n)</li>
<li>tipo: [private, String] ("casa" o "apartamento")</li>
<li>estado: [private, String] ("enArriendo" o "enVenta")</li>
<li>antiguedad: [private, Int](1 o 2 o ... o n)</li>
<li>ciudad: [private, String] ("Medellín" o "Rionegro" u "otraciudad")</li>
<li>disponible: [private, Boolean] (True si está enArriendo o enVenta o False si está arrendado o vendido)</li>



**Métodos:**


<li>buscarInmueblesenArriendo(): [Public] (estado=="enArriendo" && disponible==True)</li>
<li>buscarInmueblesenVenta(): [Public] (estado=="enVenta" && disponible==True)</li>
<li>verInmueblesDisponibles(): (disponible==True)</li>
<li>buscarporEstrato(): (estrato==4)</li>
<li>buscarporNumeroBaños(): (baños==3)</li>
<li>buscarporNumeroCuartos(): (cuartos==3)</li>
<li>buscarporArea(): (area==85)</li>
<li>buscarporTipo(): (tipo=="apartamento")</li>


### Contrato

**Atributos:**

<li>codigocontrato: [static private, String] ("lHyu23")</li>
<li>fecha: [private, Date] (10/08/2019)</li>
<li>valor: [private, Long] (10000000l)</li>
<li>inmueble: [private, Inmueble](codigo.inmueble)</li>
<li>cliente: [private, Cliente] (cedula.cliente)</li>



**Métodos:**

### Arriendo

**Atributos:**

<li>fechaInicio: [private, Date] (10/08/2019)</li>
<li>fechaFin: [private, Date] (10/08/2019)</li>
<li>funcionario: [private, Funcionario] (cedula.funcionario)</li>



**Métodos:**

<li>arriendosDisponibles(): (estado=="enArriendo" && disponible==True)</li>

### Compraventa

**Atributos:**

<li>medioPago: [private, String] ("tarjetadecredito")</li>
<li>funcionario: [private, Funcionario] (cedula.funcionario)</li>



**Métodos:**

<li>compraVentasdisponibles(): (estado=="enVenta" && disponible==True)</li>

### Usuario

**Atributos:**

<li>cedula: [private, Long] (20001010202l)</li>
<li>nombre: [private, String] ("Juan Perez")</li>
<li>correo: [private, String] ("juanperez@correo.co")</li>
<li>contraseña: [private, String]("password")</li>
<li>direccion: [private, String] ("carrera23#78-44")</li>




**Métodos:**

<li>login(): (permitir ingresar a perfil de usuario)</li>
<li>registrarUsuario(): (permitir registrarse en plataforma)</li>

### Administrador


**Atributos:**

<li>cedula: [private, Long] (20001010202l)</li>
<li>nombre: [private, String] ("Juan Perez")</li>
<li>correo: [private, String] ("juanperez@correo.co")</li>
<li>contraseña: [private, String]("password")</li>
<li>direccion: [private, String] ("carrera23#78-44")</li>




**Métodos:**

<li>editarCampo(): (permitir editar cualquier campo dentro de la aplicacion)</li>
<li>agregarCampo(): (permitir agregar cualquier campo dentro de la aplicacion)</li>
<li>eliminarCampo(): (permitir eliminar cualquier campo dentro de la aplicacion)</li>
<li>agregarFuncionario(): (el administador es el único que agrega funcionarios)</li>

### Funcionario


**Atributos:**

<li>cedula: [private, Long] (20001010202l)</li>
<li>nombre: [private, String] ("Juan Perez")</li>
<li>correo: [private, String] ("juanperez@correo.co")</li>
<li>contraseña: [private, String]("password")</li>
<li>direccion: [private, String] ("carrera23#78-44")</li>
<li>comision: [private, Long] (1000000l)</li>

**Métodos:** 

<li>listarClientes(): (permitir listar clientes)</li>
<li>listarInmuebles(): (permitir listar inmuebles)</li>
<li>agregarContrato(): (permitir agregar contrato)</li>
<li>agregarCliente(): (permitir agregar cliente)</li>


# FASE DE DISEÑO

En la fase de diseño se definen las clases en su totalidad, la forma de organización de los paquetes y el funcionamiento del programa.
En esta fase establecemos algunos parametros, que consideramos importantes a la hora de crear la aplicacion o el gestor de actividades, este podría ser una (aplicacion, página web) pero es de más bajo nivel, por tanto solo será tipada en código.
En esta sección definiremos todas las clases que hacen posible el funcionamiento del programa, ya que no solo las presentadas anteriormente consideramos útiles, pues la programacion orientada a objetos posibilita el hecho de reutilizar código, encapsular clases y usar diferentes herramientas que hacen fácil cualquier proceso.

## Capa de persistencia

En la capa de persistencia se encuentran los estados de todos los objetos instanciados del programa, en esta caso podremos ver cuales han sido creados, que caracteristicas tienen. En una aplicacion normal estos datos estarían dentro de una base de datos, pero para efectos del ejercicio podremos ver que estos serán guardados en archivos de texto, que las clases de esta capa se encargarán de manejar y por suspuesto de guardar. Esta solucion es efectiva solo en archivos pequeños o con poco volumen, ya que si se desea implementar gran cantidad de datos creando objetos la portabilidad del programa sería díficil, pero para efectos de este ejercicio y usando progra,ación orientada a objetos es suficiente.


Dentro de la capa de persistencia existen dos paquetes **Basedatos** y **/temp**, el primero aloja todas las clases que permiten crear los archivos de texto, manipularlos, etc. Y dentro del paquete */temp* se guardan los archivos de texto.

### Clase Data o datos

'aquí va el código de la clase datos'

Así se ven los archivos de texto, donde se guardan los estados de los objetos.

## Capa lógica

La capa lógica hace referencia a las clases del programa mostradas al principio, en este caso son las que tienen mas importancia puesto que son las que definen el funcionamiento del mismo. Por un lado le dan vida al proyecto y por el otro evitan que con las demas capas tengamos un menú e infraestructura vacía.

El paquete que aloja estas clases se llama **gestorAplicacion**

### Clase Inmueble:

'package gestorAplicacion;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inmueble {
    
    private int predial;
    private int estrato;
    private boolean vigilancia;
    private boolean ascensor;
    private int area;
    private int banos;
    private int cuartos;
    private String tipo;
    private LinkedList<Arriendo> arriendo;
    private Compraventa compraventa;
    private String ciudad;
    private int antiguedad;
    private boolean disponible;

    public Inmueble(int predial, int estrato, boolean vigilancia, boolean ascensor, int area, int banos, int cuartos, String tipo, Compraventa compraventa, String ciudad, int antiguedad, boolean disponible) {
        this.predial = predial;
        this.estrato = estrato;
        this.vigilancia = vigilancia;
        this.ascensor = ascensor;
        this.area = area;
        this.banos = banos;
        this.cuartos = cuartos;
        this.tipo = tipo;
        this.arriendo = new LinkedList<Arriendo>();
        this.compraventa = compraventa;
        this.ciudad = ciudad;
        this.antiguedad = antiguedad;
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        return "Inmueble{" + "estrato=" + estrato + ", vigilancia=" + vigilancia + ", ascensor=" + ascensor + ", area=" + area + ", banos=" + banos + ", cuartos=" + cuartos + ", tipo=" + tipo + ", arriendo=" + arriendo + ", compraventa=" + compraventa + ", ciudad=" + ciudad + ", antiguedad=" + antiguedad + ", disponible=" + disponible + '}';
    }

    public int getPredial() {
        return predial;
    }

    public void setPredial(Integer predial) {
        this.predial = predial;
    }
    
    
    
    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(Integer estrato) {
        this.estrato = estrato;
    }

    public boolean getVigilancia() {
        return vigilancia;
    }

    public void setVigilancia(boolean vigilancia) {
        this.vigilancia = vigilancia;
    }

    public boolean getAscensor() {
        return ascensor;
    }

    public void setAscensor(boolean ascensor) {
        this.ascensor = ascensor;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getBanos() {
        return banos;
    }

    public void setBanos(int banos) {
        this.banos = banos;
    }

    public int getCuartos() {
        return cuartos;
    }

    public void setCuartos(int cuartos) {
        this.cuartos = cuartos;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo.trim();
    }

    public LinkedList<Arriendo> getArriendo() {
        return arriendo;
    }

    public void setArriendo(LinkedList<Arriendo> arriendo) {
        this.arriendo = arriendo;
    }

    public Compraventa getCompraventa() {
        return compraventa;
    }

    public void setCompraventa(Compraventa compraventa) {
        this.compraventa = compraventa;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad.trim();
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean addArriendo(Arriendo a1) {
        if (this.getCompraventa() == null) {
            this.getArriendo().add(a1);
            return true;
        } else {
            return false;
        }
    }

    public boolean addCompraventa(Compraventa c1) {
        if (this.getCompraventa() == null) {
            this.setCompraventa(c1);
            return true;
        } else {
            return false;
        }
    }


    public static LinkedList<Inmueble> verInmueblesDisponibles(LinkedList<Inmueble> todos_inmuebles) {
        Iterator<Inmueble> i;
        Inmueble actual;
        LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<Inmueble>();
        i = todos_inmuebles.listIterator();
        while (i.hasNext()) {
            actual = i.next();
            if (actual.getDisponible()) {
                inmuebles_encontrados.add(actual);
            }
        }
        if (inmuebles_encontrados.isEmpty()) {
            return null;
        }
        return inmuebles_encontrados;
    }

    public static Inmueble buscarPorPredial(List<Inmueble> inmuebles, int predial) {
        for (Inmueble iterado : inmuebles) {
            if (iterado.getPredial() == predial) {
                return iterado;
            }
        }
        return null;
    }

    public static LinkedList<Inmueble> buscarInmueblesEnCompraventa(LinkedList<Inmueble> todos_inmuebles) {
        LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<Inmueble>();
        for (Inmueble iterado : todos_inmuebles) {

            if (iterado.getTipo().equalsIgnoreCase("enVenta")) {
                inmuebles_encontrados.add(iterado);
            }
        }
        if (inmuebles_encontrados.isEmpty()) {
            return null;
        }
        return inmuebles_encontrados;
    }

    public static LinkedList<Inmueble> buscarInmueblesEnArriendo(LinkedList<Inmueble> todos_inmuebles) {
        LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<Inmueble>();
        for (Inmueble iterado : todos_inmuebles) {

            if (iterado.getTipo().equalsIgnoreCase("enArriendo")) {
                inmuebles_encontrados.add(iterado);
            }
        }
        if (inmuebles_encontrados.isEmpty()) {
            return null;
        }
        return inmuebles_encontrados;
    }

    ////busquedaaaaaaaas
    //por ciudad
    public static LinkedList<Inmueble> buscarPorCiudad(LinkedList<Inmueble> todos_inmuebles, String ciudad) {
        LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<Inmueble>();
        for (Inmueble iterado : todos_inmuebles) {
            if (iterado.getCiudad().equalsIgnoreCase(ciudad)) {
                inmuebles_encontrados.add(iterado);
            }
        }
        if (inmuebles_encontrados.isEmpty()) {
            return null;
        }
        return inmuebles_encontrados;
    }

    //por estrato
    public static LinkedList<Inmueble> buscarPorEstrato(LinkedList<Inmueble> todos_inmuebles, int estrato) {
        LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<Inmueble>();
        for (Inmueble iterado : todos_inmuebles) {
            if (iterado.getEstrato() == estrato) {
                inmuebles_encontrados.add(iterado);
            }
        }
        if (inmuebles_encontrados.isEmpty()) {
            return null;
        }
        return inmuebles_encontrados;
    }

    //por numero de banos
    public static LinkedList<Inmueble> buscarPorNumeroDeBanos(LinkedList<Inmueble> todos_inmuebles, int banosini, int banostop) {
        LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<Inmueble>();
        int bano;
        for (Inmueble iterado : todos_inmuebles) {
            bano = iterado.getBanos();
            if ((bano >= banosini) && (bano <= banostop)) {
                inmuebles_encontrados.add(iterado);
            }
        }
        if (inmuebles_encontrados.isEmpty()) {
            return null;
        }
        return inmuebles_encontrados;
    }

    //por numero de cuartos
    public static LinkedList<Inmueble> buscarPorNumeroDeCuartos(LinkedList<Inmueble> todos_inmuebles, int cuartosini, int cuartostop) {
        LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<Inmueble>();
        int c;
        for (Inmueble iterado : todos_inmuebles) {
            c = iterado.getCuartos();

            if ((c <= cuartostop) && (c >= cuartosini)) {
                inmuebles_encontrados.add(iterado);
            }
        }
        if (inmuebles_encontrados.isEmpty()) {
            return null;
        }
        return inmuebles_encontrados;
    }

    //por area
    public static LinkedList<Inmueble> buscarPorArea(LinkedList<Inmueble> todos_inmuebles, int areaini, int areatop) {
        LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<Inmueble>();
        int area;
        for (Inmueble iterado : todos_inmuebles) {
            area = iterado.getArea();

            if ((area <= areatop) && (area >= areaini)) {
                inmuebles_encontrados.add(iterado);
            }
        }
        if (inmuebles_encontrados.isEmpty()) {
            return null;
        }
        return inmuebles_encontrados;

    }

}
'



# FASE DE IMPLEMENTACIÓN

# CONCLUSIONES

# ANEXOS

# BIBLIOGRAFÍA
