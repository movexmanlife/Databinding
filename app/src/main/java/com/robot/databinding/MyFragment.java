package com.robot.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.robot.databinding.databinding.FragmentLaosijiBinding;

public class MyFragment extends Fragment{
    FragmentLaosijiBinding laosiji;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        laosiji = DataBindingUtil.inflate(inflater, R.layout.fragment_laosiji, container, false);
        OldDriver oldDriver = new OldDriver("Xman", "吱吱");
        laosiji.setOldDriver(oldDriver);
        return laosiji.getRoot();
    }
}
