# GESTOR DE ACTIVIDADES PARA EMPRESA INMOBILIARIA

## 10 Funcionalidades (estas son distintas de los get, set, ejecutar, ingreso)

<li>Funcionalidad 1: buscarInmueblesenArriendo() --> Lo puede hacer cualquiera</li>
<li>Funcionalidad 2: buscarInmueblesenventa() --> Lo puede hacer cualquiera</li>
<li>Funcionalidad 4: agregarFuncionario() --> Lo puede hacer un administrador</li>
<li>Funcionalidad 5: listarClientes() --> Lo puede hacer un funcionario y un administrador</li>
<li>Funcionalidad 6: listarInmuebles() --> Lo puede hacer un funcionario y un administrador</li>
<li>Funcionalidad 7: agregarContrato() --> Lo puede hacer un funcionario</li>
<li>Funcionalidad 8: agregarCliente() --> Lo puede hacer un funcionario, un administrador y un cliente</li>
<li>Funcionalidad 9: ofrecerInmueble() --> Lo puede hacer un cliente</li>
<li>Funcionalidad 10: listarAdministradores() --> Lo puede hacer un administrador</li>
<li>Funcionalidad 11: listarfuncionarios() --> lo puede hacer un administrador</li>

## FASE DE ANALISIS

## Descripcion del funcionamineto de Inmobiliaria Arrenda-Todo

La empresa inmobiliaria Arrienda-Todo cuenta con aproximadamente 500 clientes, atiende diariamente a unos 45 usuarios entre clientes e invitados, y tiene más de 3500 contratos de arrendamiento y compraventa en el área metropolitana del Valle de Aburrá, y otros 12 municipios en el departamento de Antioquia. Tiene 15 empleados: 1 administrador, 2 secretarias, 9 asesores, 1 abogado, 1 tecnólogo en sistemas y 1 conserje.
La inmobiliaria actualmente cuenta con herramientas básicas en términos del soporte tecnológico, cuenta con 11 computadores con acceso a internet, una pequeña base de datos en línea donde guardan los datos de los clientes y de los contratos digitales y escaneados, impresora multifuncional en red, teléfono fijo y wifi.
Todos los clientes deben asistir a la oficina ubicada en Belén-Rosales para firmar un contrato, ya sea como vendedor/comprador o arrendador/arrendatario.
Los asesores deben tener un número de clientes, un cliente debe ser atendido por un asesor que es el mismo que lleva el contrato, estableciendo la relación entre vendedor/comprador o arrendador/arrendatario. Eso significa que cuando hay un cliente interesado en vender/arrendar, el asesor toma el caso y busca comprador/arrendatario y el mismo hace el contrato y lleva el seguimiento.


## Modelo verbal de las clases asociadas del programa

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

6) Funcionario:
El funcionario es un tipo de Usuario, también heredada de Usuario,tiene opciones avanzadas entre las principales: crear contratos.

7) Administrador:
El usuario administrador posee todos los permisos de edición, agregar campos etc, también es heredado de Usuario.

