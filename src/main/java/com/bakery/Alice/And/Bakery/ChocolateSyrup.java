package com.bakery.Alice.And.Bakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.type",havingValue = "chocolate")
public class ChocolateSyrup implements Syrup {
    @Override
    public void getSyrup() {
        System.out.println("This is Choklate syrup");
    }
}
