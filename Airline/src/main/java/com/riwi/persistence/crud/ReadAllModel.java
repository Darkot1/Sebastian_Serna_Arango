package com.riwi.persistence.crud;

import java.util.ArrayList;

public interface ReadAllModel <Entity>{
    ArrayList<Entity> readAll(String name);
}
