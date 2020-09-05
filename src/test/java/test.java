import com.swq.dao.emp;
import com.swq.dao.emp2;
import com.swq.dao2.stu;
import com.swq.test.Book;
import com.swq.test.Orders;
import com.swq.test.User;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

    @Test
    public void test05(){
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("bean2.xml");
        emp emp = (emp) context.getBean("emp");
        System.out.println(emp.toString());
    }
    @Test
    public void test06(){
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("bean2.xml");
        emp2 emp2 = (emp2) context.getBean("emp2");
        System.out.println(emp2.toString());
    }
    @Test
    public void test07(){
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("properties.xml");
        stu stu = (stu) context.getBean("stu");
        System.out.println(stu.toString());


    }

    @Test
    public void test08(){
        ClassPathXmlApplicationContext  context = new ClassPathXmlApplicationContext("annotation.xml");
        com.swq.annnotation.User user = (com.swq.annnotation.User) context.getBean("user");
        user.add();


    }
}
