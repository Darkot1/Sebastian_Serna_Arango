package com.riwi.persistence.crud;

import java.sql.Date;
import java.util.ArrayList;


public interface ReadForDateModel<Entity> {

    ArrayList<Entity> readForDate(Date date);
}
