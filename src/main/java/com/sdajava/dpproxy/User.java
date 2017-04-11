package com.sdajava.dpproxy;

/**
 * Created by RENT on 2017-04-11.
 */
public interface User {

    public String getName();
    public void setName(String name);
    public String getLastName();
    public void setLastName(String lastName);
    public void save();
    public void delete();
}
