package corona;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;

public class CustomPointCut extends DynamicMethodMatcherPointcut {

    private String packagesToHandlen = "corona.services.pcr";

    @Override
    public boolean matches(Method method, Class<?> aClass, Object... objects) {
        return true;
    }

    @Override
    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            @Override
            public boolean matches(Class<?> aClass) {
                return aClass.getPackage().getName() .contains(packagesToHandlen);
            }
        };
    }
}
