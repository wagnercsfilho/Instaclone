package app.wagnercsfilho.com.instaclone.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

import app.wagnercsfilho.com.instaclone.R;
import app.wagnercsfilho.com.instaclone.util.ParseErrors;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SignUpActivity extends AppCompatActivity {

    @BindView(R.id.editFullname)
    EditText mFullname;

    @BindView(R.id.editEmail)
    EditText mEmail;

    @BindView(R.id.editPassword)
    EditText mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.buttonSignup)
    public void signUp() {

        ParseUser parseUser = new ParseUser();
        parseUser.setEmail(mEmail.getText().toString());
        parseUser.setPassword(mPassword.getText().toString());
        parseUser.put("fullname", mFullname.getText().toString());

        parseUser.signUpInBackground(new SignUpCallback() {
            @Override
            public void done(ParseException e) {
                if (e != null) {
                    startActivity(new Intent(SignUpActivity.this, MainActivity.class));
                    finish();
                } else {
                    String error = new ParseErrors().getError(e.getCode());
                    Toast.makeText(SignUpActivity.this, error, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
