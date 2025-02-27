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