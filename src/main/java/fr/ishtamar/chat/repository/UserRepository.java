package fr.ishtamar.chat.repository;

import fr.ishtamar.chat.model.Status;
import fr.ishtamar.chat.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UserRepository  extends MongoRepository<User, String> {
    List<User> findAllByStatus(Status status);
}
