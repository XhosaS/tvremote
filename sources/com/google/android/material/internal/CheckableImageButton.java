package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import defpackage.bjd;
import defpackage.bje;
import defpackage.fo;
import defpackage.qv;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CheckableImageButton extends fo implements Checkable {
    private static final int[] c = {R.attr.state_checked};
    public boolean a;
    public boolean b;
    private boolean d;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.a;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.a ? mergeDrawableStates(super.onCreateDrawableState(i + 1), c) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof bje)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        bje bjeVar = (bje) parcelable;
        super.onRestoreInstanceState(bjeVar.d);
        setChecked(bjeVar.a);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        bje bjeVar = new bje(super.onSaveInstanceState());
        bjeVar.a = this.a;
        return bjeVar;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (!this.b || this.a == z) {
            return;
        }
        this.a = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        if (this.d) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.a);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.tv.remote.service.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = true;
        this.d = true;
        qv.l(this, new bjd(this));
    }
}
