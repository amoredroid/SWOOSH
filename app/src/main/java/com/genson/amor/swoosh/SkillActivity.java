package com.genson.amor.swoosh;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SkillActivity extends AppCompatActivity{

    private Button mBtnBeginner;
    private Button mBtnBaller;
    private Button mBtnFinish;
    public static final String PASS_STRING = "";

    public SkillActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill);
        findViews();
        mBtnBeginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mBtnBeginner.getAlpha()!=mBtnFinish.getAlpha()) {
                    mBtnBeginner.setAlpha(1f);
                    mBtnBaller.setAlpha(0.5f);
                    mBtnFinish.setAlpha(1f);
                    mBtnFinish.setEnabled(true);
                    mBtnFinish.setText("Finish");
                }
                else{
                    mBtnBeginner.setAlpha(1f);
                    mBtnBaller.setAlpha(1f);
                    mBtnFinish.setAlpha(0.5f);
                    mBtnFinish.setEnabled(false);
                    mBtnFinish.setText("");
                }
            }
        });
        mBtnBaller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mBtnBaller.getAlpha()!=mBtnFinish.getAlpha()) {
                    mBtnBeginner.setAlpha(0.5f);
                    mBtnBaller.setAlpha(1f);
                    mBtnFinish.setAlpha(1f);
                    mBtnFinish.setEnabled(true);
                    mBtnFinish.setText("Finish");
                }
                else{
                    mBtnBeginner.setAlpha(1f);
                    mBtnBaller.setAlpha(1f);
                    mBtnFinish.setAlpha(0.5f);
                    mBtnFinish.setEnabled(false);
                    mBtnFinish.setText("");
                }
            }
        });
        mBtnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Iam = "";
                if(mBtnBeginner.getAlpha()==1f) {
                    Iam = mBtnBeginner.getText().toString();
                }
                else if(mBtnBaller.getAlpha()==1f) {
                    Iam = mBtnBaller.getText().toString();
                }
                Intent data = new Intent();
                data.putExtra(PASS_STRING, Iam);
                setResult(Activity.RESULT_OK, data);
                finish();


            }
        });
    }

    private void findViews()
    {
        mBtnFinish = (Button) findViewById(R.id.finish);
        mBtnBeginner = (Button) findViewById(R.id.beginner);
        mBtnBaller = (Button) findViewById(R.id.baller);
    }


}
