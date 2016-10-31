package app.wagnercsfilho.com.instaclone.application;

import android.app.Application;

import com.parse.Parse;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("4z9kz9btdfpcUXCruuVd1i0OmfbbMwPXoNY7rdOW")
                .clientKey("Tg2F3yxMYvTjhr6gurhY7Q4HSpS8mylciHLT9YVL")
                .server("https://parseapi.back4app.com").build());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
