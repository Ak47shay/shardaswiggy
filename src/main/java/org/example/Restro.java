package org.example;

import java.io.IOException;

public class Restro {

    private String restroId;
    public String restroName;
    public Restro(String restroId, String s) throws IOException {
            this.restroId = restroId;
            this.restroName = restroName;
    }

    public String getRestroId() {
        return restroId;
    }

    public void setRestroId(String restroId) {
        this.restroId = restroId;
    }

    public String getRestroName() {
        return restroName;
    }

    public void setRestroName(String restroName) {
        this.restroName = restroName;
    }
}
