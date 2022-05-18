package mx.com.leonrv3.materialexamplespring.service;

import java.util.List;

import mx.com.leonrv3.materialexamplespring.domain.HotDog;

public interface IHotDogService {
    

    List<HotDog> listar();

    void save(HotDog hotDog);



}
