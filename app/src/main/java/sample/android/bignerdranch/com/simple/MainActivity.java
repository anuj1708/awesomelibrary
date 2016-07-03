package sample.android.bignerdranch.com.simple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import sample.android.bignerdranch.com.mylibrary.Awesome;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Awesome.getInstance().makeMeAwesome(getApplication(), "Anuj");
    }
}
