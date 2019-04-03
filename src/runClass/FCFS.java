package runClass;

import mySrc.Time;
import mySrc.Process;

public class FCFS {
    Time sys = new Time();

    public Process[] genTestProcess() {
        Process[] test = new Process[5];
        test[0] = new Process("p1", 9, 40, 0, 20);
        test[1] = new Process("p4", 10, 10, 0, 10);
        test[2] = new Process("p5", 10, 05, 0, 10);
        test[3] = new Process("p2", 9, 45, 0, 25);
        test[4] = new Process("p3", 9, 45, 0, 25);
        return test;
    }

    public void sortProcess(Process[] test) {
        for (int i = 0; i < test.length; i++) {
            for (int j = i; j < test.length-1; j++){
                if(test[j].getArriveVar() > test[j+1].getArriveVar()){
                    Process tmp = new Process();
                    tmp = test[j];
                    test[j] = test[j+1];
                    test[j+1] = tmp;
                }
            }
        }
    }
    public void testSort () {
        System.out.println("Before sort:");
        Process[] test = genTestProcess();
        for (int i = 0; i< test.length ;i++){
            test[i].print();
        }
        System.out.println("After sort:");
        this.sortProcess(test);
        for (int i = 0; i< test.length ;i++){
            test[i].print();
        }
    }
}

