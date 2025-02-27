# Caso 1: El cambio inesperado

```java
public class Report {

public void generateReport() { 
    System.out.println("Generando reporte...");
}


public void saveToDatabase() {
	System.out.println("Guardando reporte en la base de datos...");
}

public static void main(String[] args) { 
    Report report = new Report(); 
    report.generateReport(); 
    report.saveToDatabase();
	}
}
```

¿Qué problema tiene esta clase? ¿Qué principio SOLID no se cumple?

Rta: el problema que tiene esta clase es que tiene que hace todo y si llega a ocurrir un error en el generateReport() el programa colapsara y esto haciendo una violacion de Diseño Incorrecto (Viola SRP) 

Correcion del error:

```java
class Report {
    public void generateReport() { System.out.println("Generando reporte...");
    }
}
class reportSave {
    public static void saveToDatabase() {
        System.out.println("Guardando reporte en la base de datos...");
        }
    }
public class Main { 
        public static void main(String[] args) { 
            Report report = new Report(); 
            report.generateReport(); 
            reportSave.saveToDatabase();
    }
}

```

# Caso 2: La jerarquía desordenada

```java
class Bird {
	public void fly() { System.out.println("Puedo volar");
	}
}

class Penguin extends Bird { 
    @Override
	public void fly() {
		throw new UnsupportedOperationException("Los pingüinos no pueden volar");
	}
}

public class Main {
	public static void main(String[] args) { 
        Bird bird = new Bird();
        bird.fly();
        Bird penguin = new Penguin();
    	try {
    		penguin.fly();
    		} catch (UnsupportedOperationException e) {
    			System.out.println(e.getMessage());
    		}
    	}
    }	

```

¿Qué problema hay con esta jerarquía de clases? ¿Qué principio SOLID se está rompiendo?

Rta:Penguin hereda de Bird , pero no puede volar, sobreescritura de fly() con una excepcion y violando LSP

Correcion del error:

```java
interface Flyable {
        void fly();
}
class Bird {
        public void swim() {
             throw new UnsupportedOperationException("");
        }
}

class Penguin extends Bird { 
        public void swim() {
        	System.out.println("Penguin no volar...");
        }
}

public class Main {
        public static void main(String[] args) { 
        	Bird penguin = new Penguin();
            penguin.swim();
    	}
    }

```





























# Sistema de Gestión de Pedidos en una Tienda Online (Violación de SOLID)

## Contexto:

Una empresa de comercio electrónico quiere desarrollar un sistema de gestión de pedidos. El equipo de desarrollo ha implementado la siguiente solución inicial:

```java
class Order {
    public void processOrder() {
        System.out.println("Procesando el pedido...");
    }
    public void generateInvoice() {
        System.out.println("Generando la factura...");
    }
    public void sendEmailConfirmation() {
        System.out.println("Enviando confirmación por correo...");
    }
    public void saveToDatabase() {
       	System.out.println("Guardando pedido en la base de datos...");
    }
}
public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.processOrder();
        order.generateInvoice();
        order.sendEmailConfirmation();
        order.saveToDatabase();
    }
} 
```

## Solución : Que principio se aplica?

este código de esta empresa no logra aplicar ninguna de los principios de SOLID y violando SRP al tener todos los datos en una sola clases generando una dependencia de esta clase

```java
class Order {
    public void processOrder() {
        System.out.println("Procesando el pedido...");
    }
}

class Invoice {
    public void generateInvoice() {
        System.out.println("Generando la factura...");
    }
}

class EmailService {
    public void sendEmailConfirmation() {
        System.out.println("Enviando confirmación por correo...");
    }
}

class Database {
    public void saveToDatabase() {
        System.out.println("Guardando pedido en la base de datos...");
    }
}

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        Invoice invoice = new Invoice();
        EmailService emailService = new EmailService();
        Database database = new Database();

        order.processOrder();
        invoice.generateInvoice();
        emailService.sendEmailConfirmation();
        database.saveToDatabase();
    }
}

```

----------

```java
package com.example;

interface IntOrder {
    void sendMessage(String message);
}

class Order implements IntOrder {
    @Override
    public void sendMessage(String message) {
        System.out.println("Procesando el pedido..." );
    } 
        
}
public class vares {
        public static void main(String[] args) {
            Order order = new Order();
            order.sendMessage(null);
    }
}
```

## Solución : Que principio se aplica?

Este codigo incumple con el principio SOLID de DIP porque

------

```java
interface OrderRepository {
    void save(Order order);
}
class DatabaseOrderRepository implements OrderRepository {
    @Override
    public void save(Order order) {
        System.out.println("Guardando pedido en la base de datos...");
    }
}
class Order {
    // Aquí podrías definir atributos y métodos para la clase Order
}
```

## Solción : Que principio se aplica?

Se esta aplicando de manera correcta el principio 







