package corona;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

//@Aspect
public class ExceptionHandlerAspect implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        try{
            return methodInvocation.proceed();
        } catch (Throwable ex) {
            System.out.println("у вас опять сломался PCR");
            throw  ex;
        }

    }
// this is a static pointcut
//    @AfterThrowing(pointcut = "execution(* corona..*.*(..))", throwing = "ex")
//    public void handlePsrException(ClassCastException ex) {
//        System.out.println("у вас опять сломался PCR");
//    }

}
