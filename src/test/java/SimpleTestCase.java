import models.User;
import org.springframework.web.client.RestTemplate;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleTestCase {
    @Test
    public void testUserInfoResponse () {
        //RestTemplate позволяет делать различные запросы
        RestTemplate restTemplate = new RestTemplate();
        //здесь применили наш новоый созданный класс User Models
        User user = restTemplate.getForObject("https://api.github.com/users/VladislavRebus", User.class);
        //System.out.println(user);
        //проверка на соответсвие
        Assert.assertTrue(user.getHtml_url().contains("https://github.com/VladislavRebus"));

    }
}
