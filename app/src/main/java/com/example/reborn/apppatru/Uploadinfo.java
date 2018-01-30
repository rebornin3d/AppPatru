package com.example.reborn.apppatru;

import android.app.ProgressDialog;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.StorageReference;

import static android.Manifest.permission_group.STORAGE;

/**
 * Created by reborn on 1/28/2018.
 */

public class Uploadinfo extends AppCompatActivity{

    Button btn_select_image , btn_upload;
    ImageView user_image;
    TextView title;




    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.upload_layout);

        btn_select_image = (Button)findViewById(R.id.btn_select_image);
        btn_upload = (Button)findViewById(R.id.btn_upload);
        user_image = (ImageView)findViewById(R.id.user_image);
        title = (TextView)findViewById(R.id.etTitle);



    }
}
