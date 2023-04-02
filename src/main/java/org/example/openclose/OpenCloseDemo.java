package org.example.openclose;

import java.util.ArrayList;
import java.util.List;

public class OpenCloseDemo {
    public static void main(String[] args) {
        List<GeoObject> list = new ArrayList<>();
        list.add(new Cuboid(10, 10, 10));
        list.add(new Cuboid(20, 20, 20));
        list.add(new Sphere(10));

        System.out.println("total getTotalVolume: " + getTotalVolume(list));
    }

    public static int getTotalVolume(List<GeoObject> objects) {
        return objects.stream().mapToInt(GeoObject::getVolume).reduce(0, (a, b) -> a + b);
    }
}