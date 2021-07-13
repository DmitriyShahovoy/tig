package online.prjctr.hsa.spring.user.repositories.mongo;

import online.prjctr.hsa.spring.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserMongoRepository extends MongoRepository<User, String> {

    List<User> findByName(@Param("name") String name);
}
