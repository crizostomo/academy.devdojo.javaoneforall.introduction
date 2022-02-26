package academy.devdojo.javaoneforall.javacore.ZZIjdbc.domain;

//257 - JDBC pt 06 - Insering data with Statement
//258 - JDBC pt 07 - Lombok and Log4J2

import lombok.Builder;
import lombok.Value;

import java.util.Objects;

@Value
@Builder
public final class Producer {
    private final Integer id;
    private final String name;

}
