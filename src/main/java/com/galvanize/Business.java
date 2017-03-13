package com.galvanize;

import java.util.ArrayList;

public class Business implements Addressable {
    private final String name;
    private final ArrayList<Address> addresses;

    public Business(String name) {
        this.name = name;
        this.addresses = new ArrayList<Address>();
    }

    public String getName() {
        return name;
    }

    @Override
    public void addAddress(Address address) {
        addresses.add(address);
    }

    @Override
    public ArrayList<Address> getAddresses() {
        return addresses;
    }
}