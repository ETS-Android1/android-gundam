package com.arifbsetiawan.rggundamproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvContent;
    private ArrayList<Content> list = new ArrayList<>();
    private String title = "Real Grade Gundam List";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setActionBarTitle(title);

        rvContent = findViewById(R.id.rv_content);
        rvContent.setHasFixedSize(true);

        list.addAll(ContentData.getListData());
        showRecycleList();

    }

    private void setActionBarTitle (String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showRecycleList() {
        rvContent.setLayoutManager(new LinearLayoutManager(this));
        ListContentAdapter listContentAdapter = new ListContentAdapter(list);
        rvContent.setAdapter(listContentAdapter);

        listContentAdapter.setOnItemClickCallback(new ListContentAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Content data) {
                showSelectedContent(data);

                Intent detailContent = new Intent(MainActivity.this, DetailActivity.class);
                detailContent.putExtra(DetailActivity.PHOTO, data.getPhoto());
                detailContent.putExtra(DetailActivity.NAME, data.getName());
                detailContent.putExtra(DetailActivity.DETAIL, data.getDetail());
                detailContent.putExtra(DetailActivity.PRICE, data.getPrice());
                detailContent.putExtra(DetailActivity.RELEASE, data.getRelease());
                detailContent.putExtra(DetailActivity.SCALE, data.getScale());
                detailContent.putExtra(DetailActivity.CODE, data.getCode());
                startActivity(detailContent);
            }
        });
    }

    private void showSelectedContent(Content content) {
        Toast.makeText(this, content.getName(), Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu about) {
        getMenuInflater().inflate(R.menu.about, about);
        return super.onCreateOptionsMenu(about);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        switch (selectedMode) {
            case R.id.about:
                Intent moveIntent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(moveIntent);
                break;
        }
    }
}
