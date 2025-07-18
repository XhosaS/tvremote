package com.google.android.tv.remote.virtual.ui.trackpad;

import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.widget.AppCompatImageButton;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.tlv;
import defpackage.tos;
import defpackage.zdt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class RemoteButton extends AppCompatImageButton {
    private boolean a;
    public tos b;
    private final zdt c;

    public RemoteButton(Context context) {
        super(context);
        this.c = new zdt(this);
    }

    @Override // android.view.View
    protected final void dispatchSetPressed(boolean z) {
        if (this.a == z) {
            return;
        }
        this.a = z;
        if (z) {
            zdt zdtVar = this.c;
            ((View) zdtVar.b).performHapticFeedback(3);
            zdtVar.a = SystemClock.uptimeMillis();
        } else {
            zdt zdtVar2 = this.c;
            if (SystemClock.uptimeMillis() - zdtVar2.a > ViewConfiguration.getLongPressTimeout()) {
                ((View) zdtVar2.b).performHapticFeedback(3);
            }
        }
        this.b.a(z ? tlv.DOWN : tlv.UP);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i != 16) {
            return super.performAccessibilityAction(i, bundle);
        }
        this.b.a(tlv.PRESS);
        return true;
    }

    public RemoteButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new zdt(this);
    }

    public RemoteButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new zdt(this);
    }
}
