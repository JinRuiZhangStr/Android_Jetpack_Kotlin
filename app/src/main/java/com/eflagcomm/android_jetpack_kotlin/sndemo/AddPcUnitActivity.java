package com.eflagcomm.android_jetpack_kotlin.sndemo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.eflagcomm.android_jetpack_kotlin.R;

public class AddPcUnitActivity extends AppCompatActivity {

    private EditText editModel;
    private EditText editSystem;
    private EditText editBrowser;
    private EditText editVersion;
    private Button btnSure;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addunit);
        initView();
    }

    private void initView() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(v -> finish());

        editModel = findViewById(R.id.edit_model);
        editSystem = findViewById(R.id.edit_system);
        editBrowser = findViewById(R.id.edit_browser);
        editVersion = findViewById(R.id.edit_version);

        btnSure = findViewById(R.id.btn_sure);

        btnSure.setOnClickListener(v -> {
            PcAttributeBean bean = new PcAttributeBean();
            bean.setPc_title(editModel.getText().toString());
            bean.setModel(editModel.getText().toString());
            bean.setSystem(editSystem.getText().toString());
            bean.setBrowser(editBrowser.getText().toString());
            bean.setVersion(editVersion.getText().toString());

            Intent intent = new Intent();
            intent.putExtra("pcUnit",bean);
            setResult(RESULT_OK,intent);
            finish();

        });
    }
}
