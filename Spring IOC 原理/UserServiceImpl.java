package service;


import com.selfstudy.dao.UserDao;
import com.selfstudy.dao.UserDaoImpl;
import com.selfstudy.dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    //利用set進行動態實現值的注入
    //程序不再具有主動性，而是變成了被動的接受對象
    //不用再去管理對象的創建，控制反轉了，這就是IOC的原型。
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }


}
