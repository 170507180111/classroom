package cn.edu.sdwu.android.classroom.sn170507180111;

import android.app.WallpaperManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CH4Activity1 extends AppCompatActivity implements View.OnFocusChangeListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载页面，不要写文件名，使用资源id来引用资源
        setContentView(R.layout.layout);
        //1）获取普通界面组件
        Button button=(Button) findViewById(R.id.button1);
        ImageView imageView=(ImageView)findViewById(R.id.ch4_id);
        //3）调用事件源的setXxxListener方法祖册事件监听器
        button.setOnClickListener(new CH4Activity1().MyClickListener());;

        //3.使用内部匿名类注册监听器
        imageView.setOnLongClickListener(new View.OnClickListener(
        public boolean onLongClick(View view){
            //设置壁纸
            WallpaperManager wallpaperManager=getSystemService()
            return ture;
        }
        ));
        EditText email = (EditText) findViewById(R.id.ch4_1_email);
        email.setOnFocusChangeListener(this);
    }

    @Override
    public void onFocusChange(View view, boolean b) {
        //参数b代表是否获取焦点
        //判断邮箱地址的合法性
        EditText editText=(EditText)view;
        if(!b){
            String content =editText.getText().toString();//得到editText内容
            String regEx1 = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
            Pattern pattern= Pattern.compile(regEx1);

            Matcher matcher=pattern.matcher(email);
            TextView textView=(TextView)
        }
    }

    //2）实现事件监听类，该监听类是一个特殊的java类，必须实现一个XxxListener接口
    class MyClickListener implements View.OnClickListener{
        public void onClick(View view){

        }
    }
    }
}