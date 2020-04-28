package Lister;

import java.io.File;

public class DirectoryLister {
    public static void main(String[] args) {
        File file = new File("/Users/Kamil/Desktop/JavaWwa22");
        showDirectories(file);
    }

    private static void showDirectories(final File file) {
        File[] files = file.listFiles();

        if (file != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    System.out.println("folder:" + f.getAbsolutePath());
                    showDirectories(f);
                } else {
                    System.out.println("  plik : " + f.getAbsolutePath());
                }
            }
        }
    }
}
