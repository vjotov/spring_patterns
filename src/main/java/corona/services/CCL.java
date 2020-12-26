package corona.services;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class CCL extends ClassLoader {
    @SneakyThrows
    @Override
    public Class<?> findClass(String className) throws ClassNotFoundException {
        String fileName = "target/classes/" + className.replace('.', File.separatorChar) + ".class";
        byte[] bytecode = Files.newInputStream(Path.of(fileName)).readAllBytes();
        return defineClass(className, bytecode, 0, bytecode.length);
    }
}
