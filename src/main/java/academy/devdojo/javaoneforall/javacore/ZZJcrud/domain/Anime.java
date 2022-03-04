package academy.devdojo.javaoneforall.javacore.ZZJcrud.domain;

//275 - JDBC pt 24 - Crud pt 01 - findByName and findAll

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class Anime {
    Integer id;
    String name;
    int episodes;
    Producer producer;
}
