package com.example.sqlite43;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Delete extends AppCompatActivity {
    EditText useid;
    Button delBtn;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);
        getSupportActionBar().setTitle("Delete Details");
        useid = (EditText)findViewById(R.id.uid);
        delBtn = (Button)findViewById(R.id.delbutn);
        delBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int userid = Integer.parseInt( useid.getText().toString() );
                DbHandler dbHandler = new DbHandler(Delete.this);
                dbHandler.DeleteUser(userid);
                intent = new Intent(Delete.this,DetailsActivity.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(), "Details Deleted Successfully",Toast.LENGTH_LONG).show();
            }
        });
    }
}
