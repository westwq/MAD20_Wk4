package sg.edu.np.mad.wk4;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public String name; //name 1
    CountDownTimer cdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //method 2
        Button bt = findViewById(R.id.button2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(in);
            }
        });

        //method 3
        Button bt3 = findViewById(R.id.button3);
        bt3.setOnClickListener(new EH(MainActivity.this));
        Log.d("a1", "1create");


        //alert dialog
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("This is a title")
                .setMessage("This is a msg")
                .setPositiveButton("Yes", null)
                .setNegativeButton("No", null);
        //alert.show();

        final TextView txt = findViewById(R.id.textView);
        cdt = new CountDownTimer(5000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                txt.setText("" + millisUntilFinished);
                Toast.makeText(MainActivity.this, "" + millisUntilFinished, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFinish() {
                txt.setText("0");
                Toast.makeText(MainActivity.this, "Time runs out!", Toast.LENGTH_SHORT).show();
            }
        };
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("a1", "1stop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("a1", "1resume");
        cdt.start();
    }

    //method 1
    public void onClick1(View v){
        Toast.makeText(this,"This is a toast", Toast.LENGTH_LONG).show();
//        Intent in = new Intent(this, Main2Activity.class);
//        startActivity(in);
    }
}
