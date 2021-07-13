package online.prjctr.hsa.spring.user.repositories.elastic;

import online.prjctr.hsa.spring.user.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserElasticRepository extends ElasticsearchRepository<User, String> {

}
