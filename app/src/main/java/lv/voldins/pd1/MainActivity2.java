package lv.voldins.pd1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button buttonBackActivity1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        buttonBackActivity1 = (Button) findViewById(R.id.buttonBackActivity1);
        buttonBackActivity1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();
            }
        });

    }
     public void openActivity1(){
        finish();
        //Intent intent = new Intent(this, MainActivity.class);
        //startActivity(intent);
    }
}