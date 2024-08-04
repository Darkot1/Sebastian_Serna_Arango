package com.riwi.persistence.crud;

import java.util.ArrayList;

public interface ReadAllforIdModel <Entity>{

    ArrayList<Entity> readAllForId(Integer id);
}
