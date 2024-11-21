package com.bakery.Alice.And.Bakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.type",havingValue = "Strawberry")
public class StrawberryFrosting implements  Frosting{
    @Override
    public void getFrosting() {
        System.out.println("this is StrawberryFrosting");
    }
}
