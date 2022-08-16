package com.graphhopper.routing.ev;

public class CustomEncodedValueFactory implements EncodedValueFactory {

    @Override
    public EncodedValue create(String encodedValueString) {

        final EncodedValue enc;
        String name = encodedValueString.split("\\|")[0];

        if (name.isEmpty())
            throw new IllegalArgumentException("To load EncodedValue a name is required. " + encodedValueString);
        if(gpx_weight.KEY.equals(name)) {
            enc = gpx_weight.create();
        }else {
            throw new IllegalArgumentException("DefaultEncodedValueFactory cannot find EncodedValue " + name);
        }
        return enc;
    }

}

