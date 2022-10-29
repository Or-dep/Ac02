package com.example.acs.model;


import java.io.Serializable;

public class PassaDados implements Serializable {

    private long id;
    private String escrito1;
    private String escrito2;
    private String escrito3;
    private String escrito4;
    private String escrito5;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEscrito1() {
        return escrito1;
    }

    public void setEscrito1(String escrito1) {
        this.escrito1 = escrito1;
    }

    public String getEscrito2() {
        return escrito2;
    }

    public void setEscrito2(String escrito2) {
        this.escrito2 = escrito2;
    }

    public String getEscrito3() {
        return escrito3;
    }

    public void setEscrito3(String escrito3) {
        this.escrito3 = escrito3;
    }

    public String getEscrito4() {
        return escrito4;
    }

    public void setEscrito4(String escrito4) {
        this.escrito4 = escrito4;
    }

    public String getEscrito5() {
        return escrito5;
    }

    public void setEscrito5(String escrito5) {
        this.escrito5 = escrito5;
    }
}
