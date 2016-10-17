package com.stam.store.model;

import java.util.Date;

/**
 * Created by Vito on 10/14/2016.
 */

public interface IFood extends IProduct {
    Date getExpDate();
    void setExpDate(Date date);

}
