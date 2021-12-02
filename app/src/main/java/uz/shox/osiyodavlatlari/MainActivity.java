package uz.shox.osiyodavlatlari;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import uz.shox.osiyodavlatlari.adapters.MyAdapter;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[];
    String s2[];
    int s3[] = {R.string.uzbek, R.string.kazak, R.string.turkman, R.string.tojik, R.string.qirgiz};
    int images[] = {R.drawable.uzbek, R.drawable.kazak, R.drawable.turkman, R.drawable.tojik, R.drawable.qirgiz};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.davlat_nomi);
        s2 = getResources().getStringArray(R.array.poytaxt);
//        s3 = getResources().getStringArray(R.array.tasnifi);

        MyAdapter myAdapter = new MyAdapter(this,s1, s2, s3, images);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(MainActivity.this, DividerItemDecoration.VERTICAL);
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


    }
}