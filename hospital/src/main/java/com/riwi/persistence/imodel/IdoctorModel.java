package com.riwi.persistence.imodel;

import com.riwi.entities.Doctor;

import com.riwi.persistence.crud.CreateModel;
import com.riwi.persistence.crud.DeleteModel;
import com.riwi.persistence.crud.ReadAllforIdModel;

public interface IdoctorModel extends CreateModel<Doctor>, DeleteModel<Integer>, ReadAllforIdModel<Doctor>{

}
