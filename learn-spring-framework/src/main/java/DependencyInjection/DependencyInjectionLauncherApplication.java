package DependencyInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {
    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    Dependency1 dependency1;

    public Dependency2 getDependency2() {
        return dependency2;
    }
//    @Autowired
//    public void setDependency2(Dependency2 dependency2) {
//        System.out.println("Setter Injection - dep 2");
//        this.dependency2 = dependency2;
//    }

    public Dependency1 getDependency1() {
        return dependency1;
    }
//    @Autowired
//    public void setDependency1(Dependency1 dependency1) {
//        System.out.println("Setter Injection - dep 1");
//        this.dependency1 = dependency1;
//    }

    Dependency2 dependency2;

    public String toString(){
        return "Using " + dependency1 + "and "+ dependency2;
    }
}

@Component
class Dependency1 {}

@Component
class Dependency2 {}


@Configuration
@ComponentScan
public class DependencyInjectionLauncherApplication {

    public static void main(String[] args){
        var context = new AnnotationConfigApplicationContext(DependencyInjectionLauncherApplication.class);
        System.out.println(context.getBean(YourBusinessClass.class));
    }
}
