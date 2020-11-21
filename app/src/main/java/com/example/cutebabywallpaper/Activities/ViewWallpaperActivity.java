package com.example.cutebabywallpaper.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.cutebabywallpaper.Adapters.UserClass;
import com.example.cutebabywallpaper.R;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ViewWallpaperActivity extends AppCompatActivity {
    public static final String EXTR_IMAGE = "images";
    private ImageView viewImage;
    private Button setWallpaper,saveImage;
    private BitmapDrawable drawable;
    private Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_wallpaper);
        viewImage = findViewById(R.id.viewImageTv);
        setWallpaper = findViewById(R.id.setWallpaper);
        saveImage = findViewById(R.id.saveImage);

        UserClass userClass = (UserClass) getIntent().getSerializableExtra(EXTR_IMAGE);
        Glide.with(this).load(userClass.getImages()).into(viewImage);

        setWallpaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setBackgroundImage();
            }
        });
        saveImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downloadImage();
            }
        });

    }
    private void setBackgroundImage() {
        Bitmap bitmap = ((BitmapDrawable)viewImage.getDrawable()).getBitmap();
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(getApplicationContext());
        try {
            wallpaperManager.setBitmap(bitmap);
            Toast.makeText(this, "set wallpaper successfully", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
    private void downloadImage() {
        drawable = (BitmapDrawable)viewImage.getDrawable();
        bitmap = drawable.getBitmap();

        FileOutputStream outputStream = null;

        File sdCard = Environment.getExternalStorageDirectory();
        File directory = new File(sdCard.getAbsolutePath() + "/YourFolderName");
        directory.mkdir();
        String fileName = String.format("%d. jpg",System.currentTimeMillis());
        File outFile = new File(directory,fileName);

        try {
            outputStream = new FileOutputStream(outFile);
            bitmap.compress(Bitmap.CompressFormat.JPEG,100,outputStream);
            outputStream.flush();
            outputStream.close();
            Toast.makeText(this, "Image saved Successfully", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
            intent.setData(Uri.fromFile(outFile));
            sendBroadcast(intent);
        } catch (FileNotFoundException e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        } catch (IOException e) {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }

    }
}