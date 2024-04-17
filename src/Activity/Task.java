package Activity;

import UserPackage.User;
import java.util.Arrays;
public class Task extends ToDo {
    private double finish_time = 0;
    public User user;

    public Task() {}


    public Task(String name, User user) {
        this.name = name;
        this.user = user;
        this.color = "FFFFFF";
    }

    public Task(String name, User user, String color) {
        this.name = setName(name);
        this.user = user;
        this.color = color;
    }


    public double getDuration() {
        return (finish_time - start_time);
    }

    public String getInfo() {
        return "name :" + name + (start_time);
    }

    public void setFinishTime(double ftime) {
        if (ftime < 0) ftime = ftime * -1;
        finish_time = ftime;
    }

    public String setName(String TaskName) {
        if (TaskName.length() < 10) return TaskName;
        else {
            System.out.println("too Long");
            return null;
        }
    }
}