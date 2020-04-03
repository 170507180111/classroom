package cn.edu.sdwu.android.classroom.sn170507180111;

import android.support.annotation.IntDef;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class Ch4Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch4_2);

        RadioGroup radiogroup=(RadioGroup)findViewById(R.id.ch4_3_rg);
        radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            public void onCheckedChangedListener(RadioGroup radioGroup,  int i) {

            }
                                              }
        );
    }
}
