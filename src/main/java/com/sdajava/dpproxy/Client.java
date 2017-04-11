package com.sdajava.dpproxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by RENT on 2017-04-11.
 */
public class Client implements User {

    private String name;
    private String lastname;
    List<Client> clientLists = new ArrayList<>();

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getLastName() {
        return this.lastname;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    @Override
    public void save() {
        clientLists.add(this);
    }

    @Override
    public void delete() {
        clientLists.remove(this);
    }
}
