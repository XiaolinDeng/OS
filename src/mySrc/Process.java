package mySrc;

public class Process {
    private String name;
    private Time arrive = new Time();
    private Time need = new Time();
    private Time start = new Time();
    private Time finish = new Time();
    private int cycling;
    private float weightCycling;

    public Process(String s,Time a,Time n){
         this.name = s;
         this.arrive.equalTime(a);
         this.need.equalTime(n);

    }
    public Process(String s,int ah,int am,int nh,int nm){
        this.name = s;
        this.arrive.setHour(ah);
        this.arrive.setMin(am);
        this.need.setHour(nh);
        this.need.setMin(nm);
    }
    public Process(){
        this("#",0,0,0,0);
    }
    public void print(){
        System.out.println("Process:" + name +
                "\tArrive at:" + this.arrive.toStr() +
                "\tNeed time:" + this.need.toStr()
        );
     }
     public void printp(){
        System.out.println(
                "Process:" + name +
                "\tArrive:" +arrive.toStr() +
                "\tNeed:" + need.toStr() +
                "\tStart" + start.toStr() +
                "\tFinish" + finish.toStr() +
                "\tCycling" + getCycling() +
                "\tWeight" + getWeightCycling()
        );
     }

    public void calcStartTime(Time sys) {
        if (this.arrive.val < sys.val) this.start.equalTime(sys);
        else this.start.equalTime(sys);
    }
    public void calcFinishTime() {
        this.finish.equalTime(start);
        this.finish.addTime(need);
    }
    public void calcCycling( ){
        this.cycling = this.finish.val - this.arrive.val;
    }
    public void calcWeightCycling(){
        this.weightCycling = (float) cycling/(float) this.need.val; //右优先
    }

    public int getCycling(){
        return this.cycling;
    }
    public int getArriveVar(){
        return this.arrive.val;
    }
    public Time getArrive() {
        return this.arrive;
    }
    public Time getNeed(){
        return this.need;
    }
    public Time getFinish(){
        return finish;
    }
    public float getWeightCycling(){
        return this.weightCycling;
    }
    public void setStart(Time t){
        this.start.setHour(t.getHour());
        this.start.setMin(t.getMin());
        this.start.checkTime();
    }
    public void setFinish(Time t){
        this.finish.setHour(t.getHour());
    }

}
