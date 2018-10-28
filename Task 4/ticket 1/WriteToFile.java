import com.senla.training.TextFileWorker;

import java.io.*;

public class WriteToFile {
    public static File InputReservation() {
        File file = new File("F:\\IdeaProjects\\reservation.txt");
        return file;
    }
    public static File InputBook() {
        File file = new File("F:\\IdeaProjects\\booksname.txt");
        return file;
    }
    public static File InputOrder() {
        File file = new File("F:\\IdeaProjects\\order.txt");
        return file;
    }
    public static File InputShoopList() {
        File file = new File("F:\\IdeaProjects\\shooplist.txt");
        return file;
    }

    public static void Input(String[] strings, File file){
        StringBuilder stringBuilder = new StringBuilder();
        for (String x : strings) {
            stringBuilder.append(x);
            stringBuilder.append(";");
        }
        stringBuilder.append("\n");
        String[] strings1 = {stringBuilder.toString()};
        TextFileWorker zxc = new TextFileWorker(file.getPath());
        zxc.writeToFile(strings1);
    }
}
