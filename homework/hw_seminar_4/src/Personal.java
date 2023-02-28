import java.util.Date;

public class Personal  extends Task{
    private String birthday;

    public Personal(String type, String theme, String birthday) {
        super(type, theme);
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return super.toString() + ", День рождения: " + "\'" +  birthday + "\'";
    }
}
