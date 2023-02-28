public class Hobby extends Task{
    private String typeHobby;

    public Hobby(String type, String theme, String typeHobby) {
        super(type, theme);
        this.typeHobby = typeHobby;
    }

    @Override
    public String toString() {
        return super.toString()+ ", Хобби: " + "\'" + typeHobby + "\'";
    }
}
