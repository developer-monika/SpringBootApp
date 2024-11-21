package com.bakery.Alice.And.Bakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.type",havingValue = "chocolate")
public class ChocolateFrosting implements Frosting{
    @Override
    public void getFrosting() {
        System.out.println("this is chocklate frosting");
    }
}
