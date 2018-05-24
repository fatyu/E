package cc.notalk.e.service;

import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cc.notalk.e.domain.entity.Category;
import cc.notalk.e.domain.repository.CategoryRepository;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public void refresh() {

        //1.清空数据
        List<Category> findAll = categoryRepository.findAll();
        categoryRepository.delete(findAll);

        //2.读取路径文件夹.递归创建Category对象,并存入数据库

    }

    public void listFilesName(String[] args) {
        File file = new File("D:\\2.Ebook");
        Collection<File> listFilesAndDirs = FileUtils.listFiles(file, new String[] { "pdf" }, true);
        for (File file2 : listFilesAndDirs) {
            System.out.println(file2.getName());
        }

    }

    private static AtomicLong id = new AtomicLong(1);

    public static void fetchDirs(File root, Category parent) {
        Category category = new Category();
        category.setCode(root.getName());
        category.setName(root.getName());
        category.setPid(id.incrementAndGet());
        System.out.println(category);
        //        category.setPid(parent == null ? null : parent.getId());
        //        category = categoryRepository.save(category);
        File[] listFiles = root.listFiles();
        for (File file : listFiles) {
            if (file.isDirectory()) {
                if (file.getParentFile().getName().equals("2.Ebook")
                        || file.getParentFile().getParentFile().getName().equals("2.Ebook")) {
                    fetchDirs(file, category);
                }
            }
        }

    }

    public static void main(String[] args) {
        fetchDirs(new File("D:\\2.Ebook"), null);
    }

}
