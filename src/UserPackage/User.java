package UserPackage;


import Activity.Task;
import Activity.ToDo;
import UtilityPackage.Utils;
import java.util.Scanner ;

import static UtilityPackage.Utils.isEmailValid;

public class User {
    private String username;
    private String password;
    private int  streak = 0 ;
    private static ToDo[] tasks = new ToDo[200];
    private int taskCount = 0;
   // public static  Task[] Tasks = new Task[100] ;
    private String first_name;
    private String last_name;
    private String email;

    public User(String username , String password, String first_name , String last_name , String email){
        this.username = username;
        if (Utils.isPasswordValid(password)) {this.password = password;}
        else System.out.println("Pls Enter Stronger Password");
        this.first_name = setFirstName(first_name);
        this.last_name = setLastName(last_name);
        if (!isEmailValid(email)) System.out.println("Email is Not Valid");
        else { this.email = email;
        }
    }
    public User(String username , String password){
        this.username = username;
        if (Utils.isPasswordValid(password)) {this.password = password;}
    }
    public ToDo createToDo(String nametask){
        if(!isToDoRepetitive(nametask)){
        ToDo toDo = new ToDo();
        tasks[taskCount] = toDo ;
            taskCount ++ ;
        return toDo;
    }
     else return  null ;
    }

    public boolean isToDoRepetitive(String name){
          for (int i = 0 ; i != tasks.length ; i++){
              if (name.equals(tasks[i].name)) return true ;
          }
    return false ;
    }

    public ToDo getTaskByName(String Taskname){
        for (int i = 0 ; i != tasks.length ; i++){
            if (Taskname.equals(tasks[i].name)) return tasks[i];
        }
        System.out.println("not Found");
    return null;
    }
    public ToDo[] getToDosByColor(String Color){
        ToDo[] Temp  = new ToDo[100];
        int tempConuter = 0 ;
        for (int i = 0 ; i != tasks.length; i++){
            if (Color.equals(tasks[i].getColor())){
              Temp[tempConuter]=tasks[i];
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
        if ( setUsername.equals("nigga")) {
            System.out.println("don't be Racist");
            System.out.println("Choose Something else");
        }
      else  username = setUsername;
    }
    public void setPassword(String setPassword){
      if ( Utils.isPasswordValid(setPassword)) {password = setPassword;}
    }
    public String setFirstName(String firstName) {
        return (firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase());
    }

    public String setLastName(String lastName) {
        return (lastName.substring(0, 1).toUpperCase() + lastName.substring(1).toLowerCase());
    }


    public String getFirst_name(){
        return  first_name;

    }
    public String getLast_name(){
        return  last_name;
    }
}

