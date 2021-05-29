package com.foxmula.assignment1;

public class Time {
    private int hours, minutes, seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;

        FormatCorrection();
    }

    public void Add(Time timeParam){
        int totalHours, totalMinutes, totalSeconds;

        this.seconds += timeParam.seconds;
        this.minutes += timeParam.minutes;
        this.hours += timeParam.hours;

        FormatCorrection();

        System.out.println(this.hours + " hours " + this.minutes + " minutes " + this.seconds + " seconds");
    }

    private void FormatCorrection(){
        this.minutes += this.seconds / 60;
        this.seconds %= 60;

        this.hours += this.minutes / 60;
        this.minutes %= 60;
    }
}
