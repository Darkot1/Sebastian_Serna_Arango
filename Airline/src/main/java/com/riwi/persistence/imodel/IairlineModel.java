package com.riwi.persistence.imodel;

import com.riwi.entities.Airline;
import com.riwi.persistence.crud.CreateModel;
import com.riwi.persistence.crud.DeleteModel;


public interface IairlineModel extends CreateModel<Airline>, DeleteModel<Integer> {
}
