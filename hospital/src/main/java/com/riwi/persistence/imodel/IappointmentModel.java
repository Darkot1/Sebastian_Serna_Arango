package com.riwi.persistence.imodel;

import com.riwi.entities.Appointment;
import com.riwi.persistence.crud.CreateModel;
import com.riwi.persistence.crud.DeleteModel;
import com.riwi.persistence.crud.ReadForDateModel;
import com.riwi.persistence.crud.UpdateDateModel;

public interface IappointmentModel extends CreateModel<Appointment>, DeleteModel<Integer>, ReadForDateModel<Appointment>, UpdateDateModel{

}
