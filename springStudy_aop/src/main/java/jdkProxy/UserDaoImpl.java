package jdkProxy;

public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b){
        System.out.println("add方法执行 a+b "+(a+b) );
        return a+b;
    }

    @Override
    public String update(String id){
        System.out.println("update执行");
        return id+"1998";
    }
}


