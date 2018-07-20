package hello;

import org.json.JSONException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.concretepage.MyApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ArticleControllerTest {

	@LocalServerPort
	private int port;

	private TestRestTemplate restTemplate = new TestRestTemplate();

	HttpHeaders httpHeaders = new HttpHeaders();

	@Test
	public void createClient() throws JSONException {

		HttpEntity<String> entity = new HttpEntity<String>(null, httpHeaders);
		ResponseEntity<String> response = restTemplate.exchange(
				createURLWithPort("/user/article/1"), HttpMethod.GET, entity, String.class);

		String expected = "{ \"articleId\": 2, \"title\": \"Hibernate HQL \", \"category\": \"Hibernate\" }";
		//String expected = "{id:Course1,name:Spring,description:10 Steps}";
		JSONAssert.assertEquals(expected, response.getBody(), false);
	}

	private String createURLWithPort(String uri) {
		return "http://localhost:" + port + uri;
	}

}