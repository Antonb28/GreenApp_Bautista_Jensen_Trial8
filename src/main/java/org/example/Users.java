package org.example;

public class Users {
    int UserNumber;
    public int CheckUser(String User, String Pass){
        if (User.equals("john_anthony_jose@dlsu.edu.ph")){
            if(Pass.equals("SirJose_10")){
                UserNumber = 2;
                return 2;
            }
            else{
                return 0;
            }
        }
        else if (User.equals("antonio_bautista@dlsu.edu.ph")){
            if(Pass.equals("AntonB28")){
                UserNumber = 3;
                return 3;
            }
            else{
                return 0;
            }
        }
        else if (User.equals("jeremiah_jensen@dlsu.edu.ph")){
            if(Pass.equals("MrGarvinHaHa")){
                UserNumber = 4;
                return 4;
            }
            else{
                return 0;
            }
        }
        else{
            return 1;
        }
    }

    public int UserNumber() { return UserNumber; }
}
