package Activity;

import java.util.concurrent.atomic.AtomicInteger;

public class ToDo {
    public String name;
   protected double start_time;
   protected String color ;
    public void setStartTime(double stime){
        if (stime < 0) stime = stime * -1 ;
        start_time = stime ;
    }

    public String getInfo(){
        return "name :" + name + (start_time);
    }
    public void setColor(String c){
        if(isColorValid(c)){this.color = c ;}
    }
    public static boolean isColorValid(String color){
        String valid = "0123456789ABCDEF";
        for (char c : color.toCharArray()){
            if (valid.indexOf(c)== -1){return false;}
        }
        return true ;
    }
    public String getColor(){
        return color;
    }

}
