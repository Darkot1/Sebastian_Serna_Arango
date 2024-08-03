package com.riwi.persistence.imodel;

import com.riwi.entities.Flight;
import com.riwi.persistence.crud.CreateModel;
import com.riwi.persistence.crud.DeleteModel;
import com.riwi.persistence.crud.ReadAllModel;
import com.riwi.persistence.crud.UpdateModel;


public interface IflightModel extends CreateModel<Flight>, DeleteModel<Integer>, ReadAllModel<Flight>, UpdateModel<Flight> {
}
