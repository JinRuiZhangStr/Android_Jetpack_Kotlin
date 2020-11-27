package com.eflagcomm.android_jetpack_kotlin.sndemo;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.eflagcomm.android_jetpack_kotlin.R;

import java.util.ArrayList;

public class PcListActivity extends AppCompatActivity {

    private RecyclerView recy;
    private Toolbar toolbar;
    private ArrayList<PcAttributeBean> pcList = new ArrayList();
    private PcAdapter pcAdapter;
    private Button btnAdd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pc_list);
        initView();
        initRecyAdapter();
    }

    private void initView() {
        toolbar = findViewById(R.id.toolbar);
        toolbar.setNavigationOnClickListener(v -> {
            finish();
        });
        recy = findViewById(R.id.recy);
        btnAdd = findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(v -> {
            Intent intent = new Intent(PcListActivity.this,AddPcUnitActivity.class);
            startActivityForResult(intent,10000);
        });
    }

    private void initRecyAdapter() {
        LinearLayoutManager layoutManager = new  LinearLayoutManager(this);
        recy.setLayoutManager(layoutManager);
        pcAdapter = new PcAdapter(R.layout.item_pc,pcList);
        recy.setAdapter(pcAdapter);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK){
            PcAttributeBean pcUnit = (PcAttributeBean) data.getSerializableExtra("pcUnit");
            pcList.add(pcUnit);
            pcAdapter.notifyDataSetChanged();

        }
    }
}
