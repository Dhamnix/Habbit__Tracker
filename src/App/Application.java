package App;

import UserPackage.User;

public class Application {

    private User[] users = new User[100];
    int j = 0 ;
    public User[] getUserByName(String name){
        User[] u = new User[5];
        for (int i =0 ; i!= users.length ; i++){
          String nam =  users[i].first_name+users[i].last_name ;
            if (name == nam) {
                u[j] = users[i];
                j++;
            }
        }
     if (j!=0)   return u;
     else return null;
    }
}
