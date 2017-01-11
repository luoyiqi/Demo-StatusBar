package com.gavin.demo_status;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gavin.demo_status.databinding.FragTest2Binding;
import com.gavin.demo_status.databinding.FragTestBinding;

import me.yokeyword.fragmentation.SupportFragment;

/**
 * 这里是萌萌哒注释君
 *
 * @author gavin.xiong 2017/1/10  2017/1/10
 */
public class TestFragment2 extends SupportFragment {

    public static SupportFragment newInstance() {
        return new TestFragment2();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return FragTest2Binding.inflate(inflater, container, false).getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
