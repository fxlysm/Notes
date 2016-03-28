package com.fxly.notes.listener.bmob;

import com.fxly.notes.utils.NotesLog;

import java.util.List;

import cn.bmob.v3.listener.FindListener;

/**
 * Created by lgp on 2015/5/30.
 */
public class FindListenerImpl<T> extends FindListener<T> {
    @Override
    public void onSuccess(List<T> list) {

    }

    @Override
    public void onError(int i, String s) {
        NotesLog.e(s);
    }
}
