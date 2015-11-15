package com.example.zq.sharere;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ShareSDK.initSDK(getApplicationContext());

        setContentView(R.layout.activity_main);
    }


    public void share(View view) {
        OnekeyShare oks = new OnekeyShare();

        //取消sso授权
        oks.disableSSOWhenAuthorize();
        oks.setTitle("zq share");

        oks.setText("我用技术代言");

        oks.setImageUrl("http://dashboard.mob.com/Assets/images/pic-a-1.png");

        oks.show(MainActivity.this);

    }
}
