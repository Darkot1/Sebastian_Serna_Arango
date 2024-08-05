package com.riwi.persistence.imodel;

import com.riwi.entities.Coder;
import com.riwi.persistence.crud.CreateModel;
import com.riwi.persistence.crud.DeleteModel;

public interface ICoderModel extends CreateModel<Coder>, DeleteModel<Integer> {
}
