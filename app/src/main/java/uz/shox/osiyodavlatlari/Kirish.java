package uz.shox.osiyodavlatlari;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kirish extends AppCompatActivity {

    private Button boshlash;
    private Button haqida;
    private Button chiqish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kirish);

        boshlash = findViewById(R.id.boshlash_btn);
        haqida = findViewById(R.id.info_btn);
        chiqish = findViewById(R.id.chiqish_btn);

        boshlash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kirish.this, MainActivity.class);
                startActivity(intent);
            }
        });
        haqida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kirish.this, InfoActivity.class);
                startActivity(intent);
            }
        });
        chiqish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);
                finish();
            }
        });

    }
}