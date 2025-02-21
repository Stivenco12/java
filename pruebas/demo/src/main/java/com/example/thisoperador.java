package com.example;

class A {
    void mostrar(B obj) {
        System.out.println("Método de A llamado desde B");
    }
}
class B {
    void llamarA(A obj) {
        obj.mostrar(this); // Se pasa el objeto B como argumento
    }
}
public class thisoperador {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        b.llamarA(a); // Salida: Método de A llamado desde B
    }
}