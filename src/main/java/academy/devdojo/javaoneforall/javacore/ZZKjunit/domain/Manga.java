package academy.devdojo.javaoneforall.javacore.ZZKjunit.domain;

//283 - Record Class

import java.util.Objects;

public record Manga(String name, int episodes) {
    public Manga { //Alt + Inset ---> Constructor ---> Compact
        Objects.requireNonNull(name);
    }
}
