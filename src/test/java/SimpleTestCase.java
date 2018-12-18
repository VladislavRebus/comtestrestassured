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
        Assert.assertTrue(followers.length == 0);

    }
}
