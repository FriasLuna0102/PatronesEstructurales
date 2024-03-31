package org.example.PatronesEstructurales.Flyweight;

import java.util.HashMap;
import java.util.Map;

// FlyweightFactory que maneja la creación y gestión de objetos Flyweight
class TextFormatFactory {
    private Map<String, TextFormat> formatMap = new HashMap<>();

    public TextFormat getFormat(String name, int size) {
        String key = name + "_" + size;
        if (!formatMap.containsKey(key)) {
            formatMap.put(key, new FontSize(name, size));
        }
        return formatMap.get(key);
    }
}
