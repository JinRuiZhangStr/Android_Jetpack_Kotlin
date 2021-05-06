package com.eflagcomm.android_jetpack_kotlin.sndemo;

import android.text.TextUtils;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.eflagcomm.android_jetpack_kotlin.R;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class PcAdapter extends BaseQuickAdapter<PcAttributeBean, BaseViewHolder> {

    public PcAdapter(int layoutResId, @Nullable List<PcAttributeBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder helper, PcAttributeBean o) {

        helper.setText(R.id.tv_pctitle, TextUtils.isEmpty(o.getPc_title())?"":o.getPc_title())
                .setText(R.id.tv_model,TextUtils.isEmpty(o.getModel())?"":o.getModel())
                .setText(R.id.tv_system,TextUtils.isEmpty(o.getSystem())?"":o.getSystem())
                .setText(R.id.tv_browser,TextUtils.isEmpty(o.getBrowser())?"":o.getBrowser())
                .setText(R.id.tv_version,TextUtils.isEmpty(o.getVersion())?"":o.getVersion());

    }

}
