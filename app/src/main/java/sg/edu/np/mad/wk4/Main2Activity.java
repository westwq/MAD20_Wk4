package sg.edu.np.mad.wk4;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {
    public String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.d("a1", "2create");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("a1", "2stop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("a1", "2resume");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("a1", "2destroyed");
    }
}
