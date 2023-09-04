package com.iesam.laliga2023.domain;

public class CreateDemoUseCase {

    private DemoRepository demoRepository;

    public CreateDemoUseCase( DemoRepository demoRepository){
        this.demoRepository = demoRepository;
    }

    public void execute(Demo demo){
        demoRepository.save(demo);
    }
}
