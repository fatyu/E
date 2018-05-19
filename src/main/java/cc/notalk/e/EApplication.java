package cc.notalk.e;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAutoConfiguration
@EnableTransactionManagement
@ServletComponentScan
@ComponentScan
@EnableScheduling
@SpringBootApplication
public class EApplication {

    public static void main(String[] args) {
        SpringApplication.run(EApplication.class, args);
    }

    public void listFilesName(String[] args) {
        File file = new File("D:\\2.Ebook");
        Collection<File> listFilesAndDirs = FileUtils.listFiles(file, new String[] { "pdf" }, true);
        for (File file2 : listFilesAndDirs) {
            System.out.println(file2.getName());
        }

    }
}