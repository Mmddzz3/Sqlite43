package com.example.sqlite43;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Edit extends AppCompatActivity {
    EditText loc, desig,useid;
    Button upBtn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        getSupportActionBar().setTitle("Update Details");
        loc = (EditText)findViewById(R.id.uloc);
        desig = (EditText)findViewById(R.id.udes);
        useid = (EditText)findViewById(R.id.uuid);
        upBtn = (Button)findViewById(R.id.update);
        upBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String location = loc.getText().toString();
                String designation = desig.getText().toString();
                int userid = Integer.parseInt( useid.getText().toString() );
                DbHandler dbHandler = new DbHandler(Edit.this);
                dbHandler.UpdateUserDetails(location,designation,userid);
                intent = new Intent(Edit.this,DetailsActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Updated Successfully",Toast.LENGTH_LONG).show();
            }
        });
    }
}
