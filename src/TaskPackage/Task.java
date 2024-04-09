package TaskPackage;

import UserPackage.User;

public class Task {
    public String name;

    private final String Color ;
    private double start_time = 0 ;
    private double finish_time = 0 ;


    public User user ;


    public Task (String name, User user){
        this.name = name ;
        this.user = user ;
        this.Color = "FFFFFF";
    }
    public Task (String name, User user , String color){
        this.name = name ;
        this.user = user ;
        this.Color = color ;
    }



    public double getDuration(){
        return (finish_time - start_time);
    }

    public void setStartTime(double stime){
        if (stime < 0) stime = stime * -1 ;
        start_time = stime ;
    }
    public void setFinishTime(double ftime){
        if (ftime < 0) ftime = ftime * -1 ;
        finish_time = ftime ;
    }
    public static boolean isColorValid(String color){
     String valid = "0123456789ABCDEF";
     for (char c : color.toCharArray()){
     if (valid.indexOf(c)== -1){return false;}
     }
     return true ;
    }
}
