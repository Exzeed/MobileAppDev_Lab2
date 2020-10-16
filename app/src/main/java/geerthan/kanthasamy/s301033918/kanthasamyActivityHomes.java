/*
 * Student Name: Geerthan Kanthasamy
 * Student ID: 301033918
 * Section Number: 002
 */

package geerthan.kanthasamy.s301033918;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class kanthasamyActivityHomes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kanthasamy_homes);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.homes_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.geerthanApartment:
                setContentView(R.layout.apartment_layout);
                break;

            case R.id.geerthanDetached:
                setContentView(R.layout.detached_layout);

                Button btnCheckout = (Button) findViewById(R.id.geerthanCheckoutBtn);
                btnCheckout.setOnClickListener(new View.OnClickListener() //cannot resolve symbol error
                {
                    public void onClick(View v)
                    {
                        Intent intent = new Intent(kanthasamyActivityHomes.this, kanthasamyActivityCheckout.class);
                        startActivity(intent);
                    }
                });
                break;

            case R.id.geerthanSemi:
                setContentView(R.layout.semi_layout);
                break;

            case R.id.geerthanCondo:
                setContentView(R.layout.condo_layout);
                break;
            case R.id.geerthanTown:
                setContentView(R.layout.town_layout);
                break;
            default:
                return super.onOptionsItemSelected(item);
        }
        return true;

    }
}