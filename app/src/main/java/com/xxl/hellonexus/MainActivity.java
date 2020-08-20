package com.xxl.hellonexus;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.xxl.common.TestUtils;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int random = TestUtils.getRandom();
        TextView tvText = findViewById(R.id.tv_test);
        tvText.setText(String.valueOf(random));
        tvText.setText(String.valueOf(TestUtils.currentTimeMillis()));

        tvText.setOnClickListener(view -> {
            startFlutterActivity();
        });
    }

    /**
     * 跳转Flutter页面
     */
    private void startFlutterActivity() {
        startActivity(FlutterActivity.withCachedEngine(MyApplication.FLUTTER_ENGINE_ID)
                .build(this)
        );
    }

}
