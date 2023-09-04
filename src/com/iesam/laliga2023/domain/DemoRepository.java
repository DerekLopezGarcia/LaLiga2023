package com.iesam.laliga2023.domain;

public interface DemoRepository {
    public Demo get(Integer demoId);
    public void save(Demo demo);
}
