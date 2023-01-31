import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println("Переменные ссылаются на один и тот же объект HelloWorld? " + (bean == bean2));


        ApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);
        Cat catBean1 = (Cat) context.getBean("cat");
        System.out.println(catBean1.getName());

        Cat catBean2 = (Cat) context.getBean("cat");
        System.out.println(catBean2.getName());
        System.out.println("Переменные ссылаются на один и тот же объект Cat? " + (catBean1 == catBean2));

    }
}