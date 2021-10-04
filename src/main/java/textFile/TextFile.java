package textFile;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;

public class TextFile {
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

    private static String readFile(String filePath) {
        String content = "";

        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content;
    }

    private String writeFile(String content, String path) {
        try {
            File file = new File(path);

            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(content);

            bw.close();
            return content;
        } catch (Exception e) {
            System.out.println(e);
            return "";
        }
    }

    public static void main(String[] args) {
        //  Bài tập: ghép nội dung 2 tập tin text sang tập tin khác
        TextFile ex1 = new TextFile();
        String content1 = ex1.readFile("D://text1.txt");
        String content2 = ex1.readFile("D://text2.txt");
        ex1.writeFile(content1+ content2, "D://text3.txt");

    }
}
