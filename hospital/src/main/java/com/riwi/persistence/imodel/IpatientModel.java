package com.riwi.persistence.imodel;

import com.riwi.entities.Patient;
import com.riwi.persistence.crud.CreateModel;
import com.riwi.persistence.crud.DeleteModel;
import com.riwi.persistence.crud.ReadForString;
import com.riwi.persistence.crud.UpdateModel;

public interface IpatientModel extends CreateModel<Patient>, DeleteModel<Integer>, ReadForString<Patient>, UpdateModel<Patient>{

}
