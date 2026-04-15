package com.horrorcore.entities;

public class Example {
    {
        System.out.println("Instance 1"); // Third Instance
    }

    {
        System.out.println("Instance 2");
    }

    static {
        System.out.println("Static 1"); // static first
    }

    public Example() {
        System.out.println("Constructor 1"); // Constructor Second
    }
}
