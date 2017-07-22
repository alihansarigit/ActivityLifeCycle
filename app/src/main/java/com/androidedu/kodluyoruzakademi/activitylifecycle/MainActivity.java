package com.androidedu.kodluyoruzakademi.activitylifecycle;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    String TAG ="Çalışan Method";
    @Override
    public void onContentChanged() { //
        super.onContentChanged();
        Log.e(TAG,"onContentChanged()");
    }

    int tutulacaksayi=12312;
    int tutan=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) { //
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG,"onCreate()");

    }

    @Override
    protected void onStart() { //
        super.onStart();
        Log.e(TAG,"onStart()");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.e(TAG,"onConfigurationChanged()");
    }

    @Override
    public void onAttachFragment(android.app.Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.e(TAG,"onAttachFragment()");
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        Log.e(TAG,"onAttachFragment()");

    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.e(TAG,"onRestoreInstanceState()");
        tutan = savedInstanceState.getInt("tutan");
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e(TAG,"onActivityResult()");

     /*   if(resultCode != RESULT_OK && requestCode==1) {

                VideoView videoView = ((VideoView) findViewById(R.id.videoView));
                videoView.setVideoURI(data.getData());
                videoView.setMediaController(new MediaController(this));
                videoView.requestFocus();
                videoView.start();

        }
        */
     if(resultCode!=RESULT_OK && requestCode==1)
     {
         Log.e(TAG,"reddettin");
     }
    }



    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {//
        super.onPostCreate(savedInstanceState);
        Log.e(TAG,"onPostCreate()");
    }

    @Override
    protected void onResume() {//
        super.onResume();
        Log.e(TAG,"onResume()");
    }

    @Override
    protected void onPostResume() {//
        super.onPostResume();
        Log.e(TAG,"onPostResume()");
    }

    @Override
    public void onAttachedToWindow() { //
        super.onAttachedToWindow();
        Log.e(TAG,"onAttachedToWindow()");
    }

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) { //
        Log.e(TAG,"onPrepareOptionsMenu()");
        return super.onPrepareOptionsMenu(menu);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //
        Log.e(TAG,"onCreateOptionsMenu()");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    protected void onPause() { //
        super.onPause();
        Log.e(TAG,"onPause()");
    }

    @Override
    protected void onStop() { //
        super.onStop();
        Log.e(TAG,"onStop()");
        Log.e(TAG,"onStop()");
        Log.e(TAG,"onStop()");
        Log.e(TAG,"onStop()");
        Log.e(TAG,"onStop()");
    }

    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) { //
        super.onSaveInstanceState(savedInstanceState);
        Log.e(TAG,"onSaveInstanceState()");
        savedInstanceState.putInt("tutan",tutulacaksayi);

    }

    @Override
    protected void onDestroy() { //
        super.onDestroy();
        Log.e(TAG,"onDestroy()");
    }

    @Override
    public void onUserInteraction() {//
        super.onUserInteraction();
        Log.e(TAG,"onUserInteraction()");
    }

    @Override
    protected void onUserLeaveHint() {//
        super.onUserLeaveHint();
        Log.e(TAG,"onUserLeaveHint()");
    }


    @Override
    protected void onRestart() {//
        super.onRestart();
        Log.e(TAG,"onRestart()");
    }




    @Override
    public void onBackPressed() {//
        super.onBackPressed();
        Log.e(TAG,"onBackPressed");
    }

    public void getir(View view) {
        Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
        Uri uri = Uri.parse(Environment.getExternalStorageDirectory().getPath()
                + "/myFolder/");
        intent.setDataAndType(uri, "text/csv");
        startActivityForResult(intent,1);
    }
}


/*

15- altta versiyon control tabından değişikleri göreceksiniz. default'a sağ tıklayın edit alanına comment yazın.
16- commit and push diyin.
17- Tekrar github hesabınıza geçin. PR tabına geçin ve new PullRequest 'e tıklayın.*/