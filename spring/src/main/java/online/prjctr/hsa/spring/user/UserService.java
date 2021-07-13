package online.prjctr.hsa.spring.user;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import online.prjctr.hsa.spring.user.repositories.elastic.UserElasticRepository;
import online.prjctr.hsa.spring.user.repositories.mongo.UserMongoRepository;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserMongoRepository umr;
    private final UserElasticRepository uer;

    public void save(User user){
        umr.save(user);
        uer.save(user);
    }

    @SneakyThrows
    public void find(){

        // fetch all users from Mongo
        System.out.println("Users found in MongoDB with findAll():");
        System.out.println("-----------------------------------------");
        Iterable<User> articles = umr.findAll();
        articles.forEach(System.out::println);
        System.out.println();

        System.out.println("Users found in Elasticsearch with findAll():");
        System.out.println("-----------------------------------------------");
        articles = uer.findAll();
        articles.forEach(System.out::println);
        System.out.println();
    }
}
