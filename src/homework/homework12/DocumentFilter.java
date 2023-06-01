package homework.homework12;

import java.io.File;
import java.io.FilenameFilter;

public class DocumentFilter implements FilenameFilter {
    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(".txt");
    }
}
