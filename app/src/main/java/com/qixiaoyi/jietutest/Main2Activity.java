package com.qixiaoyi.jietutest;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    private ImageView mIv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mIv1 = (ImageView) findViewById(R.id.iv1);

        Intent intent = getIntent();
        byte[] bis =intent.getExtras().getByteArray("bitmap");
        Bitmap bitmap= BitmapFactory.decodeByteArray(bis, 0, bis.length);
        if (bitmap != null) {
            bitmap = Utilsmap.BoxBlurFilter(bitmap);
            getWindow().getDecorView().setBackgroundDrawable(new BitmapDrawable(bitmap));
        }
    }
}
