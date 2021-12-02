package uz.shox.osiyodavlatlari;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    ImageView mainImages;
    TextView nomi_txt;
    TextView poytaxt_txt;
    TextView tasnif_txt;

    String data1;
    String data2;
    int data3;

    int myImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mainImages = findViewById(R.id.imageView);
        nomi_txt  = findViewById(R.id.nomi_txt);
        poytaxt_txt = findViewById(R.id.poytaxt_txt);
        tasnif_txt = findViewById(R.id.tasnif_txt);

        getData();
        setData();
    }
    private void getData() {
        if (getIntent().hasExtra("myImage") && getIntent().hasExtra("data1") && 
                getIntent().hasExtra("data2") && getIntent().hasExtra("data3")) {
            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            data3 = getIntent().getIntExtra("data3", 1);
            myImage = getIntent().getIntExtra("myImage", 1);
            
        }else {
            Toast.makeText(this, "Hech nima topilmadi!", Toast.LENGTH_SHORT).show();
        }

    }

    private void setData() {
        nomi_txt.setText(data1);
        poytaxt_txt.setText(data2);
        tasnif_txt.setText(data3);
        mainImages.setImageResource(myImage);

    }


}