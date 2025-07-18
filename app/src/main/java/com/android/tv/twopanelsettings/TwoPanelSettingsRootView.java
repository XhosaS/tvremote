package com.android.tv.twopanelsettings;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes.dex */
public class TwoPanelSettingsRootView extends FrameLayout {
    public TwoPanelSettingsRootView(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4 && keyEvent.getKeyCode() != 19 && keyEvent.getKeyCode() != 20 && keyEvent.getKeyCode() != 21) {
            keyEvent.getKeyCode();
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public TwoPanelSettingsRootView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TwoPanelSettingsRootView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
