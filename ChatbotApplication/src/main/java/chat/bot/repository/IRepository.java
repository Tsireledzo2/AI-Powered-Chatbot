package chat.bot.repository;

import java.util.List;
import java.util.Optional;

public interface IRepository <objectType, t> {
    //crud
    void save(objectType objectType);

    Optional findById(t t);

    List findAll();

    void delete(t t);
}
