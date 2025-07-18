package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.cqc;
import defpackage.cqe;

/* compiled from: PG */
/* loaded from: classes.dex */
public class Group extends cqc {
    public Group(Context context) {
        super(context);
    }

    @Override // defpackage.cqc
    protected final void g(ConstraintLayout constraintLayout) {
        f(constraintLayout);
    }

    @Override // defpackage.cqc
    public final void l() {
        cqe cqeVar = (cqe) getLayoutParams();
        cqeVar.av.E(0);
        cqeVar.av.z(0);
    }

    @Override // defpackage.cqc, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        e();
    }

    @Override // android.view.View
    public final void setElevation(float f) {
        super.setElevation(f);
        e();
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        e();
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
