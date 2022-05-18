package mx.com.leonrv3.materialexamplespring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.com.leonrv3.materialexamplespring.domain.HotDog;

@Repository
public interface HotDogRepository extends CrudRepository<HotDog, Long>{
}
