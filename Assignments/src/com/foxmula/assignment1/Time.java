package com.foxmula.assignment1;

public class Time {
    private int hours, minutes, seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

        formatCorrection();
    }

    public void add(Time time){
        this.seconds += time.seconds;
        this.minutes += time.minutes;
        this.hours += time.hours;

        formatCorrection();

        System.out.println(this.hours + " hours " + this.minutes + " minutes " + this.seconds + " seconds");
    }

    private void formatCorrection(){
        this.minutes += this.seconds / 60;
        this.seconds %= 60;

        this.hours += this.minutes / 60;
        this.minutes %= 60;
    }
}
