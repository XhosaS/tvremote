package com.google.android.tv.remote.virtual.ui.assistant;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.common.collect.ImmutableSet;
import defpackage.czi;
import defpackage.ith;
import defpackage.iua;
import defpackage.ivd;
import defpackage.iwu;
import defpackage.nby;
import defpackage.nca;
import defpackage.ndh;
import defpackage.ndl;
import defpackage.pku;
import defpackage.toa;
import defpackage.zft;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class VirtualRemoteAssistantButton extends FrameLayout {
    public static final ImmutableSet a = ImmutableSet.of("com.google.android.katniss", "com.google.android.youtube.tv");
    public final nby b;
    public volatile int c;
    public pku d;
    private boolean e;
    private long f;

    public VirtualRemoteAssistantButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final boolean a() {
        return this.b.e != 17;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchSetPressed(boolean z) {
        ith ithVarE;
        iwu iwuVar;
        if (!z) {
            if (this.e || !a() || SystemClock.uptimeMillis() - this.f <= 1000) {
                return;
            }
            this.d.j();
            return;
        }
        this.f = SystemClock.uptimeMillis();
        if (a()) {
            this.e = true;
            this.d.j();
            return;
        }
        this.e = false;
        ivd ivdVar = (ivd) this.d.a;
        if (czi.b(ivdVar.b, "android.permission.RECORD_AUDIO") != 0 || (ithVarE = ivdVar.c.e()) == null || (iwuVar = ((iua) ithVarE).j) == null) {
            return;
        }
        iwuVar.d();
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (i != 16) {
            return super.performAccessibilityAction(i, bundle);
        }
        dispatchSetPressed(true);
        callOnClick();
        return true;
    }

    public VirtualRemoteAssistantButton(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public VirtualRemoteAssistantButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, toa.a, i, i2);
        nca ncaVar = new nca();
        ncaVar.e = new zft(this);
        nby nbyVar = new nby(context);
        this.b = nbyVar;
        nbyVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ndh ndhVar = nbyVar.d;
        ndhVar.h.put(2, ncaVar);
        if (ndhVar.i == 2) {
            ncaVar.a();
        }
        nbyVar.e(17, true);
        addView(nbyVar);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            int color = typedArrayObtainStyledAttributes.getColor(0, 0);
            Iterator<ndl> it = nbyVar.a.iterator();
            while (it.hasNext()) {
                it.next().l = color;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        setClickable(true);
    }
}
