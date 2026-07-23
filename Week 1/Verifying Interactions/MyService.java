package com.example;

public class MyService {
    private ExternalApi api;

    public MyService(ExternalApi api) {
        this.api = api;
    }

    public void execute(String msg) {
        api.processData(msg);
    }
}
