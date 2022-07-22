package co.develhope.Esercizio3.services;


import co.develhope.Esercizio3.MyComponent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class MyServices {

  private MyComponent myComponent;

    @Autowired
    public MyServices(MyComponent myComponent){
      this.myComponent=myComponent;
      System.out.println("my services constructor");
    }

  public String getName(){
    return myComponent.getMyComponentName();
  }
}
