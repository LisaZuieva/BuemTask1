package buem.zui.summerschooltheater.repository;

import buem.zui.summerschooltheater.model.Simple;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Repository
public class SimpleFakeRepository {

    private LocalDateTime now = LocalDateTime.now();
    private List<Simple> simple = List.of(
            new Simple("1", "first", "desc1",now, now),
            new Simple("2", "second", "desc2",now, now),
            new Simple("3", "third", "desc3",now, now),
            new Simple("4", "fourth", "desc4",now, now)
    );

    public List<Simple> findAll(){
        return this.simple;
    }

    public Simple findById(String id) {
        return this.simple.stream().filter(simple -> simple.getId().equals(id))
                .findFirst().orElse(null);
    }

    public Simple update(Simple simple) {
        this.deleteById(simple.getId());

        this.simple.add(simple);
        return simple;
    }

    public Simple deleteById(String id) {
        Simple simple1 = this.findById(id);
        this.simple.remove(simple);
    }

    public Simple save(Simple simple) {
        simple.setId(UUID.randomUUID().toString());
        simple.
        this.simple.add(simple)
        return simple;
    }
}
