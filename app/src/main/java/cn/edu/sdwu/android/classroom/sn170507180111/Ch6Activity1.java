package cn.edu.sdwu.android.classroom.sn170507180111;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class demo01_4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.demo01_style4);
        //在JAVA中获取字符串资源
        String content=getString(R.string.hello);
        Log.i(demo01_4.this.toString(),content);


        String sms=getString(R.string.sms);
        String.format(sms,100,"张三");
        Log.i(demo01_4.this.toString(),sms);
    }
}