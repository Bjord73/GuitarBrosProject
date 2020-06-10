package Base;

import com.patterns.abstractfactory.GuitarStrings;

public abstract class AbstractHybrid extends AbstractGuitar {
    protected AbstractHybrid(GuitarStrings strings, GuitarColor color) {
        super(strings, color);
    }

    protected AbstractHybrid() {
        this(GuitarStrings.steel, GuitarColor.solid);
    }
}
