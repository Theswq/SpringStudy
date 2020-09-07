import com.wonders.dao.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.wonders.config.*;
public class test {

    @Test
    public void test(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(config.class);
        User user = context.getBean("user", User.class);
        user.add();

    }











}
