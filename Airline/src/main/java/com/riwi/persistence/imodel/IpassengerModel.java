package com.riwi.persistence.imodel;

import com.riwi.entities.Passenger;
import com.riwi.persistence.crud.CreateModel;
import com.riwi.persistence.crud.DeleteModel;
import com.riwi.persistence.crud.ReadAllModel;
import com.riwi.persistence.crud.UpdateModel;

public interface IpassengerModel extends CreateModel<Passenger>, DeleteModel<Integer>, ReadAllModel<Passenger>, UpdateModel<Passenger>{
}
