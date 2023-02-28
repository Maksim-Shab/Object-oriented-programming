import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
    static List<String> listTask = new ArrayList<>();

    static void addCalendar(Task thisTask){
        listTask.add(thisTask.toString());
    }

//    public static List<String> getListTask() {
//        return listTask;
//    }

    public static void fileWriter(){
        try (FileWriter writer = new FileWriter("Calendar_Tasks.txt",false)){
            for (int i = 0; i < listTask.size(); i++) {
                writer.write(listTask.get(i)+"\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
