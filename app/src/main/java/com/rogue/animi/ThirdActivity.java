package com.rogue.animi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
public class ThirdActivity extends AppCompatActivity {
    ImageView image;
    Button generate;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_third);
        image = (ImageView) findViewById(R.id.image);
        generate = (Button) findViewById(R.id.generate);
    }
    public void generate(View view){
        String url= "https://picsum.photos/300";
        Picasso.get().load(url).memoryPolicy(MemoryPolicy.NO_CACHE,MemoryPolicy.NO_STORE
        ).into(image);
    }

    public void next(View view){
        Intent intent = new Intent(ThirdActivity.this, forthActivity.class);
    }

}