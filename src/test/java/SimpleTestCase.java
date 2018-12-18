import controllers.UserController;
import models.User;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleTestCase {
    private UserController userController;

    @BeforeTest
    public void setUp() {
         userController = new UserController();
    }

    @Test
    public void testUserInfoResponse() {
        User remoteUser = userController.getUserByUsername("VladislavRebus");
        Assert.assertTrue(remoteUser.getHtml_url().contains("https://github.com/VladislavRebus"));
    }

    @Test
    public void testFollowers() {
        User[] followers = userController.getFollowersByUser("VladislavRebus");
        Assert.assertEquals(followers.length, 0);
        System.out.println("окончание");

    }
}

//проверка на ноль так, как у меня пока никого на Git в followers