package com.riwi.persistence.imodel;

import com.riwi.entities.Reservation;
import com.riwi.persistence.crud.CreateModel;
import com.riwi.persistence.crud.DeleteModel;
import com.riwi.persistence.crud.ReadAllByIdModel;

import javax.swing.text.html.parser.Entity;

public interface IreservationModel extends CreateModel<Reservation>, DeleteModel<Integer>, ReadAllByIdModel<Reservation> {
}
