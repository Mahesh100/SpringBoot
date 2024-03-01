package com.SpringBoot.Practice.Annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Cricket implements  Sports{

   // @Qualifier("cricket")
    @Autowired
    Sports sports;

    @Override
    public String play() {
        return "Playing Cricket";
    }
//    public static void main(String [] args){
//        Cricket c = new Cricket();
//        c.play();
//    }

}
