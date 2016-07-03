package sample.android.bignerdranch.com.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by anuj on 3/7/16.
 */
public class Awesome {
    private static Awesome ourInstance = new Awesome();

    public static Awesome getInstance() {
        return ourInstance;
    }

    private Awesome() {
    }

    public void makeMeAwesome(Context context, String data){
        Toast.makeText(context, "Awesome "+data, Toast.LENGTH_LONG).show();
    }
}
