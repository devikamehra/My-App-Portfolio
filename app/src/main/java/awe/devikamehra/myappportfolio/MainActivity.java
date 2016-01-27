package awe.devikamehra.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setTitle(getResources().getString(R.string.name));

       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Hey Udacity", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1 : makeToast(getString(R.string.button_1_pressed_text));
                                break;
            case R.id.button2 : makeToast(getString(R.string.button_2_pressed_text));
                                break;
            case R.id.button3 : makeToast(getString(R.string.button_3_pressed_text));
                                break;
            case R.id.button4 : makeToast(getString(R.string.button_4_pressed_text));
                                break;
            case R.id.button5 : makeToast(getString(R.string.button_5_pressed_text));
                                break;
            case R.id.button6 : makeToast(getString(R.string.button_5_pressed_text));
                break;
            default:break;
        }
    }

    public void makeToast(String string){
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }

}
