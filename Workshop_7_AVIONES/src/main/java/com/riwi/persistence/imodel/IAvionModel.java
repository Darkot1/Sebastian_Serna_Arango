package com.riwi.persistence.imodel;

import com.riwi.entities.Avion;
import com.riwi.persistence.crud.CreateModel;
import com.riwi.persistence.crud.DeleteModel;

public interface IAvionModel extends CreateModel<Avion>, DeleteModel<Integer> {



}
