package principal.main;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_register);
    }
}
