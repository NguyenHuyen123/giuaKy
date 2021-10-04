package javaIO;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class TraverseDepthFiles {
    public void traverseDepthFiles(final File fileOrDir) {
        if (fileOrDir.isDirectory()) {
            System.out.println(fileOrDir.getAbsolutePath());

            final File[] children = fileOrDir.listFiles();
            if (children == null) {
                return;
            }
            Arrays.sort(children, new Comparator<File>() {
                public int compare(final File o1, final File o2) {
                    return o1.getName().compareTo(o2.getName());
                }
            });
            for (final File each : children) {
                traverseDepthFiles(each);
            }
        } else {
            System.out.println(fileOrDir.getAbsolutePath());
        }
    }
}
