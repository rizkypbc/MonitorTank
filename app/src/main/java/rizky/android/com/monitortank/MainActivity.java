package rizky.android.com.monitortank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AdapterTanki adapterTanki;
    private ArrayList<Tanki> tankiArrayList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        addData();

        recyclerView = (RecyclerView)findViewById (R.id.recyclerView);
        adapterTanki = new AdapterTanki (tankiArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager (MainActivity.this);  
        recyclerView.setLayoutManager (layoutManager);
        recyclerView.setAdapter (adapterTanki);
    }

    void addData(){

        tankiArrayList = new ArrayList<> ();
        tankiArrayList.add (new Tanki ("STO Balikpapan Centrum", R.drawable.tanki_14732));
        tankiArrayList.add (new Tanki ("STO Balikpapan Baru", R.drawable.tanki_rec));
    }
}
