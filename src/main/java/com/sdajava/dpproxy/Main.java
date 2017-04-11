package com.sdajava.dpproxy;

import javax.jws.soap.SOAPBinding;

public class Main {

    public static void main(String[] args) {
	// write your code here
        User user1 = new Proxy();

        user1.setName("Karo");
        user1.setLastName("Mockito");
        user1.save();
    }
}
