import com.selfstudy.dao.UserDaoImpl;
import com.selfstudy.dao.UserDaoMysqlImpl;
import com.selfstudy.dao.UserDaoOracleImpl;
import service.UserService;
import service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {

        //用戶實際調用的是業務層，dao層他們不需要接觸
        UserService userService = new UserServiceImpl();

        ((UserServiceImpl)userService).setUserDao(new UserDaoOracleImpl());
        userService.getUser();

    }
}
