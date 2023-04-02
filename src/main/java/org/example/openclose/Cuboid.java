package org.example.openclose;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cuboid implements GeoObject {
    private int length;
    private int depth;
    private int height;

    @Override
    public int getVolume() {
        return length * depth * height;
    }
}
