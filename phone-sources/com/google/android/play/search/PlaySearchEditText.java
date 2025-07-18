package com.google.android.play.search;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class PlaySearchEditText extends EditText {
    public PlaySearchEditText(Context context) {
        super(context);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (hasFocus() && keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.handleUpEvent(keyEvent);
                }
                if (!keyEvent.isCanceled()) {
                    clearFocus();
                    return true;
                }
            }
            i = 4;
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public PlaySearchEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
