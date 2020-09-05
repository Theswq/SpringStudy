import com.wonders.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

public class test {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext("com.wonders.spring");
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
    }

}
