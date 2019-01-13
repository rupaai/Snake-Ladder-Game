/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author EZIO
 */
public class Score {
    
    String timeStamp;
    String p1,p2,winner;
    double duration;

    public Score(String p1, String p2, String winner, double duration) {
        this.p1 = p1;
        this.p2 = p2;
        this.winner = winner;
        this.duration = duration;
    }

    public Score() {
    }

    public Score(String timeStamp, String p1, String p2, String winner, double duration) {
        this.timeStamp = timeStamp;
        this.p1 = p1;
        this.p2 = p2;
        this.winner = winner;
        this.duration = duration;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getP1() {
        return p1;
    }

    public void setP1(String p1) {
        this.p1 = p1;
    }

    public String getP2() {
        return p2;
    }

    public void setP2(String p2) {
        this.p2 = p2;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
    
    
}
