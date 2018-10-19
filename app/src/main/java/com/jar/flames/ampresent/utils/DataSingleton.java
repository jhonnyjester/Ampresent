package com.jar.flames.ampresent.utils;

class DataSingleton {
    private static final DataSingleton ourInstance = new DataSingleton();

    static DataSingleton getInstance() {
        return ourInstance;
    }

    private DataSingleton() {
    }
}
