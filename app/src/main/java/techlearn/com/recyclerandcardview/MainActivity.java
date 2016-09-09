package techlearn.com.recyclerandcardview;

import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private GridLayoutManager gridLayoutManager;
    private LinearLayoutManager linearLayoutManager;
    private RecyclerView recyclerview;
    RecyclerViewAdapter recyclerViewAdapter;
    private LinearLayout itemListings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUi();

        //using grid layout manager
        gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerview.setLayoutManager(gridLayoutManager);


        //using linear layout manager
        //linearLayoutManager = new LinearLayoutManager(this);
        //recyclerview.setLayoutManager(linearLayoutManager);


        recyclerViewAdapter = new RecyclerViewAdapter(MainActivity.this);
        recyclerview.setAdapter(recyclerViewAdapter);

        populateBuySellListings();


    }

    private void initUi(){
        recyclerview = (RecyclerView) findViewById(R.id.recycler);
        itemListings= (LinearLayout) findViewById(R.id.ll_listing);
    }


    //to populate item listing card view
    private void populateBuySellListings(){
        for (int i = 0; i <3 ; i++) {
            LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View child=inflater.inflate(R.layout.listing_item, null);
            TextView txt_listing= (TextView) child.findViewById(R.id.list_item_name);
            txt_listing.setText("Item listing "+i);
            itemListings.addView(child);

        }
    }

    }


