import com.example.demo.model.User1;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@Test
public void save_shouldReturnSuccessMessage_whenValidUserObjectIsProvided() {


    User1 user1 = new User1("testUser", "testPassword", "ROLE_USER");
    when(user1Service.save(any(User1.class))).thenReturn("User saved successfully");

    // When
    ResponseEntity<String> response = user1Controller.save(user1);

    // Then
    assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    assertThat(response.getBody()).isEqualTo("User saved successfully");





}