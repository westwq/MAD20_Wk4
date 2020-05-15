package sg.edu.np.mad.wk4;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class EH implements OnClickListener {
    Activity curr;

    public EH(Activity e)
    {
        curr = e;
    }
    @Override
    public void onClick(View v) {
        Intent in = new Intent(curr, Main2Activity.class);
        curr.startActivity(in);
    }
}
