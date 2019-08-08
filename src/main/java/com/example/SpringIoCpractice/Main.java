//TODO
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Main {
 
    public static void main(String[] args) {
        /*//创建HelloWorld的一个对象
        HelloWorld helloWorld = new HelloWorld();
        //为name属性赋值
        helloWorld.setUserName("Tom");
        */
        //1、创建Spring的IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2、从IOC容器中获取Bean
        Person person = (Person) ctx.getBean("Person");
        //3、调用hello方法
        person.getname();
    }
}
