package buem.zui.summerschooltheater.controller.api;

import buem.zui.summerschooltheater.model.Simple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping("/api/v1/items")
@RestController
public class SimpleRest {

    @Autowired
    SimpleRest service;

    @GetMapping("")
    public List<Simple> showAll() {return service.getAll();}


    public Simple showOne(@PathVariable String id){
        return service.get(id);
    }

    Simple simple = new Simple("1", "first", "desc1", LocalDateTime.now(), LocalDateTime.now());

    @RequestMapping("/ex")
    public Simple showExample(){
        return simple;
    }
}
