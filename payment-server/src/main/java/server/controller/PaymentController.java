package server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by alonia on 4/16/2018
 * *
 * All rigths reserved to DELL EMC
 */

@RestController
@RequestMapping(value = "/payments")
public class PaymentController {

    @GetMapping(value = "/message")
    public String sendMessage() {
        return "Hi, This is message from payment-service";
    }
}
