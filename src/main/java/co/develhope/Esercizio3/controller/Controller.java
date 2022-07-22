package co.develhope.Esercizio3.controller;


import co.develhope.Esercizio3.services.MyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class Controller {

private MyServices myServices;


@Autowired
public Controller(MyServices myServices){
    this.myServices=myServices;
    System.out.println("my controller constructor ");
}

@GetMapping("/getName")
    public String helloController(){
    return myServices.getName();
}

}
