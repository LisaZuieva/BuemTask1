package buem.zui.summerschooltheater.service.simple.interfaces;

import buem.zui.summerschooltheater.model.Simple;

import java.util.List;

public interface ISimpleService {
    // 5 CRUD method
    Simple create(Simple simple);
    Simple update(Simple simple);
    Simple get(String id); // there is no read in java it's called get
    Simple delete(String id);
    List<Simple> getAll();

    //POJO - Plain Old Java Object
}