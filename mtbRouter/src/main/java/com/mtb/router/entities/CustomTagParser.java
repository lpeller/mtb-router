package com.mtb.router.entities;

import com.graphhopper.reader.ReaderWay;
import com.graphhopper.routing.ev.EncodedValue;
import com.graphhopper.routing.ev.EncodedValueLookup;
import com.graphhopper.routing.ev.IntEncodedValue;
import com.graphhopper.routing.util.parsers.TagParser;
import com.graphhopper.storage.IntsRef;

import java.util.List;

public class CustomTagParser implements TagParser {

    private IntEncodedValue encodedValue;

    @Override
    public IntsRef handleWayTags(IntsRef edgeFlags, ReaderWay way, boolean ferry, IntsRef relationFlags){
        return null;
    }

    @Override
    public IntsRef handleWayTags(IntsRef edgeFlags, ReaderWay way, IntsRef relationFlags) {
        if (way.hasTag(gpx_weight.KEY)) {
            encodedValue.setInt(false, edgeFlags, gpx_weight.weight);
        }
        return edgeFlags;
    }

    CustomTagParser() {
        this.encodedValue = gpx_weight.create();
    }

    @Override
    public void createEncodedValues(EncodedValueLookup lookup, List<EncodedValue> registerNewEncodedValue) {
        registerNewEncodedValue.add(encodedValue = gpx_weight.create());
    }

}
