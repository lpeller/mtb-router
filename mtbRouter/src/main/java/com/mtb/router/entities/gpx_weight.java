package com.mtb.router.entities;

import com.graphhopper.routing.ev.IntEncodedValue;
import com.graphhopper.routing.ev.IntEncodedValueImpl;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "otrouting_ways")
public class gpx_weight {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "gpx_weight")
    public static Integer weight;
    public static final String KEY = "gpx_weight";

    public static IntEncodedValue create() {
        return new IntEncodedValueImpl(KEY, 3, false);
    }

}
