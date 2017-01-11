package com.gavin.demo_status;

import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gavin.demo_status.databinding.FragTestBinding;

import me.yokeyword.fragmentation.SupportFragment;

/**
 * 这里是萌萌哒注释君
 *
 * @author gavin.xiong 2017/1/10  2017/1/10
 */
public class TestFragment extends SupportFragment {

    public static TestFragment newInstance() {
        return new TestFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return FragTestBinding.inflate(inflater, container, false).getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                start(TestFragment2.newInstance());
            }
        }, 2000);
    }
}
