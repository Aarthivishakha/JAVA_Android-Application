package com.aarthivishakha.androidapp;

public final class GreetingService {
    public String greet(String name) {
        String clean = name == null ? "" : name.trim();
        return clean.isEmpty() ? "Hello, Android!" : "Hello, " + clean + "!";
    }
}
