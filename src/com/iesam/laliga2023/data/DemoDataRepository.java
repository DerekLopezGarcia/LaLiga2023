package com.iesam.laliga2023.data;

import com.iesam.laliga2023.domain.Demo;
import com.iesam.laliga2023.domain.DemoRepository;

public class DemoDataRepository implements DemoRepository {

    //Nota, crear este objeto como Singleton
    private DemoLocalDataSource localDataSource;

    @Override
    public Demo get(Integer demoId) {
        return localDataSource.findById(demoId);
    }

    @Override
    public void save(Demo demo) {
        localDataSource.save(demo);
    }
}
