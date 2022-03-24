import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld secondbean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(secondbean.getMessage());
        System.out.println(bean == secondbean);
        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getVoice());
        Cat secondcat = (Cat) applicationContext.getBean("cat");
        System.out.println(secondcat.getVoice());
        System.out.println(cat == secondcat);

    }
}