package cho.restapi.restapiedu.events;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class EventTest {

    @Test
    public void builder() {

        Event event = Event.builder()
                .name("Inflearn Spring REST APT")
                .description("REST APT development with Spring")
                .build();
        Assertions.assertThat(event).isNotNull();
    }

    @Test
    public void javaBean() {

        // Given
        String name = "Event";
        String desctiption = "Spring";

        // When
        Event event = new Event();
        event.setName(name);
        event.setDescription(desctiption);

        // Then
        Assertions.assertThat(event.getName()).isEqualTo(name);
        Assertions.assertThat(event.getDescription()).isEqualTo(desctiption);
    }
}