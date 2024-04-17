package App;

import UserPackage.User;

public class Application {
    private User[] users = new User[100];
    static int howMuch = 0;
    int j = 0 ;
    public User[] getUserByName(String name){
        User[] u = new User[5];
        for (int i =0 ; i!= users.length ; i++){
          String nam =  users[i].getFirst_name()+users[i].getLast_name() ;
            if (name == nam) {
                u[j] = users[i];
                j++;
            }
        }
     if (j!=0)   return u;
     else return null;
    }

    public void addUser(String name , String pass){
        User u = new User(name,pass);
        users[howMuch]=u;
        howMuch++;
    }
    public void removeUser(User u){
        for (int i =0 ; i!=howMuch; i++){
            if (u == users[i])
                users[i] = null;
        }
    }
}

