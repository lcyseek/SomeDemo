package com.example.luchunyang.somedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;

/**
 *  density	    1	    1.5	    2	    3	    3.5	    4
 *  densityDpi	160	    240	    320	    480	    560	    640
 *
 *  分辨率
 *      分辨率就是手机屏幕的像素点数，一般描述成屏幕的“宽×高”
 *
 *
 *  屏幕大小。
 *      屏幕大小是手机对角线的物理尺寸，以英寸（inch）为单位.
 *      比如某某手机为“5寸大屏手机”，就是指对角线的尺寸，5寸×2.54厘米/寸=12.7厘米
 *
 *  密度（dpi，dots per inch；或PPI，pixels per inch）
 *      就是每英寸的像素点数.也可称为像素密度
 *      手机的分辨率是1080×1920，屏幕大小是5英寸
 *      通过宽1080和高1920，根据勾股定理，我们得出对角线的像素数大约是2203，那么用2203除以5就是此屏幕的密度了.结果是440。440dpi的屏幕已经相当细腻了
 *
 *  密度Density
 *      根据像素分辨率，在屏幕指定物理宽高范围内能显示的像素数量.也就是每英寸的像素数
 *      在同样的宽高区域，低密度的显示屏能显示的像素较少，而高密度的显示屏则能显示更多的像素
 *
 *  dip（dp）: device independent pixels(设备独立像素)
 *      1dp定义为屏幕密度值为160ppi时的1px
 *
 */
public class ScreenActiviy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_activiy);
    }

    public void displayMetrics(View view) {
        DisplayMetrics display = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(display);

        //density=1.0, width=900, height=1392, scaledDensity=1.0, xdpi=213.0, ydpi=213.0

        //这个得到的不应该叫做密度，应该是密度的一个比例。不是真实的屏幕密度，而是相对于某个值的屏幕密度。
        //也可以说是相对密度
        System.out.println("density="+display.density);//1.0
        System.out.println("densityDpi="+display.densityDpi);//160
        System.out.println("widthPixels="+display.widthPixels);//900
        System.out.println("heightPixels="+display.heightPixels);//1392
        System.out.println("scaledDensity="+display.scaledDensity);//1.0
        System.out.println("xdpi="+display.xdpi);//213.0
        System.out.println("ydpi="+display.ydpi);//213.0
    }
}
