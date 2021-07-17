import com.selfstudy.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        // 獲取ApplicationContext  通過配置文件 拿到spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 需要什麼 就直接get什麼
        UserServiceImpl userServiceImpl = (UserServiceImpl)context.getBean("UserServiceImpl");

        userServiceImpl.getUser();
    }
}
