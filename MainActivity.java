package xrmine.io.xrminev5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton xrplservices, website, twitter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        xrplservices = findViewById(R.id.xrplservices);
        website = findViewById(R.id.website);
        twitter = findViewById(R.id.twitter);

        xrplservices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goLink("https://xrpl.services/?issuer=rfXMq3BMX2dTzJtG4pnhr49u6sHkVQXpWL&currency=58524D696E650000000000000000000000000000&limit=10000000000");

            }
        });
        website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goLink("https://www.xrmine.io");

            }
        });
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goLink("https://twitter.com/xrmine_info");

            }
        });
    }

    private void goLink(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}