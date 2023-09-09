import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springidol.Performer;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("springExample.xml");
        Performer performer = (Performer) ctx.getBean("smb");
        performer.perform();







    }
}
