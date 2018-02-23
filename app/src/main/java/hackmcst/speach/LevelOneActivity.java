package hackmcst.speach;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LevelOneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_one);
    }

    public void goToMenu(View v)
    {
        Intent i = new Intent(this, MenuActivity.class);
        startActivity(i);
    }
}
