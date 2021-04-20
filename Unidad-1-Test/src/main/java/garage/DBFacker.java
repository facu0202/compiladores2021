package garage;

import java.util.HashMap;
import java.util.Map;

public class DBFacker implements GarageDB {
    private Map<Integer, Object> objects = new HashMap() {{
        put(1, null);
        put(2, null);
        put(3, null);
    }};

    public Object save(Integer position, Object o) {
        if (!objects.containsKey(position)) {
            throw new RuntimeException("No existe esa posicion");
        }

        if (objects.get(position) != null) {
            throw new RuntimeException("ya existe un auto en esa posicion");
        }

        objects.put(position, o);
        return o;


    }
}
