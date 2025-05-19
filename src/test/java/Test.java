import com.hello.aa.MyConfig;
import org.springframework.context.annotation.*;
//import org.junit.Test;
//@ComponentScan({"com.hello"})
public class Test {
    @org.junit.Test
//    @Test
    public void test(){
        //1.将Student的bean注册到Ioc容器
        AnnotationConfigApplicationContext ioc1 = new AnnotationConfigApplicationContext(MyConfig.class);
        //2.获取Ioc的Id

        String id = ioc1.getId();
        System.out.println("IOC的id:"+id);
        //3.从IOC容器中获取所有bean的name
        String[] beanDefinitionNames = ioc1.getBeanDefinitionNames();
        for (String beanName: beanDefinitionNames){
            System.out.println(beanName);
        }
    }
}