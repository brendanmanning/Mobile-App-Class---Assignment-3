package edu.temple.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Connect to the items in the activity
        Spinner spinner = findViewById(R.id.spinnerView);
        ImageView imageView = findViewById(R.id.imageView);

        // Create some sample themes
        Theme[] themes = new Theme[] {
                new Theme("Dog", R.drawable.dog),
                new Theme("Cat", R.drawable.cat),
                new Theme("Acadia", R.drawable.acadia)
        };

        // Connect to the spinner adapter
        spinner.setAdapter(new ImageAdapter(this, themes));

        // Handle changes to the spinner value
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                imageView.setImageResource(position > 0 ? themes[position-1].getResource() : 0);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                imageView.setImageResource(0);
            }
        });

    }
}