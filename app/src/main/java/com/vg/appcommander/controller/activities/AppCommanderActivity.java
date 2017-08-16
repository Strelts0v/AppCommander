package com.vg.appcommander.controller.activities;

import android.support.v4.app.Fragment;

import com.vg.appcommander.controller.activities.templates.SingleFragmentActivity;
import com.vg.appcommander.controller.fragments.AppCommanderFragment;

public class AppCommanderActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return AppCommanderFragment.newInstance();
    }
}
