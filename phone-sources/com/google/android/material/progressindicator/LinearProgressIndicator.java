package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.videos.R;
import defpackage.swt;
import defpackage.swu;
import defpackage.sxi;
import defpackage.sxp;
import defpackage.sxq;
import defpackage.sxr;
import defpackage.sxu;
import defpackage.sxy;
import defpackage.sxz;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class LinearProgressIndicator extends swt<sxz> {
    public LinearProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // defpackage.swt
    public final /* synthetic */ swu a(Context context, AttributeSet attributeSet) {
        return new sxz(context, attributeSet);
    }

    @Override // defpackage.swt
    public final void f(int i, boolean z) {
        swu swuVar = this.a;
        if (swuVar != null && ((sxz) swuVar).o == 0 && isIndeterminate()) {
            return;
        }
        super.f(i, false);
    }

    @Override // defpackage.swt, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        sxz sxzVar = (sxz) this.a;
        int i5 = sxzVar.p;
        boolean z2 = true;
        if (i5 != 1 && ((getLayoutDirection() != 1 || i5 != 2) && (getLayoutDirection() != 0 || i5 != 3))) {
            z2 = false;
        }
        sxzVar.q = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        sxq indeterminateDrawable = getIndeterminateDrawable();
        int i5 = i - paddingLeft;
        int i6 = i2 - paddingTop;
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, i5, i6);
        }
        sxi progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, i5, i6);
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        sxp sxyVar;
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        sxr sxrVar = new sxr((sxz) this.a);
        Context context2 = getContext();
        sxz sxzVar = (sxz) this.a;
        if (sxzVar.o == 0) {
            sxyVar = new sxu(sxzVar);
        } else {
            sxyVar = new sxy(context2, sxzVar);
        }
        setIndeterminateDrawable(new sxq(context2, sxzVar, sxrVar, sxyVar));
        setProgressDrawable(new sxi(getContext(), (sxz) this.a, sxrVar));
    }
}
