package com.genson.amor.swoosh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SkillActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill);
    }

    public void btnFinishActivation(View view){
        EditText mEtFinish = (EditText) findViewById(R.id.etFinish);
        Button btnFinish = (Button) findViewById(R.id.btnFinish);
        btnFinish.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Toast toast = Toast.makeText(this, "Finish", Toast.LENGTH_SHORT);
    }
}
