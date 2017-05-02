package xsf.design.AbstractFactory;

/**
 * Author: 彩笔学长
 * Time: created at 16/11/2016.
 */

public class AbstractTestClient {
    public static void main(String[] args) {
        //BMW车场
        CarFactory bmwFactroy = new BMWFactroy();
        bmwFactroy.createTire().tire();
        bmwFactroy.createBrake().brake();
        bmwFactroy.createEngine().engine();
        System.out.println("---------分割线-----------");

        //QQ车场
        CarFactory qqFactroy = new QQFactroy();
        qqFactroy.createTire().tire();
        qqFactroy.createBrake().brake();
        qqFactroy.createEngine().engine();
    }
}
