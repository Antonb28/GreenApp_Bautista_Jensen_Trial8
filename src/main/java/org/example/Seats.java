package org.example;

public class Seats {
    int[] sched1 = {1,1,0,0,0,1,0,0,0,0,0,0};
    int[] sched2 = {0,1,0,1,0,0,0,1,1,0,0,0};

    public int LookUpSeat(int time, int seat){
        int ret = 0;
        int ref = seat - 1;
        if(time==1){
            if(sched1[ref] == 1){
                ret = 1;
            }
            else{
                ret = 2;
            }
        }
        else if (time ==2){
            if(sched2[ref] == 1){
                ret = 1;
            }
            else{
                ret = 2;
            }
        }
        return ret;
    }

    public int seatSelect(int time, int seat){
        int ref = seat - 1;
        int ret = 0;
        if(time==1){
            sched1[ref] = 1;
            ret = 1;
        }
        else if (time ==2){
            sched2[ref] = 1;
            ret = 1;
        }
        return ret;
    }

}
