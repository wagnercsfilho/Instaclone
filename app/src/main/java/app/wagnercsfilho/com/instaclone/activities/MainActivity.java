package app.wagnercsfilho.com.instaclone.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import app.wagnercsfilho.com.instaclone.R;
import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToolbar.setTitle(R.string.instaclone);
        setSupportActionBar(mToolbar);

    }
}
