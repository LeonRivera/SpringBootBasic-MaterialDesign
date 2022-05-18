package mx.com.leonrv3.materialexamplespring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.com.leonrv3.materialexamplespring.domain.HotDog;
import mx.com.leonrv3.materialexamplespring.repository.HotDogRepository;

@Service
public class HotDogServiceImpl implements IHotDogService{
    

    @Autowired
    HotDogRepository hotDogRepository;

    @Override
    public List<HotDog> listar() {
        return (List<HotDog>) hotDogRepository.findAll();
    }

    @Override
    public void save(HotDog hotDog) {
        hotDogRepository.save(hotDog);
    }


}
