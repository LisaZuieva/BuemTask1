package buem.zui.summerschooltheater.service.simple.impls;

import buem.zui.summerschooltheater.model.Simple;
import buem.zui.summerschooltheater.repository.SimpleFakeRepository;
import buem.zui.summerschooltheater.service.simple.interfaces.ISimpleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class SimpleServiceImpl implements ISimpleService {

    @Autowired
    SimpleFakeRepository repository;

    @Override
    public Simple create(Simple simple) {
        return repository.save(simple);
    }

    @Override
    public Simple update(Simple simple) {
        return repository.update(simple);
    }

    @Override
    public Simple get(String id) {
        return repository.findById(id);
    }

    @Override
    public Simple delete(String id) {
        return repository.deleteById(id);
    }

    @Override
    public List<Simple> getAll() {
        return repository.findAll();
    }
}
