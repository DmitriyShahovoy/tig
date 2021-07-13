package online.prjctr.hsa.spring.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@NoArgsConstructor
@Document(indexName = "users")
public class User {

    @Id
    private String id;

    private String name;

    public User(String name) {
        this.name = name;
    }
}
