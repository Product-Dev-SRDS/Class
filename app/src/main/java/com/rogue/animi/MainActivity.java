package com.rogue.animi;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
public class MainActivity extends AppCompatActivity {
    public EditText name,age,dob;
    public Button clear,next;
    public ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        name = (EditText) findViewById(R.id.name);
        age = (EditText) findViewById(R.id.age);
        dob = (EditText) findViewById(R.id.dob);
        clear = (Button) findViewById(R.id.clear);
        next = (Button) findViewById(R.id.next);
        image = (ImageView) findViewById(R.id.image);
        String url = "https://picsum.photos/300";
        Picasso.get().load(url).memoryPolicy(MemoryPolicy.NO_CACHE,MemoryPolicy.NO_STORE
        ).into(image);
    }
    public void clear(View view){
        name.setText("");
        age.setText("");
        dob.setText("");
    }
    public void next(View view){

        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        String myName = name.getText().toString();
        intent.putExtra("my_Name",myName);
        startActivity(intent);
    }
}