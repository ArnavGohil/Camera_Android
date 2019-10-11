package com.example.mltrial2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.widget.ImageView;

public class PreviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);



        ImageView imageView=findViewById(R.id.imageView);
        
        Bitmap bmp = BitmapFactory.decodeFile(String.valueOf(MainActivity.file));

        Matrix matrix = new Matrix();

        matrix.postRotate(90);

        Bitmap rotatedBitmap = Bitmap.createBitmap(bmp, 0, 0, bmp.getWidth(), bmp.getHeight(), matrix, true);

        imageView.setImageBitmap(rotatedBitmap);
    }
}
