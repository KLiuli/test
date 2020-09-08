package detector2;

import java.io.*;

//用枚举，面向对象，用IO读文件，每读一组用一个线程跑
public class Detector extends Thread{
    //detector:探测器
    public Detector() {
    }

    int x, y;       //x，y坐标
    enum Direction {
        //direction:方向
        E, S, W, N;  //north:北 south:南 west:西  east:东
    }
    Direction direction = Direction.N;

    public void readFile() throws IOException {
        //读文件
        File file = new File("./src/detector2/operation_steps.txt");
        file.createNewFile();
        System.out.println("steps finash");
        FileInputStream is = new FileInputStream(file);
        int size = is.available();

        for (int i = 0; i < size; i++) {
            System.out.print((char) is.read() + "  ");
        }
        is.close();

    }
    public void turnLeft() {
        //turn left:左转

    }

    public void turnRight() {
        //turn right:右转
    }

    public void moveOn() {
        //move on:继续前进
    }

    public void backOff() {

    }
}
