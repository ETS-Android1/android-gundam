package com.arifbsetiawan.rggundamproject;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    public static final String PHOTO = "photo";
    public static final String NAME = "name";
    public static final String DETAIL = "detail";
    public static final String PRICE = "price";
    public static final String SCALE = "scale";
    public static final String RELEASE = "release";
    public static final String CODE = "code";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imgPhoto = findViewById(R.id.imgDetail);
        TextView tvName = findViewById(R.id.nameDetail);
        TextView tvDetail = findViewById(R.id.detailDetail);
        TextView tvPrice = findViewById(R.id.priceDetail);
        TextView tvScale = findViewById(R.id.scaleDetail);
        TextView tvRelease = findViewById(R.id.releaseDetail);
        TextView tvCode = findViewById(R.id.codeDetail);
        Button btnWishlist = findViewById(R.id.btn_wishlist);
        Button btnBeli = findViewById(R.id.btn_beli);

        int photo = getIntent().getIntExtra(PHOTO, 0);
        String name = getIntent().getStringExtra(NAME);
        String detail = getIntent().getStringExtra(DETAIL);
        String price = getIntent().getStringExtra(PRICE);
        String scale = getIntent().getStringExtra(SCALE);
        String release = getIntent().getStringExtra(RELEASE);
        String code = getIntent().getStringExtra(CODE);

        setActionBarTitle(name);

        imgPhoto.setImageResource(photo);
        tvName.setText(name);
        tvDetail.setText(detail);
        tvPrice.setText(price);
        tvScale.setText(scale);
        tvRelease.setText(release);
        tvCode.setText(code);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnWishlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Berhasil ditambahkan ke wishlist", Toast.LENGTH_SHORT).show();
            }
        });

        btnBeli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(), "Produk sudah habis :(", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setActionBarTitle (String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
