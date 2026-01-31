package com.tyre;

import org.springframework.stereotype.Component;
import com.tyre.Tyre;

@Component("ceatTyreBean")
public class CeatTyre extends Tyre {
    public CeatTyre() {
        super(123, "CE_123", "robust");
    }
}