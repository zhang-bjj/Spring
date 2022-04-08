package com.bjj;

public class BService {

    BProperties bProperties;

    public BProperties getBjjProperties() {
        return bProperties;
    }

    public void setBProperties(BProperties bProperties) {
        this.bProperties = bProperties;
    }

    public String sayHello(String name){
        return bProperties.getPrefix() + name + bProperties.getSuffix();
    }

}
