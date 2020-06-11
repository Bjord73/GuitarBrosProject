package Base;

import com.patterns.abstractfactory.GuitarStrings;

public interface GuitarInterface {

    GuitarColor getColor();
    GuitarStrings getStrings();

    float getPrice();

    long getUpcCount();

    long getSerialUPC();

    String getFretBoard();
}
