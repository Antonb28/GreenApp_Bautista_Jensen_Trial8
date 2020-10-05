package org.example;

public class User{

    public int CheckUser(String User, String Pass) {
        if (User.equals("john_anthony_jose@dlsu.edu.ph")) {
            if (Pass.equals("SirJose_10xPogi")) {
                return 2;
            } else {
                return 0;
            }
        } else if (User.equals("antonio_bautista@dlsu.edu.ph")) {
            if (Pass.equals("AntonB28")) {
                return 3;
            } else {
                return 0;
            }
        } else if (User.equals("jeremiah_jensen@dlsu.edu.ph")) {
            if (Pass.equals("MrGarvinHaHa")) {
                return 4;
            } else {
                return 0;
            }
        } else {
            return 1;
        }
    }

    public int CheckDetails(String Pass) {
        if (Pass.equals("SirJose_10")) {
            return 2;
        }
        else if (Pass.equals("AntonB28")) {
            return 3;
        }
        else if (Pass.equals("MrGarvinHaHa")) {
            return 4;
        } else {
            return 0;
        }
    }
}



