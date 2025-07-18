package defpackage;

import android.view.animation.Transformation;

/* compiled from: PG */
/* loaded from: classes.dex */
final class avz extends avx {
    final /* synthetic */ awc a;
    private final float b;
    private final float c;

    public avz(awc awcVar, float f, float f2) {
        this.a = awcVar;
        this.b = f;
        this.c = f2 - f;
    }

    @Override // android.view.animation.Animation
    protected final void applyTransformation(float f, Transformation transformation) {
        float f2 = this.b;
        float f3 = f * this.c;
        awc awcVar = this.a;
        awcVar.d = f2 + f3;
        awcVar.requestLayout();
    }
}
