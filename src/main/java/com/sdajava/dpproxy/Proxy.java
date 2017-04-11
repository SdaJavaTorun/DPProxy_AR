package com.sdajava.dpproxy;

/**
 * Created by RENT on 2017-04-11.
 */
public class Proxy implements User {

    private Client client;

    public Proxy() {
        this.client = new Client();
    }

    @Override
    public String getName() {
        return this.client.getName();
    }

    @Override
    public void setName(String name) {
        this.client.setName(name);
    }

    @Override
    public String getLastName() {
        return this.client.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        this.client.setLastName(lastName);
    }

    @Override
    public void save() {
        this.client.save();
    }

    @Override
    public void delete() {
        this.client.delete();
    }
}
