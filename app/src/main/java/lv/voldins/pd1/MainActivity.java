package lv.voldins.pd1;

import androidx.annotation.MainThread;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;

public class MainActivity extends AppCompatActivity {
    private Button buttonActivity2;
    private Button dialog;
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
        dialog =(Button) findViewById(R.id.dialog);
        dialog.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                alertDialog();
             }
        });

    }
    public void openActivity2(){
       // Intent intent = new Intent(this, MainActivity2.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or  Intent.FLAG_ACTIVITY_NEW_TASK);
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(intent);
    }

    public void alertDialog(){
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle(R.string.tittle);
        alertDialog.setMultiChoiceItems(R.array.grupasStudenti, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                String studentuMasivs[] = getResources().getStringArray(R.array.grupasStudenti);
                if (isChecked){
                    Toast.makeText(MainActivity.this, studentuMasivs[which] + " dalībnieks ir atzīmēts", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, studentuMasivs[which] + " dalībniekam ir nonemta atzīme", Toast.LENGTH_SHORT).show();
                }
            }
        });

        alertDialog.setPositiveButton("OK",null);
        alertDialog.setNegativeButton("Close", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "Jūs aizvērāt logu!!!", Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alert = alertDialog.create();
        alert.setCanceledOnTouchOutside(false);
        alert.show();
        Button positiveButton = alert.getButton(AlertDialog.BUTTON_POSITIVE);
        positiveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Jūs nospiedāt Ok", Toast.LENGTH_SHORT).show();
            }
        });
    }



}
