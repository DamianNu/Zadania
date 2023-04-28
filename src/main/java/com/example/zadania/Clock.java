package com.example.zadania;


import java.util.LinkedList;
import java.util.List;

public class Clock {
   private int hour;
    private int minute;

    public Clock(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    @Override
    public String toString() {
        if (this.hour > 9 && this.minute > 9) {
            return (hour + ":" + minute);
        } else {
            if (this.hour < 10 && this.minute > 9) {
                return ("0" + hour + ":" + minute);
            } else if (this.hour > 10 && this.minute < 10) {
                return (hour + ":0" + minute);
            }
            return ("0" + hour + ":0" + minute);
        }
    }

    public int addMinute(int m) {
        this.minute = minute + m;
        int a = this.minute;
        if (a < 60) {

            return minute;

        } else {
            int h = a / 60;
            int mm = a % 60;
            int hour2 = hour + h;
            if (hour2<23) {
                hour = hour2;
                minute = mm;
                return hour & minute;

            } else {
                hour = hour2%24;
                minute = mm;
                return hour & minute;
            }

        }

    }
}



        class Program {
            public static void main(String[] args) {
                Clock clock1 = new Clock(23, 59);
                Clock clock2 = new Clock(0, 30);
                Clock clock3 = new Clock(1, 00);
                Clock clock4 = new Clock(1, 31);
                Clock clock5 = new Clock(22, 41);

                List<Clock> clocks = new LinkedList<>();
                clocks.add(clock1);
                clocks.add(clock2);
                clocks.add(clock3);
                clocks.add(clock4);
                clocks.add(clock5);

                for (int i = 0; i < clocks.size(); i++) {
                    clocks.get(i).addMinute(120);
                    System.out.println(clocks.get(i));
                }


            }

        }



