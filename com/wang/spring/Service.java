package com.wang.spring;

public class Service {
    private userDAo userDAo;

    public Service(com.wang.spring.userDAo userDAo) {
        this.userDAo = userDAo;
    }

    public com.wang.spring.userDAo getUserDAo() {
        return userDAo;
    }

    public void setUserDAo(com.wang.spring.userDAo userDAo) {
        this.userDAo = userDAo;
    }

    @Override
    public String toString() {
        return "Service{" +
                "userDAo=" + userDAo +
                '}';
    }
}
