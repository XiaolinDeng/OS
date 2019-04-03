import mySrc.Process;
import mySrc.Time;
import runClass.FCFS;

class TimeTest{
    Time t1 = new Time(8,15);
    Time t2 = new Time(0,25);
    Time sys = new Time(8,48);
    Process p = new Process("New",t1,t2);
    public void run() {
        p.print();
        p.calcCycling(sys);
        p.calcWeightCycling();
        System.out.println("\n" + p.getCycling() + "\t" + p.getWeightCycling());
    }
}

class FCFSTest{
    FCFS test = new FCFS();
    public void run(){
        test.testSort();
    }
}

public class Main {

    public static void main(String[] args) {
        FCFSTest t = new FCFSTest();
        t.run();
    }
}
