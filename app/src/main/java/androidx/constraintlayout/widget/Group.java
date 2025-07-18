package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.zp;
import defpackage.zr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Group extends zp {
    public Group(Context context) {
        super(context);
    }

    @Override // defpackage.zp
    protected final void f(ConstraintLayout constraintLayout) {
        e(constraintLayout);
    }

    @Override // defpackage.zp
    public final void k() {
        zr zrVar = (zr) getLayoutParams();
        zrVar.av.B(0);
        zrVar.av.x(0);
    }

    @Override // defpackage.zp, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        d();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        d();
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
