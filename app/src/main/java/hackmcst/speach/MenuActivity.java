package hackmcst.speach;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void goToLevelOne(View v)
    {
        Intent i = new Intent(this, LevelOneActivity.class);
        startActivity(i);
    }

    public void goToLevelTwo(View v)
    {
        Intent i = new Intent(this, LevelTwoActivity.class);
        startActivity(i);
    }

    public void goToLevelThree(View v)
    {
        Intent i = new Intent(this, LevelThreeActivity.class);
        startActivity(i);
    }
}
