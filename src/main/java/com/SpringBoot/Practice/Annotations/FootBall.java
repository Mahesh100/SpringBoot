package com.SpringBoot.Practice.Annotations;

import org.springframework.beans.factory.annotation.Autowired;

public class FootBall implements Sports{

    @Autowired
    Sports sports;
    @Override
    public  String play(){
        return "He is Playing football";

    }
}
