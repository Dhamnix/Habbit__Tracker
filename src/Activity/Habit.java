package Activity;

public class Habit extends ToDo{
    private int frequency;
    private String category;
    public String getInfo(){
        return "name :" + name + (start_time);
    }
    public void setStartTime(double stime){
        if (stime < 0) stime = stime * -1 ;
        start_time = stime ;
    }
}
