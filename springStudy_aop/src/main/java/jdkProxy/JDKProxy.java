package jdkProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

// jdk动态代理，实现接口实现类
public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();

        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
//        int result = dao.add(1,2);
//        System.out.println("result"+ result);

        String swq = dao.update("com.swq");
        System.out.println(swq);
    }
}

/**
 * 创建代理对象代码
 */
class UserDaoProxy implements InvocationHandler{

    //1.创建的是谁的代理对象，把谁传过来
    private UserDao userDao;
    //设置代理类的构造函数
    public  UserDaoProxy(UserDao userDao){
        this.userDao = userDao;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //方法之前,通知
        System.out.println("方法执行之前。。。。。。"+method.getName()+"传入的参数是"+ Arrays.toString(args));

       //被增强的方法执行
        Object invoke =  method.invoke(userDao, args);

        //方法之后执行,通知
        System.out.println("方法之后执行");
        return invoke;
    }
}