package androiddev.mywebmarket;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class BrowseActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.main);

        TextView textview = new TextView(this);
        textview.setText("This is Browse Tab");
        setContentView(textview);
    }
}