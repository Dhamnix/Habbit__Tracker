package UserPackage;

import UtilityPackage.Utils;
import TaskPackage.Task;

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
        this.first_name = setFirstName(first_name);
        this.last_name = setLastName(last_name);
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

    public Task getTaskByName(String Taskname){
        for (int i = 0 ; i != User.counter ; i++){
            if (Taskname ==  Tasks[User.counter].name) return Tasks[User.counter];
        }
        System.out.println("not Foung");
    return null;
    }
    public Task[] getTaskByColor(String Color){
        Task[] Temp  = new Task[100];
        int tempConuter = 0 ;
        for (int i = 0 ; i != User.counter ; i++){
            if (Color ==  Tasks[User.counter].getColor()) {
              Temp[tempConuter]=  Tasks[User.counter];
              tempConuter++;
            }
        }
    if (tempConuter == 0 ) {
        System.out.println("Failed");
        return null;
    }
    else { return Temp; }

    }
    public String getFullName(){
        // return (first_name + " " + last_name);
        return String.join(" ", first_name, last_name);
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
    public String setFirstName(String firstName) {
        // Capitalize the first letter and convert the rest to lowercase
        return (firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase());
    }

    public String setLastName(String lastName) {
        // Capitalize the first letter and convert the rest to lowercase
        return (lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase());
    }
}
