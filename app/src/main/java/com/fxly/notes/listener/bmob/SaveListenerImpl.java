package com.fxly.notes.listener.bmob;

import com.fxly.notes.utils.NotesLog;

import cn.bmob.v3.listener.SaveListener;

/**
 * Created by lgp on 2015/5/30.
 */
public class SaveListenerImpl extends SaveListener {
    @Override
    public void onSuccess() {

    }

    @Override
    public void onFailure(int i, String s) {
        NotesLog.e(s);
    }
}
