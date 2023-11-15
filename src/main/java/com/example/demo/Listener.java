package com.example.demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class Listener {

    @RabbitListener(queues = "json_cola")
    public void consumirTransaccion(TransaccionDTO transaccionDTO){
        System.out.println("Se recibicio transacción ->" + transaccionDTO.toString());
    }
}
