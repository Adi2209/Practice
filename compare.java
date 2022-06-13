import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

class compare {

  private static boolean isEqual(Path firstFile, Path secondFile) {
    try {
      long size = Files.size(firstFile);
      if (size != Files.size(secondFile)) {
        return false;
      }
      if (size < 2048) {
        return Arrays.equals(
          Files.readAllBytes(firstFile),
          Files.readAllBytes(secondFile)
        );
      }
      try (
        BufferedReader bf1 = Files.newBufferedReader(firstFile);
        BufferedReader bf2 = Files.newBufferedReader(secondFile)
      ) {
        int ch;
        while ((ch = bf1.read()) != -1) {
          if (ch != bf2.read()) {
            return false;
          }
        }
      }
      return true;
    } catch (IOException e) {
      e.printStackTrace();
    }
    return false;
  }

  public static void main(String[] args) {
    File firstFile = new File("File1.txt");
    File secondFile = new File("File2.txt");
    boolean equal = isEqual(firstFile.toPath(), secondFile.toPath());
    if (equal) {
      System.out.println("Files are equal.");
    } else {
      System.out.println("Files are not equal.");
    }
  }
}
