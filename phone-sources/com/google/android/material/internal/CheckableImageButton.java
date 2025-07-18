package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.support.v7.widget.AppCompatImageButton;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.widget.Checkable;
import defpackage.cww;
import defpackage.sty;
import defpackage.stz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    private static final int[] d = {R.attr.state_checked};
    public boolean a;
    public boolean b;
    public boolean c;

    public CheckableImageButton(Context context) {
        this(context, null);
    }

    public final void a(boolean z) {
        if (this.b != z) {
            this.b = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.a;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.a ? mergeDrawableStates(super.onCreateDrawableState(i + 1), d) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof stz)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        stz stzVar = (stz) parcelable;
        super.onRestoreInstanceState(stzVar.getSuperState());
        setChecked(stzVar.a);
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        stz stzVar = new stz(super.onSaveInstanceState());
        stzVar.a = this.a;
        return stzVar;
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        if (!this.b || this.a == z) {
            return;
        }
        this.a = z;
        refreshDrawableState();
        sendAccessibilityEvent(RecyclerView.ItemAnimator.FLAG_MOVED);
    }

    @Override // android.view.View
    public final void setPressed(boolean z) {
        if (this.c) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.a);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.videos.R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = true;
        this.c = true;
        cww.p(this, new sty(this));
    }
}
