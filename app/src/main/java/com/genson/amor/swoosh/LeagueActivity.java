package com.genson.amor.swoosh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class LeagueActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_league);
        findViews();

    }

    private void findViews() {
        Button mBtnNext = (Button) findViewById(R.id.btnNext);
    }

    public void mens(View view){
        Button mBtnMens = (Button) findViewById(R.id.btnMens);
        mBtnMens.getBackground().setAlpha(64);
    }
    public void womens(View view){
        Button mBtnWomens = (Button) findViewById(R.id.btnWomens);
        mBtnWomens.getBackground().setAlpha(64);
    }
    public void coed(View view){
        Button mBtnCoed = (Button) findViewById(R.id.btnCoed);
        mBtnCoed.getBackground().setAlpha(64);
    }
    public void next(View view){
        Intent intent = new Intent(this, SkillActivity.class);
        startActivity(intent);
    }

}
