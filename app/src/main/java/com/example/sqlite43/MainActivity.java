package com.example.sqlite43;

        import androidx.appcompat.app.AppCompatActivity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void butn_add(android.view.View view) {
        startActivity(new Intent(getApplicationContext(),Add.class));
    }
    public void butn_view(View view) {
        startActivity(new Intent(getApplicationContext(),DetailsActivity.class));
    }
    public void butn_edit(View view) {
        startActivity(new Intent(getApplicationContext(),Edit.class));
    }
    public void butn_delete(View view) {
        startActivity(new Intent(getApplicationContext(),Delete.class));
    }
}
