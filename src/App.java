import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class App {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        var obj = new Myclass();

        new Processor().process(obj);
    }
}

class Processor{
    public void process(Object obj) throws IllegalAccessException, InvocationTargetException{
        var methods = obj.getClass().getDeclaredMethods();

        for(Method method : methods){
            if(method.isAnnotationPresent(PrintHello.class)){
                System.out.println("Hello!");
                method.invoke(obj);
            }
        }
    }
}

class Myclass{
    @PrintHello
    public void myMethod(){
        System.out.println("My method's logic...");
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface PrintHello{

}
