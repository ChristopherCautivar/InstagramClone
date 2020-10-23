package ccautivar.csumb.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        ParseObject.registerSubclass(Post.class);

        //
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("sAA60CQlhf1hliN6dxElXYvZQ6ug1OVLCeNqGMW7")
                .clientKey("5WtkLCG98rgyR4BnsS4dBAncKHzJHa6SOfkKUaOD")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
