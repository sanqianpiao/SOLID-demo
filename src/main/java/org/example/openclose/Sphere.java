package org.example.openclose;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Sphere implements GeoObject {

    private int radius;

    @Override
    public int getVolume() {
        return (int) ((4.0 / 3) * Math.PI * radius * radius * radius);
    }
}