8) Cliente:
Esta clase también es hija de Usuario, posee características propias como por ejemplo ofrecer inmuebles (poner en arriendo/venta o arrendar.

## Diagrama de clases UML

Esta representacion gráfica ayudará a entender el modelo verbal anteriormente descrito, en este mismo se pueden ver las relaciones que existe entre clases, la cardinalidad y atributos/métodos.

* [DIAGRAMA DE CLASES UML](https://drive.google.com/open?id=1Pcddm9otUvvFZf18R64ALlCXV5us9vxP).

## Diagrama de objetos UML

* [DIAGRAMA DE OBJETOS UML](https://drive.google.com/file/d/1pKYtPCc9sOI0QTJsQK1kmGFjtVvKxLdl/view?usp=sharing)

***lOS MÉTODOS QUE ESTÁN ENUMERADOS SON LOS QUE DEBEMOS IMPLEMENTAR EN EL PROGRAMA, YA QUE EL PROFESOR SOLICITA MÍNIMO 10 ESTOS VAN APARTE DE LOS GET Y LOS SET, Y APARTE DE LOS QUE SE HACE AL AUTENTICARSE UN USUARIO***


## Descripción detallada de cada clase de la aplicacion

### Inmueble

**Atributos:**

<li>codigo_inmueble: [private, String] (F1232)</li>
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

<li>1. buscarInmueblesenArriendo(): [Public] (estado=="enArriendo" && disponible==True)</li>
<li>2. buscarInmueblesenVenta(): [Public] (estado=="enVenta" && disponible==True)</li>


### Contrato

**Atributos:**

<li>codigocontrato: [static private, String] ("lHyu23")</li>
<li>fecha: [private, Date] (10/08/2019)</li>
<li>valor: [private, Long] (10000000l)</li>
<li>inmueble: [private, Inmueble](codigo.inmueble)</li>
<li>cliente: [private, Cliente] (cedula.cliente)</li>

### Arriendo

**Atributos:**

<li>fechaInicio: [private, Date] (10/08/2019)</li>
<li>fechaFin: [private, Date] (10/08/2019)</li>
<li>funcionario: [private, Funcionario] (cedula.funcionario)</li>

### Compraventa

**Atributos:**

<li>medioPago: [private, String] ("tarjetadecredito")</li>
<li>funcionario: [private, Funcionario] (cedula.funcionario)</li>

### Usuario

**Atributos:**

<li>cedula: [private, Long] (20001010202l)</li>
<li>nombre: [private, String] ("Juan Perez")</li>
<li>correo: [private, String] ("juanperez@correo.co")</li>
<li>contraseña: [private, String]("password")</li>
<li>direccion: [private, String] ("carrera23#78-44")</li>


**Métodos:**



### Administrador

**Métodos:**

<li>3. agregarFuncionario()</li>
<li>4. agregarAdministrador()</li>
<li>5. listarFuncionarios()</li>
<li>6. listarAdministradores()</li>


### Funcionario

**Atributos:**

<li>comision: [private, Long] (1000000l)</li>

**Métodos:** 

<li>7. listarClientes()</li>
<li>8. listarInmuebles()</li>
<li>9. agregarContrato()</li>
<li>10. agregarCliente()</li>

### Cliente

**Métodos**

<li>10. ofrecerInmueble()</li>


# FASE DE DISEÑO

En la fase de diseño se definen las clases en su totalidad, la forma de organización de los paquetes y el funcionamiento del programa.
En esta fase establecemos algunos parametros, que consideramos importantes a la hora de crear la aplicacion o el gestor de actividades, este podría ser una (aplicacion, página web) pero es de más bajo nivel, por tanto solo será tipada en código.
En esta sección definiremos todas las clases que hacen posible el funcionamiento del programa, ya que no solo las presentadas anteriormente consideramos útiles, pues la programacion orientada a objetos posibilita el hecho de reutilizar código, encapsular clases y usar diferentes herramientas que hacen fácil cualquier proceso.

## Capa de persistencia

En la capa de persistencia se encuentran los estados de todos los objetos instanciados del programa, en esta caso podremos ver cuales han sido creados, que caracteristicas tienen. En una aplicacion normal estos datos estarían dentro de una base de datos, pero para efectos del ejercicio podremos ver que estos serán guardados en archivos de texto, que las clases de esta capa se encargarán de manejar y por suspuesto de guardar. Esta solucion es efectiva solo en archivos pequeños o con poco volumen, ya que si se desea implementar gran cantidad de datos creando objetos la portabilidad del programa sería díficil, pero para efectos de este ejercicio y usando progra,ación orientada a objetos es suficiente.


Dentro de la capa de persistencia existen dos paquetes **Basedatos** y **/temp**, el primero aloja todas las clases que permiten crear los archivos de texto, manipularlos, etc. Y dentro del paquete */temp* se guardan los archivos de texto.

### Serial

'aquí va el código de la clase datos'

Así se ven los archivos de texto, donde se guardan los estados de los objetos.

## Capa lógica

La capa lógica hace referencia a las clases del programa mostradas al principio, en este caso son las que tienen mas importancia puesto que son las que definen el funcionamiento del mismo. Por un lado le dan vida al proyecto y por el otro evitan que con las demas capas tengamos un menú e infraestructura vacía.

El paquete que aloja estas clases se llama **gestorAplicacion**

### Clase Inmueble:
```
package gestorAplicacion;
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
```

### Clase Arriendo:

```package gestorAplicacion;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
public class Arriendo extends Contrato{
    
    private String agencia;
    private Date fechafin;

    public Arriendo(int codigo,Date fecha,double valor,Inmueble inmueble,boolean disponible, String medioPago, String agencia, Date fechafin) {
        super(codigo,fecha,valor,inmueble,disponible);
        this.agencia = agencia;
        this.fechafin = fechafin;
    }

    
    @Override
    public String toString() {
        return "Arriendo{" + ", agencia=" + agencia + ", fechafin=" + fechafin + '}';
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia.trim();
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }
    
    public static LinkedList<Arriendo> arriendosDisponibles(HashMap<Integer, Arriendo> arriendos){
        LinkedList<Arriendo> disponibles = new LinkedList<Arriendo>();
        for (Arriendo a1 : arriendos.values()) {
            if(a1.getDisponible()){
                disponibles.add(a1);
            }
        }
        if(disponibles.isEmpty()){
            return null;
        }
        return disponibles;
        
    }
}
 ```

### Clase compraventa:

``` package gestorAplicacion;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

public class Compraventa extends Contrato {

    private Cliente comprador;
    private String medioPago;

    public Compraventa(int codigo,Date fecha,double valor,Inmueble inmueble,boolean disponible, String medioPago) {
        super(codigo,fecha,valor,inmueble,disponible);
        this.comprador = null;
        this.medioPago = medioPago;
    }

    @Override
    public String toString() {
        return "Compraventa{" + "comprador=" + comprador + ", medioPago=" + medioPago + '}';
    }
    
    public Cliente getComprador() {
        return comprador;
    }

    public void setComprador(Cliente comprador) {
        this.comprador = comprador;
    }

    public String getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(String medioPago) {
        this.medioPago = medioPago.trim();
    }

    public static LinkedList<Compraventa> compraventasDisponibles(HashMap<Integer, Compraventa> compraventas) {
        LinkedList<Compraventa> disponibles = new LinkedList<Compraventa>();
        for (Compraventa c1 : compraventas.values()) {
            if (c1.getDisponible()) {
                disponibles.add(c1);
            }
        }
        if (disponibles.isEmpty()) {
            return null;
        }
        return disponibles;

    }

}
```

### Clase Contrato 

```package gestorAplicacion;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
public class Contrato {

    private int codigo;
    private Date fecha;
    private double valor;
    private Inmueble inmueble;
    private boolean disponible;
    public static int codigo_nuevo=999;
    public static List<Contrato> contratos = new ArrayList<Contrato>();
    public Contrato(int codigo,Date fecha,double valor,Inmueble inmueble,boolean disponible){
        this.codigo=codigo;
        this.fecha=fecha;
        this.inmueble =inmueble;
        this.valor=valor;
        this.disponible=disponible;
    }
    @Override
    public String toString() {
        return "Contrato{" + "codigo=" + codigo + ", fecha=" + fecha + ", valor=" + valor + ", inmueble=" + inmueble + ", disponible=" + disponible + '}';
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Inmueble getInmueble() {
        return inmueble;
    }

    public void setInmueble(Inmueble inmueble) {
        this.inmueble = inmueble;
    }

    public boolean getDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    //busquedas------------------------------------------------------------------------------------
    
    //por codigo
    public static Contrato buscarContrato(HashMap<Integer, Contrato> contratos, Integer codigo) {
        Contrato encontrado = contratos.get(codigo);
        return encontrado;
    }

    //por ciudad
    public static LinkedList<Contrato> buscarPorCiudad(HashMap<Integer, Contrato> contratos, String ciudad) {
        LinkedList<Contrato> todos_los_contratos = new LinkedList<Contrato>();
        for (Contrato contra : contratos.values()) {
            if (contra.getInmueble().getCiudad().equalsIgnoreCase(ciudad)) {
                todos_los_contratos.add(contra);
            }
        }
        if (todos_los_contratos.isEmpty()) {
            return null;
        }
        return todos_los_contratos;
    }

    //por estrato
    public static LinkedList<Contrato> buscarPorEstrato(HashMap<Integer, Contrato> contratos, int estrato) {
        LinkedList<Contrato> todos_los_contratos = new LinkedList<Contrato>();
        for (Contrato contra : contratos.values()) {
            if (contra.getInmueble().getEstrato() == estrato) {
                todos_los_contratos.add(contra);
            }
        }
        if (todos_los_contratos.isEmpty()) {
            return null;
        }
        return todos_los_contratos;
    }
    
    //por numero de banos
    public static LinkedList<Contrato> buscarPorNumeroDeBanos(HashMap<Integer, Contrato> contratos, int banosini, int banostop) {
        LinkedList<Contrato> todos_los_contratos = new LinkedList<Contrato>();
        int bano;
        for (Contrato contra : contratos.values()) {
            bano = contra.getInmueble().getBanos();
            if ((bano>=banosini)&&(bano<=banostop)) {
                todos_los_contratos.add(contra);
            }
        }
        if (todos_los_contratos.isEmpty()) {
            return null;
        }
        return todos_los_contratos;
    }
    
    //por numero de cuartos
    public static LinkedList<Contrato> buscarPorNumeroDeCuartos(HashMap<Integer, Contrato> contratos, int cuartosini, int cuartostop) {
        LinkedList<Contrato> todos_los_contratos = new LinkedList<Contrato>();
        int c;
        for (Contrato contra : contratos.values()) {
            c = contra.getInmueble().getCuartos();
            if ((c>=cuartosini)&&(c<=cuartostop)) {
                todos_los_contratos.add(contra);
            }
        }
        if (todos_los_contratos.isEmpty()) {
            return null;
        }
        return todos_los_contratos;
    }
    
    //por area
    public static LinkedList<Contrato> buscarPorArea(HashMap<Integer, Contrato> contratos, int areaini, int areatop) {
        LinkedList<Contrato> todos_los_contratos = new LinkedList<Contrato>();
        int area;
        for (Contrato contra : contratos.values()) {
            area = contra.getInmueble().getArea();
            if ((area>=areaini)&&(area<=areatop)) {
                todos_los_contratos.add(contra);
            }
        }
        if (todos_los_contratos.isEmpty()) {
            return null;
        }
        return todos_los_contratos;
    }
}
```
### Clase Usuario:

```package gestorAplicacion;

//import java.util.ArrayList;

public class Usuario {
    private int cedula;
    private String nombre;
        private String correo;
        private String contrasena;
        private String direccion;
    
    public Usuario(int cedula, String nombre, String correo, String contrasena, String direccion) {
        this.cedula=cedula;
        this.nombre=nombre;
        this.correo=correo;
        this.contrasena=contrasena;
        this.direccion=direccion;
    }

    public int getCedula() {
        return cedula;
    }
    
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getCorreo() {
        return correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getContrasena() {
        return contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public String getDireccion() {
        return direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
``` 

### Clase Cliente

```package gestorAplicacion;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario{

    
    public static List<Cliente> clientes = new ArrayList<Cliente>();
    public Cliente(int cedula, String nombre, String correo, String contrasena, String direccion) {
         super(cedula,nombre,correo,contrasena,direccion);
    }
    
    public static void addCliente(Cliente p){
        clientes.add(p);
    }
    public static Cliente getCliente(int cc,List<Cliente> clientes) {
        return clientes.get(cc);
    }
    public static Cliente login(int cedula, String contrasena, ArrayList<Cliente> clientes) {
        
         for(Cliente c: clientes){
             if(c.getCedula()== cedula && c.getContrasena()==contrasena){
                 return c;
             }
         }
        return null;

    }
}

``` 

### Clase Administrador

```package gestorAplicacion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Administrador extends Usuario {

    public static List<Administrador> admins = new ArrayList<Administrador>();

    public Administrador(int cedula, String nombre, String correo, String contrasena, String direccion) {
        super(cedula, nombre, correo, contrasena, direccion);
    }
    
    public static LinkedList<Funcionario> listarFuncionarios(LinkedList<Funcionario> todos_funcionarios){
         LinkedList<Funcionario> funcionarioa_encontrados = new LinkedList<Funcionario>();
            for (Funcionario iterado : todos_funcionarios) {
                funcionarioa_encontrados.add(iterado);
            }
            return funcionarioa_encontrados;
    }
    
    public static LinkedList<Cliente> listarClientes(LinkedList<Cliente> todos_clientes) {
        LinkedList<Cliente> clientes_encontrados = new LinkedList<Cliente>();
        for (Cliente iterado : todos_clientes) {
            clientes_encontrados.add(iterado);
        }
        return clientes_encontrados;
    }
    
    public static void addFuncionario(Funcionario f){
         Funcionario.funcionarios.add(f);
    }
    
    public static Administrador getAdministrador(int cc,List<Administrador> admins) {
        return admins.get(cc);
    }
    
    public static Administrador login(int cedula, String contrasena, ArrayList<Administrador> admins) {
        
        for(Administrador a: admins){
            if(a.getCedula()== cedula && a.getContrasena()==contrasena){
                return a;
            }
        }
       return null;

   }
```

### Clase Funcionario

```package gestorAplicacion;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Funcionario extends Usuario {
    
    private Long sueldo;
    private Long comision;
    
    public static List<Funcionario> funcionarios = new ArrayList<Funcionario>();
    
    public Funcionario(int cedula, String nombre, String correo, String contrasena, String direccion, Long sueldo, Long comision, Cliente clientes) {
        super(cedula, nombre, correo, contrasena, direccion);
        this.sueldo=sueldo;
        this.comision=comision;
    }

    public Long getSueldo() {
        return sueldo;
    }

    public void setSueldo(Long sueldo) {
        this.sueldo = sueldo;
    }

    public Long getComision() {
        return comision;
    }

    public void setComision(Long comision) {
        this.comision = comision;
    }


    public static LinkedList<Cliente> listarClientes(LinkedList<Cliente> todos_clientes) {
        LinkedList<Cliente> clientes_encontrados = new LinkedList<Cliente>();
        for (Cliente iterado : todos_clientes) {
            clientes_encontrados.add(iterado);
        }
        return clientes_encontrados;
    }
    
     public static LinkedList<Inmueble> listarInmuebles(LinkedList<Inmueble> todos_inmuebles){
         LinkedList<Inmueble> inmuebles_encontrados = new LinkedList<Inmueble>();
            for (Inmueble iterado : todos_inmuebles) {
                inmuebles_encontrados.add(iterado);
            }
            return inmuebles_encontrados;
        }
     public static void addCliente(Cliente p){
         Cliente.clientes.add(p);
        }
     public static void addContrato(Contrato p){
            Contrato.contratos.add(p);
        }
     public static Funcionario getFuncionario(int cc,List<Funcionario> funcionarios) {
            return funcionarios.get(cc);
        }
     public static Funcionario login(int cedula, String contrasena, ArrayList<Funcionario> Funcionarios) {
            
         for(Funcionario f: funcionarios){
             if(f.getCedula()== cedula && f.getContrasena()==contrasena){
                 return f;
             }
         }
        return null;

    }
}
```
## Capa de Interfaz de usuario

En la capa de interfaz de usuario lo que se tiene son las clases que permiten a un usuario interactual con el programa, ya que unas clases con los estados de los objetos y otras que permiten crear objetos quedan en el aire sin algun tipo de interacción. Por esa razón es necesario por el momento implementar una capa que al momento de ejecutar el programa se pueda acceder a el, ingresar opciones y navegar. En esta primera entrega es suficiente un menú generico por consola, ya que la implementación de interfaces gráficas es para otro nivel en la programacion orientada a objetos.

El paquete donde se encuentran las clases que realizan esta labor se denomina **uiMain**
y las clases son las siguientes:

### Clase Main o clase principal
```Aqui va el codigo```

### Clase OpciondeMenu
```Aqui va el codigo```

### Clase Menudeconsola
```Aqui va el codigo```


# FASE DE IMPLEMENTACIÓN

En la fase de implementación se muestra el funcionamiento del programa, puesto que al ser un programa en un muy bajo nivel es necesario ser traducido para que un lector pueda entender de que trata el mismo, además de explicar de forma detallada los procesos que se realizaron en cada uno de los códigos a groso modo. 


