package com.riwi.persistence.crud;

import java.sql.Date;

public interface UpdateDateModel{
    public void updateAppointmentDate(Integer idAppointment, Date newDate);
}
