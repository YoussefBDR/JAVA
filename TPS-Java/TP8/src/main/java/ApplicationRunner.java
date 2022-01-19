import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import presentation.OrderController;

public class ApplicationRunner {

    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
        OrderController ctrl=(OrderController) ctx.getBean("ctrl1");
        System.out.println(ctrl);
        System.out.println(ctrl.getService());
        System.out.println(ctrl.getService().getDao());
    }
}
