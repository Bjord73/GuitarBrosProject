package Base;

import com.patterns.abstractfactory.GuitarStrings;

public abstract class AbstractElectric extends AbstractGuitar {

    protected AbstractElectric(GuitarStrings strings, GuitarColor color) {
        super(strings, color);
    }

    protected AbstractElectric() {
        this(GuitarStrings.steel, GuitarColor.solid);
    }


}
