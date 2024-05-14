package App;

import UserPackage.User;

public class Application {
    private User[] users = new User[100];
    private static int howMuch = 0;

   public User[] getUserByName(String name){
        User[] u = new User[100];
        int j = 0 ;
        for (int i = 0 ; users[i]!= null ; i++){
          if(users[i].getUsername().equals(name))
          {
                u[j] = users[i];
                j++;
            }
        }
      return u;
    }


    public void addUser(String name , String pass){
        User u = new User(name,pass);
        users[howMuch] = u;
        howMuch++;
    }
    public void removeUser(User u){
        for (int i =0 ; i!=howMuch; i++){
            if (u == users[i])
                users[i] = null;
        }
    }
}

