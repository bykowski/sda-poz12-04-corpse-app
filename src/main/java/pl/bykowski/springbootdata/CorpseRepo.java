package pl.bykowski.springbootdata;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorpseRepo extends CrudRepository<Corpse, Long> {
}
