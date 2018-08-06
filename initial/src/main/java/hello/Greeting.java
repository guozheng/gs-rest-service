package hello;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Objects;

/**
 * Created by gzge. All Rights Reserved
 */
@Data
public class Greeting {
    private final long id;
    private final String content;
}
