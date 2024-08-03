package com.riwi.persistence.crud;

import java.util.ArrayList;

public interface ReadAllByIdModel <Entity>{
    ArrayList<Entity> readAll(Integer id);
}
