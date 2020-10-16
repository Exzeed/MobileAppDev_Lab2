/*
* Student Name: Geerthan Kanthasamy
* Student ID: 301033918
* Section Number: 002
*/

package geerthan.kanthasamy.s301033918;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class geerthanActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnEnter = (Button) findViewById(R.id.geerthanEnterBtn);
        btnEnter.setOnClickListener(new View.OnClickListener() //cannot resolve symbol error
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(geerthanActivity.this, kanthasamyActivityHomes.class);
                startActivity(intent);
            }
        });
    }
}