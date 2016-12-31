package marchuck.pl.polak;

import android.support.multidex.MultiDexApplication;
import android.util.Log;

/**
 * Project "UoczFejs"
 * <p>
 * Created by Lukasz Marczak
 * on 30.12.2016.
 */
public class App extends MultiDexApplication {
    public static final String TAG = App.class.getSimpleName();
    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "onCreate: ");
     //   startService(new Intent(this, SimpleUoczFejs.class));
    }
}
