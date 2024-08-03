package com.riwi.persistence.imodel;

import com.riwi.entities.Passenger;
import com.riwi.persistence.crud.CreateModel;
import com.riwi.persistence.crud.DeleteModel;
import com.riwi.persistence.crud.ReadAllModel;

public interface IpassengerModel extends CreateModel<Passenger>, DeleteModel<Integer>, ReadAllModel<Passenger> {
}
