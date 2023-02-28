public class Task {
    private String type;
    private String priority = TypeTask();
    private String theme;

    public Task(String type, String theme) {
        this.type = type;
        this.theme = theme;
    }

    public String getType() {
        return type;
    }

    public String getPriority() {
        return priority;
    }

    public String getTheme() { return theme; }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String TypeTask() { // Метод определения типа задачи, и присвоения приоритета.
        if (this.type == "рабочая") {
            priority = "Высокий";
            return priority;
        } else if (this.type == "личная") {
            priority = "Средний";
            return priority;
        } else if (this.type == "хобби") {
            priority = "Низкий";
            return priority;
        } else {
            return ("Не могу определить тип задачи для назначения приоритета");
        }
    }

    @Override
    public String toString() {
        return "Тип задачи: \'" + type + '\'' +
                ", Проиоритет: \'" + priority + '\'' +
                ", Тема: \'" + theme + '\'';
    }

}
