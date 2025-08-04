package com.mycompany.exercicioenums;

import java.util.Date;
import entities.Order;
import enums.OrderStatus;

public class ExercicioEnums {

    public static void main(String[] args) {
            
        System.out.println(OrderStatus.DELIVERED);//da pra simplesmente printar o enum
        
        Order order = new Order(1080, new Date(), OrderStatus.PENDIN_PAYMENT);//transforma o enum em string com base no nome dele
        
        
        //usando o value Of
        
        Integer numero = Integer.valueOf("40");
        int number = Integer.valueOf("20");
        
        //STRING PARA ENUM
        
        //converte o string_deliveres para o tipo orderStatus e o armazena no order2 por meio do valueOf
        OrderStatus order2 = OrderStatus.valueOf("DELIVERED");
        
        System.out.println(order2);
        
    }
}
