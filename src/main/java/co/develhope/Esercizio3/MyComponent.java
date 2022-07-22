package co.develhope.Esercizio3;

import lombok.Data;
import org.springframework.stereotype.Component;



@Component
public class MyComponent {


    private String myComponentName;


    public MyComponent(){
        this.myComponentName="matteo";
        System.out.println("my name ");
        System.out.println("my component constructor");
    }

    public String getMyComponentName() {
        return myComponentName;
    }

}
