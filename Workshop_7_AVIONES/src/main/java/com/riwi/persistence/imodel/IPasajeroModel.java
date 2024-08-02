package com.riwi.persistence.imodel;

import com.riwi.entities.Pasajero;
import com.riwi.persistence.crud.CreateModel;
import com.riwi.persistence.crud.DeleteModel;

public interface IPasajeroModel extends CreateModel<Pasajero>, DeleteModel<Integer> {
}
