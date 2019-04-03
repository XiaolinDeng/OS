package mySrc;
public class Time {
    private int hour;
    private int min;
    int val;

    public Time(){
        this(0,0);
    }
    public Time(int h,int m){
        while (m >= 60 || m < 0){
            if(m>=60){
                m = m - 60;
                h = h + 1;
                continue;
            }
            if(m<0)
            {
                 m = m + 60;
                 h = h -1;
            }
        }
        hour = h;
        min = m;
        val = h * 60 + m;
    }

    public void checkTime() {
        while(this.min < 0 || this.min>= 60){
            if(this.min >= 60){
                this.min = this.min - 60;
                this.hour = this.hour + 1;
                continue;
            }
            else{
                this.min = this.min + 60;
                this.hour = this.hour - 1;
            }
        }
        val = this.hour * 60 + this.min;
    }
    public void addMin(int m) {
        this.min += m;
        this.checkTime();
    }
    public void addHour(int h) {
        this.hour += h;
        this.checkTime();
    }
    public void addTime(Time t) {
        this.hour += t.hour;
        this.min += t.min;
        this.checkTime();
    }
    public void equalTime(Time t) {
        this.hour = t.hour;
        this.min = t.min;
        this.val = t.val;
    }
    public void setHour(int h){
        this.hour = h;
    }
    public void setMin(int m){
        this.min = m;
        this.checkTime();

    }


    public int getVal(){
        return this.val;
    }
    public int getHour(){
        return this.hour;
    }
    public int getMin(){
        return this.min;
    }

    public void print() {
        System.out.println("Time is " + this.hour + ":" + this.min);
    }
    public String toStr(){
        return this.hour + ":" + this.min;
    }

}
