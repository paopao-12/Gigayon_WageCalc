package com.example.wagecalc_gigayon;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText txtName,txtHours;
    RadioGroup rGroup;
    RadioButton btnSelected;
    Button btnCAL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Edittext
        txtName =findViewById(R.id.txtName);
        txtHours =findViewById(R.id.txtHours);
        //RG
        rGroup =findViewById(R.id.rGroup);

        //Btn
        btnCAL =findViewById(R.id.btnCAL);

        //btn onclick
        btnCAL.setOnClickListener(this);

    }
    public void onClick(View v){

        if (v.getId() == R.id.btnCAL){
            int selectedEmployeeType =rGroup.getCheckedRadioButtonId();

            btnSelected =findViewById(selectedEmployeeType);

            String type = btnSelected.getText().toString();

            String name = txtName.getText().toString();
            String totalHours = (txtHours.getText().toString());

            Intent intent = new Intent(this, display_final.class);

            intent.putExtra("type",type);
            intent.putExtra("empName",name);
            intent.putExtra("hours",totalHours);
            startActivity(intent);
        }
    }

}