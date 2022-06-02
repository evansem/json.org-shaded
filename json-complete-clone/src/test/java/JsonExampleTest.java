import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JsonExampleTest {

    @Test
    public void personIsMick() {
        assertEquals("Mick",JsonExample.createJSON().get("name"));
    }
}