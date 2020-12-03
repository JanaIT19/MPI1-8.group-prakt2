package lv.voldins.pd1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonActivity2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonActivity2 = (Button) findViewById(R.id.buttonActivity2);
        buttonActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openActivity2();
            }
        });


    }
    public void openActivity2(){
       // Intent intent = new Intent(this, MainActivity2.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or  Intent.FLAG_ACTIVITY_NEW_TASK);
        Intent intent = new Intent(this, MainActivity2.class)
        startActivity(intent);
    }


}