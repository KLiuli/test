package detector;


import javax.sound.sampled.LineListener;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Move {
    Scanner scan = new Scanner(System.in);
    //direction:方向,total:总的
    String strx = new String();
    String stry = new String();
    int x2, y2;     //范围坐标
    int x1 = 0, y1 = 0;   //(x1,y1):原点坐标
    HashMap<String, String> dete = new HashMap<String, String>();

    public Move() {
        locInit();
    }

    public void locInit() {
        //direction:位置初始化
        System.out.println("Please enter the coordinates of the top right vertex:");
        strx = scan.next(); //获取总地区坐标
        stry = scan.next();
        x2 = Integer.parseInt(strx);
        y2 = Integer.parseInt(stry);
        System.out.println("地区总坐标:(" + x2 + "," + y2 + ")");
    }

    public boolean judgeBoundary() {    //judge boundary:判断边界
        int x = Integer.parseInt(dete.get("x"));
        int y = Integer.parseInt(dete.get("y"));
        if (x1 <= x && x <= x2 && y1 <= y && y <= y2) {
            return true;
        } else {
            System.out.println("所给数据超出边界");
            return false;
        }
    }

    public void run() {
        //获取探测器初始坐标
        while (true) {
            System.out.println("输入探测器位置与方向:");
            String detex = scan.next();
            String detey = scan.next();
            String detec = scan.next();
            dete.put("x", detex);
            dete.put("y", detey);
            dete.put("c", detec);
            if (this.judgeBoundary()) {
                System.out.println("输入步骤:");
                String step = scan.next();  //step:步骤
                dete.put("s", step);

                System.out.println(dete);
                if (true) {
                    char[] steps = step.toCharArray();
                    for (char i : steps) {
                        if (i == 'M') {
                            switch (dete.get("c")) {
                                //temporary:暂时
                                case "N":
                                    int temp = Integer.parseInt(dete.get("y")) + 1;
                                    dete.put("y", String.valueOf(temp));
                                    break;
                                case "S":
                                    temp = Integer.parseInt(dete.get("y")) - 1;
                                    dete.put("y", String.valueOf(temp));
                                    break;
                                case "W":
                                    temp = Integer.parseInt(dete.get("x")) - 1;
                                    dete.put("x", String.valueOf(temp));
                                    break;
                                case "E":
                                    temp = Integer.parseInt(dete.get("x")) + 1;
                                    dete.put("x", String.valueOf(temp));
                                    break;
                            }
                        } else if (i == 'L') {
                            switch (dete.get("c")) {
                                case "N":
                                    dete.put("c", "W");
                                    break;
                                case "S":
                                    dete.put("c", "E");
                                    break;
                                case "W":
                                    dete.put("c", "S");
                                    break;
                                case "E":
                                    dete.put("c", "N");
                                    break;
                            }
                        } else if (i == 'R') {
                            switch (dete.get("c")) {
                                case "N":
                                    dete.put("c", "E");
                                    break;
                                case "S":
                                    dete.put("c", "W");
                                    break;
                                case "W":
                                    dete.put("c", "N");
                                    break;
                                case "E":
                                    dete.put("c", "S");
                                    break;
                            }
                        }
                        if (this.judgeBoundary()) {
                            System.out.println(dete);
                        } else {
                            break;
                        }
                    }
                }
                //System.out.println("正常退出...");
                //break;
            }
        }
    }
}
