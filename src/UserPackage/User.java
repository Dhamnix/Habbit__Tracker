package UserPackage;

import UtilityPackage.Utils;
import TaskPackage.Task;

import java.sql.SQLOutput;
import java.util.Scanner ;
public class User {
    private String username;
    private String password;
    public String first_name;
    public String last_name;
    public String email;
    public int  streak = 0 ;
    public static int counter = 0 ;
    public static  Task[] Tasks = new Task[100] ;

    public User(String username , String password, String first_name , String last_name , String email){
        this.username = username;
        if (Utils.isPasswordValid(password)) {this.password = password;}
        else System.out.println("Pls Enter Stronger Password");
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
    }

    public Task createTask(String nametask){
        if(!isTaskRepetitive(nametask)){
        Scanner m = new Scanner(System.in);
        System.out.println("Enter Start time :");
        double start = Double.parseDouble(m.next());
        System.out.println("Enter Finish time :");
        double finish = Double.parseDouble(m.next());
        Task task1 = new Task (nametask , this  );
        Tasks[User.counter] = task1 ;
            User.counter ++ ;
        return task1;
    }
     else return  null ;
    }

    public boolean isTaskRepetitive(String name){
          for (int i = 0 ; i != User.counter ; i++){
              if (name ==  Tasks[User.counter].name) return true ;
          }
    return false ;
    }
    public String getFullName(){
        return (first_name + " " + last_name);
    }
    public  String getUsername(){
        return  username;
    }
    public String getPassword() {
        return password;
    }
    public void setUsername(String setUsername){
        username = setUsername;
    }
    public void setPassword(String setPassword){
      if ( Utils.isPasswordValid(setPassword)) {password = setPassword;}
    }
}
