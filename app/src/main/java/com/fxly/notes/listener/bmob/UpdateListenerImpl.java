package com.fxly.notes.listener.bmob;

import com.fxly.notes.utils.NotesLog;

import cn.bmob.v3.listener.UpdateListener;

/**
 * Created by lgp on 2015/5/30.
 */
public class UpdateListenerImpl extends UpdateListener {
    @Override
    public void onSuccess() {

    }

    @Override
    public void onFailure(int i, String s) {
        NotesLog.e(s);

    }
}
