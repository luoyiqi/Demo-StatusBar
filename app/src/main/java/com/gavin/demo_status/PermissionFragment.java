package com.gavin.demo_status;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gavin.demo_status.databinding.FragPermissionBinding;

import me.yokeyword.fragmentation.SupportFragment;

/**
 * 这里是萌萌哒注释君
 *
 * @author gavin.xiong 2017/1/11  2017/1/11
 */
public class PermissionFragment extends SupportFragment {

    public static SupportFragment newInstance() {
        return new PermissionFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return FragPermissionBinding.inflate(inflater, container, false).getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                start(TestFragment.newInstance());
            }
        }, 2000);
    }

}
