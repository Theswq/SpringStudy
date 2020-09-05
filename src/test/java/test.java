import com.swq.bean.Book;
import com.swq.bean.Orders;
import com.swq.bean.User;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

public class test {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.swq.*");
        User user = (User) applicationContext.getBean("User");
        user.add();
    }

    @Test
    public void test02(){
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("bean.xml");
        User user = (User) context.getBean("user");
        user.add();

    }
    @Test
    public void test03(){
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("bean.xml");
        Book book = (Book) context.getBean("book");
        System.out.println(book);

    }
    @Test
    public void test04(){
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("bean.xml");
        Orders orders = (Orders) context.getBean("orders");
        System.out.println(orders);

    }

}
