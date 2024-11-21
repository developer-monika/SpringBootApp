package com.bakery.Alice.And.Bakery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class CakeBacker {

    @Autowired
    private  Syrup srp;

    @Autowired
    private  Frosting frs;

    public void backcake(){
        srp.getSyrup();
        frs.getFrosting();
        System.out.println("Backing the cake ...");
    }





}
