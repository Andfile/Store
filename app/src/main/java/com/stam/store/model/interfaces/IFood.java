package com.stam.store.model.interfaces;

import java.util.Date;

/**
 * Created by Andfile on 10/14/2016.
 */

public interface IFood extends IProduct {

    Date getExpDate();
    void setExpDate(Date date);

}
