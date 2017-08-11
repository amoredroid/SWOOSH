package com.genson.amor.swoosh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LeagueActivity extends AppCompatActivity {

    private Button mBtnNext;
    private Button mBtnNextBG;
    private Button mBtnMens;
    private Button mBtnWomens;
    private Button mBtnCoed;
    private TextView mtvIAmText;
    private TextView mtvDSkill;
    public static final String PASS_STRING = "";
    public static final int REQ_CODE = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_league);
        findViews();

        mBtnMens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mBtnMens.getAlpha() != mBtnNext.getAlpha()) {
                    mBtnMens.setAlpha(1f);
                    mBtnWomens.setAlpha(0.5f);
                    mBtnCoed.setAlpha(0.5f);
                    mBtnNext.setAlpha(1f);
                    mBtnNext.setEnabled(true);
                }
                else if(mtvDSkill.getText().toString().isEmpty()){
                    mBtnMens.setAlpha(1f);
                    mBtnWomens.setAlpha(1f);
                    mBtnCoed.setAlpha(1f);
                    mBtnNext.setAlpha(0.5f);
                    mBtnNext.setEnabled(false);
                }
            }
        });
        mBtnWomens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mBtnWomens.getAlpha() != mBtnNext.getAlpha()) {
                    mBtnMens.setAlpha(0.5f);
                    mBtnWomens.setAlpha(1f);
                    mBtnCoed.setAlpha(0.5f);
                    mBtnNext.setAlpha(1f);
                    mBtnNext.setEnabled(true);
                }
                else if(mtvDSkill.getText().toString().isEmpty()){
                    mBtnMens.setAlpha(1f);
                    mBtnWomens.setAlpha(1f);
                    mBtnCoed.setAlpha(1f);
                    mBtnNext.setAlpha(0.5f);
                    mBtnNext.setEnabled(false);
                }
            }
        });
        mBtnCoed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mBtnCoed.getAlpha() != mBtnNext.getAlpha()) {
                    mBtnMens.setAlpha(0.5f);
                    mBtnWomens.setAlpha(0.5f);
                    mBtnCoed.setAlpha(1f);
                    mBtnNext.setAlpha(1f);
                    mBtnNext.setEnabled(true);

                }
                else if(mtvDSkill.getText().toString().isEmpty()){
                    mBtnMens.setAlpha(1f);
                    mBtnWomens.setAlpha(1f);
                    mBtnCoed.setAlpha(1f);
                    mBtnNext.setAlpha(0.5f);
                    mBtnNext.setEnabled(false);

                }
            }
        });
        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent skillIntent = new Intent(v.getContext(), SkillActivity.class);
                startActivityForResult(skillIntent, REQ_CODE);
            }
        });
    }

    private void findViews(){
        mBtnMens = (Button) findViewById(R.id.mens);
        mBtnWomens = (Button) findViewById(R.id.womens);
        mBtnCoed = (Button) findViewById(R.id.co_ed);
        mBtnNext= (Button) findViewById(R.id.btnBackNext);
        mBtnNextBG = (Button) findViewById(R.id.next);
        mtvDSkill = (TextView)findViewById(R.id.tvLeague);
        mtvIAmText = (TextView)findViewById(R.id.tvSkill);
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            if (requestCode == REQ_CODE) {
                String replyMsg = data.getStringExtra(SkillActivity.PASS_STRING);
                mtvIAmText.setVisibility(View.VISIBLE);
                mtvDSkill.setVisibility(View.VISIBLE);
                mtvDSkill.setText(replyMsg);
                mBtnNext.setVisibility(View.GONE);
                mBtnNextBG.setVisibility(View.GONE);
                if(mBtnMens.getAlpha()!=1f)
                    mBtnMens.setEnabled(false);
                if(mBtnWomens.getAlpha()!=1f)
                    mBtnWomens.setEnabled(false);
                if(mBtnCoed.getAlpha()!=1f)
                    mBtnCoed.setEnabled(false);
            }
        }
    }

}
