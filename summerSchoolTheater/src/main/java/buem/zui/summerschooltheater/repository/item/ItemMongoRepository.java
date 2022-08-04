package buem.zui.summerschooltheater.repository.item;

import buem.zui.summerschooltheater.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface ItemMongoRepository extends MongoRepository<Item, String> {
    List<Item> findAllByCreateAtAfterAndName(LocalDateTime date, String name);
}
