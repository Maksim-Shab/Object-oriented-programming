public class Working  extends Task{
    private String responsible;

    public Working(String type, String theme, String responsible) {
        super(type, theme);
        this.responsible = responsible;
    }

    @Override
    public String toString() {
        return super.toString() + ", Ответсвенный: " + "\'" + this.responsible + "\'";
    }
}
