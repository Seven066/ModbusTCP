package com.example.aop1.modbustcp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    final String LOGTAG = "MyLog";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //регистрация кнопок запуска активити
        Button bStartSlaveActivity = (Button) findViewById(R.id.bStartSlaveActivity);
        bStartSlaveActivity.setOnClickListener(this);
        Button bStartMasterActivity = (Button) findViewById(R.id.bStartMasterActivity);
        bStartMasterActivity.setOnClickListener(this);
        //--

    }

    //обработка нажатий кнопок
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bStartMasterActivity:
                Log.d(LOGTAG,"Master button pressed");
                Intent intentMaster = new Intent(this, MasterActivity.class);
                startActivity(intentMaster);
                break;
            case R.id.bStartSlaveActivity:
                Log.d(LOGTAG,"Slave button pressed");
                Intent intentSlave = new Intent(this, SlaveActivity.class);
                startActivity(intentSlave);
                break;
            default:
                Log.d(LOGTAG,"Нажато не пойми что");
                break;
        }
    }
}
