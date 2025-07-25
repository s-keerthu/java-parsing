package com.example.json.types;

import com.example.json.Json;
import com.example.json.JsonReader;

import java.io.IOException;

public class JsonNull implements Json<Object> {
    public JsonNull(JsonReader reader) throws IOException {
        char []value = new char[3];
        reader.read(value);
        if(value[0] != 'u' || value[1] != 'l' || value[2] != 'l'){
            throw new IllegalArgumentException("not a null value");
        }
    }

    @Override
    public Object getValue() {
        return null;
    }
    @Override
    public String toString() {
        return "null";
    }
}


