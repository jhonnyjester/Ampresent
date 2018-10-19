package com.jar.flames.ampresent.utils;

class NetworkSingleton {
    private static final NetworkSingleton ourInstance = new NetworkSingleton();

    static NetworkSingleton getInstance() {
        return ourInstance;
    }

    private NetworkSingleton() {
    }
}
