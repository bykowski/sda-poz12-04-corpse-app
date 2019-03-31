package pl.bykowski.springbootdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorpseApi {

    private CorpseRepo corpseRepo;

    @Autowired
    public CorpseApi(CorpseRepo corpseRepo) {
        this.corpseRepo = corpseRepo;
    }

    @GetMapping("/show")
    public Iterable<Corpse> show() {
        return corpseRepo.findAll();
    }
}
