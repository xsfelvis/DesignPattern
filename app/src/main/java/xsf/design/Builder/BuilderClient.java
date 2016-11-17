package xsf.design.Builder;

import android.util.Log;

/**
 * Author: 彩笔学长
 * Time: created at 17/11/2016.
 */

public class BuilderClient {
    public static void main(String[] args) {
        Builder builder = new Win7Builder();
        Director pcDirector = new Director(builder);
        pcDirector.construct("i7", "sunsang","win7");
        System.out.printf("pc config " + builder.create().toString());
        /*builder.buildBoard("i7").buildDisplay("sansung").buildos("win7 64").create();
        System.out.printf("pc config " + builder.buildBoard("i7").buildDisplay("sansung").create().toString());*/
    }
}
