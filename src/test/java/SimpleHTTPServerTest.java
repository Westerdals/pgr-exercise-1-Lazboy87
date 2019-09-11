import no.kristiania.httpClient;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleHTTPServerTest {

@Test
  void shouldReadStatusCode()throws IOException {
  httpClient client = new httpClient("urlecho.appspot.com");
  client.executeRequest();
  assertEquals(200,client.getStatusCode());


}
}
