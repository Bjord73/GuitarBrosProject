package com.guitarbros.java;

import com.guitarbros.java.AbstractGuitar;
import com.guitarbros.java.GuitarColor;
import com.guitarbros.java.GuitarStrings;

public abstract class AbstractAcoustic extends AbstractGuitar {
    protected AbstractAcoustic(GuitarStrings strings, GuitarColor color) {
        super(strings, color);
    }

    protected AbstractAcoustic() {
        this(GuitarStrings.steel, GuitarColor.solid);
    }
}
